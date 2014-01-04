package org.applause.lang.ui.builder;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Maps.uniqueIndex;
import static com.google.common.collect.Sets.newLinkedHashSet;
import static org.applause.lang.ui.builder.OutputFolderComputer.getContainer;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.DerivedResourceMarkers.GeneratorIdProvider;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess;
import org.eclipse.xtext.generator.IDerivedResourceMarkers;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Copy of BuilderParticipant with some patches for resolving project-relative path names.
 *  
 * @author Sven Efftinge - Initial contribution and API
 * @author Michael Clay
 * @since 2.1
 */
public class ApplauseBuilderParticipant implements IXtextBuilderParticipant {
	
	private final static Logger logger = Logger.getLogger(ApplauseBuilderParticipant.class);
	
	@Inject
	private Provider<ApplauseEclipseResourceFileSystemAccess2> fileSystemAccessProvider;
	
	@Inject
	private IGenerator generator;
	
	@Inject
	private IResourceServiceProvider resourceServiceProvider;
	
	@Inject
	private IStorage2UriMapper storage2UriMapper;
	
	@Inject
	private IDerivedResourceMarkers derivedResourceMarkers;
	
 	@Inject
 	private GeneratorIdProvider generatorIdProvider;
	
	private EclipseOutputConfigurationProvider outputConfigurationProvider;
	private BuilderPreferenceAccess builderPreferenceAccess;

	/**
	 * @since 2.4
	 */
	protected IDerivedResourceMarkers getDerivedResourceMarkers(){
		return derivedResourceMarkers;
	}

	/**
	 * @since 2.4
	 */
	protected GeneratorIdProvider getGeneratorIdProvider(){
		return generatorIdProvider;
	}

	/**
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public BuilderPreferenceAccess getBuilderPreferenceAccess() {
		return builderPreferenceAccess;
	}

	/**
	 * @nooverride This method is not intended to be re-implemented or extended by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	@Inject
	public void setBuilderPreferenceAccess(BuilderPreferenceAccess builderPreferenceAccess) {
		this.builderPreferenceAccess = builderPreferenceAccess;
	}
	
	public EclipseOutputConfigurationProvider getOutputConfigurationProvider() {
		return outputConfigurationProvider;
	}
	
	/**
	 * @since 2.2
	 */
	public IGenerator getGenerator() {
		return generator;
	}
	
	/**
	 * @since 2.2
	 */
	public IResourceServiceProvider getResourceServiceProvider() {
		return resourceServiceProvider;
	}

	@Inject
	public void setOutputConfigurationProvider(EclipseOutputConfigurationProvider outputConfigurationProvider) {
		this.outputConfigurationProvider = outputConfigurationProvider;
	}

	/**
	 * @since 2.4
	 */
	protected Map<OutputConfiguration, Iterable<IMarker>> getGeneratorMarkers(IProject builtProject, Collection<OutputConfiguration> outputConfigurations) throws CoreException{
		Map<OutputConfiguration, Iterable<IMarker>> generatorMarkers = newHashMap();
		for (OutputConfiguration config : outputConfigurations) {
			if (config.isCleanUpDerivedResources()) {
				IContainer container = getContainer(builtProject, config.getOutputDirectory());
				final Iterable<IMarker> markers = derivedResourceMarkers.findDerivedResourceMarkers(container, generatorIdProvider.getGeneratorIdentifier());
				generatorMarkers.put(config, markers);
			}
		}
		return generatorMarkers;
	}

	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		if (!isEnabled(context)) {
			return;
		}
		
        final List<IResourceDescription.Delta> deltas = getRelevantDeltas(context);
        if (deltas.isEmpty()) {
            return;
        }

		final int numberOfDeltas = deltas.size();
		
		// monitor handling
		if (monitor.isCanceled())
			throw new OperationCanceledException();
		SubMonitor subMonitor = SubMonitor.convert(monitor, numberOfDeltas + 3);
		
		ApplauseEclipseResourceFileSystemAccess2 access = fileSystemAccessProvider.get();
		final IProject builtProject = context.getBuiltProject();
		access.setProject(builtProject);
		final Map<String, OutputConfiguration> outputConfigurations = getOutputConfigurations(context);
		refreshOutputFolders(context, outputConfigurations, subMonitor.newChild(1));
		access.setOutputConfigurations(outputConfigurations);
		if (context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
			SubMonitor cleanMonitor = SubMonitor.convert(subMonitor.newChild(1), outputConfigurations.size());
			for (OutputConfiguration config : outputConfigurations.values()) {
				cleanOutput(context, config, access, cleanMonitor.newChild(1));
			}
			if (context.getBuildType() == BuildType.CLEAN)
				return;
		}
		Map<OutputConfiguration, Iterable<IMarker>> generatorMarkers = getGeneratorMarkers(builtProject, outputConfigurations.values());
		for (int i = 0 ; i < numberOfDeltas ; i++) {
			final IResourceDescription.Delta delta = deltas.get(i);
			
			// monitor handling
			if (subMonitor.isCanceled())
				throw new OperationCanceledException();
			subMonitor.subTask("Compiling "+delta.getUri().lastSegment()+" ("+i+" of "+numberOfDeltas+")");
			access.setMonitor(subMonitor.newChild(1));
			
			final String uri = delta.getUri().toString();
			final Set<IFile> derivedResources = newLinkedHashSet();
			for (OutputConfiguration config : outputConfigurations.values()) {
				if (config.isCleanUpDerivedResources()) {
					Iterable<IMarker> markers = generatorMarkers.get(config);
					for (IMarker marker : markers) {
						String source = derivedResourceMarkers.getSource(marker);
						if (source != null && source.equals(uri))
							derivedResources.add((IFile) marker.getResource());
					}
				}
			}
			access.setPostProcessor(new ApplauseEclipseResourceFileSystemAccess2.IFileCallback() {
				
				public boolean beforeFileDeletion(IFile file) {
					derivedResources.remove(file);
					context.needRebuild();
					return true;
				}
				
				public void afterFileUpdate(IFile file) {
					handleFileAccess(file);
				}

				public void afterFileCreation(IFile file) {
					handleFileAccess(file);
				}
				
				protected void handleFileAccess(IFile file) {
					try {
						derivedResources.remove(file);
						derivedResourceMarkers.installMarker(file, uri);
						context.needRebuild();
					} catch (CoreException e) {
						throw new RuntimeException(e);
					}
				}
				
			});
			if (delta.getNew() != null) {
				try {
					handleChangedContents(delta, context, access);
				} catch (OperationCanceledException e) {
					throw e;
				} catch (Exception e) {
					logger.error("Error during compilation of '"+delta.getUri()+"'.", e);
				}
			}
			access.flushSourceTraces();
			SubMonitor deleteMonitor = SubMonitor.convert(subMonitor.newChild(1), derivedResources.size());
			for (IFile iFile : newLinkedHashSet(derivedResources)) {
				IMarker marker = derivedResourceMarkers.findDerivedResourceMarker(iFile, uri);
				if (marker != null)
					marker.delete();
				if (derivedResourceMarkers.findDerivedResourceMarkers(iFile).length == 0) {
					access.deleteFile(iFile, deleteMonitor);
					context.needRebuild();
				}
			}
		}
	}

	protected boolean isEnabled(final IBuildContext context) {
		return builderPreferenceAccess.isAutoBuildEnabled(context.getBuiltProject());
	}
	
    /**
	 * @since 2.3
	 */
    protected List<IResourceDescription.Delta> getRelevantDeltas(IBuildContext context) {
        List<IResourceDescription.Delta> result = newArrayList();
        for (IResourceDescription.Delta delta : context.getDeltas()) {
            if (resourceServiceProvider.canHandle(delta.getUri()))
                result.add(delta);
        }
        return result;
    }
	
	protected void refreshOutputFolders(IBuildContext ctx, Map<String, OutputConfiguration> outputConfigurations, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, outputConfigurations.size());
		for (OutputConfiguration config : outputConfigurations.values()) {
			SubMonitor child = subMonitor.newChild(1);
			final IProject project = ctx.getBuiltProject();
			IContainer container = getContainer(project, config.getOutputDirectory());
			container.refreshLocal(IResource.DEPTH_INFINITE, child);
		}
	}

	protected void cleanOutput(IBuildContext ctx, OutputConfiguration config, IProgressMonitor monitor) throws CoreException {
		cleanOutput(ctx, config, null, monitor);
	}

	/**
	 * @since 2.5
	 */
	protected void cleanOutput(IBuildContext ctx, OutputConfiguration config, ApplauseEclipseResourceFileSystemAccess2 access, IProgressMonitor monitor) throws CoreException {
		final IProject project = ctx.getBuiltProject();
		IContainer container = getContainer(project, config.getOutputDirectory());
		if (!container.exists()) {
			return;
		}
		if (config.isCanClearOutputDirectory()) {
			for (IResource resource : container.members()) {
				if (!config.isKeepLocalHistory()) {
					resource.delete(IResource.NONE, monitor);
				} else if (access == null) {
					resource.delete(IResource.KEEP_HISTORY, monitor);
				} else {
					delete(resource, config, access, monitor);
				}
			}
		} else if (config.isCleanUpDerivedResources()) {
			List<IFile> resources = derivedResourceMarkers.findDerivedResources(container, null);
			for (IFile iFile : resources) {
				if (access != null) {
					access.deleteFile(iFile, config.getName(), monitor);
				} else {
					iFile.delete(config.isKeepLocalHistory() ? IResource.KEEP_HISTORY : IResource.NONE, monitor);	
				}
			}
		}
	}
	
	private void delete(IResource resource, OutputConfiguration config, ApplauseEclipseResourceFileSystemAccess2 access, IProgressMonitor monitor) throws CoreException {
		if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			for (IResource child : container.members()) {
				delete(child, config, access, monitor);
			}
			container.delete(IResource.KEEP_HISTORY, monitor);
		} else if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			access.deleteFile(file, config.getName(), monitor);
		} else {
			resource.delete(IResource.KEEP_HISTORY, monitor);
		}
	}

	protected void handleChangedContents(Delta delta, IBuildContext context, ApplauseEclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
		// TODO: we will run out of memory here if the number of deltas is large enough
		Resource resource = context.getResourceSet().getResource(delta.getUri(), true);
		if (shouldGenerate(resource, context)) {
			try {
				generator.doGenerate(resource, fileSystemAccess);
			} catch (RuntimeException e) {
				if (e.getCause() instanceof CoreException) {
					throw (CoreException) e.getCause();
				}
				throw e;
			}
		}
	}

	protected boolean shouldGenerate(Resource resource, IBuildContext context) {
		try {
			Iterable<Pair<IStorage, IProject>> storages = storage2UriMapper.getStorages(resource.getURI());
			for (Pair<IStorage, IProject> pair : storages) {
				if (pair.getFirst() instanceof IFile && pair.getSecond().equals(context.getBuiltProject())) {
					IFile file = (IFile) pair.getFirst();
					return file.findMaxProblemSeverity(null, true, IResource.DEPTH_INFINITE) != IMarker.SEVERITY_ERROR;
				}
			}
			return false;
		} catch (CoreException exc) {
			throw new WrappedException(exc);
		}
	}

	protected Map<String,OutputConfiguration> getOutputConfigurations(IBuildContext context) {
		Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations(context.getBuiltProject());
		return uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			public String apply(OutputConfiguration from) {
				return from.getName();
			}
		});
	}
	
}
