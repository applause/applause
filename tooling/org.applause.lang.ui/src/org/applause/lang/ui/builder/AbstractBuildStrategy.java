package org.applause.lang.ui.builder;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Maps.uniqueIndex;
import static com.google.common.collect.Sets.newLinkedHashSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.BuildType;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;
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


public abstract class  AbstractBuildStrategy implements IBuildStrategy {

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;
	
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

	private IProject platformProject;
	
	public EclipseOutputConfigurationProvider getOutputConfigurationProvider() {
		return outputConfigurationProvider;
	}
	
	public IGenerator getGenerator() {
		return generator;
	}
	
	public IResourceServiceProvider getResourceServiceProvider() {
		return resourceServiceProvider;
	}

	@Inject
	public void setOutputConfigurationProvider(EclipseOutputConfigurationProvider outputConfigurationProvider) {
		this.outputConfigurationProvider = outputConfigurationProvider;
	}
	
	public void setPlatformProject(IProject platformProject) {
		this.platformProject = platformProject;
	}
	
	public IProject getPlatformProject() {
		return platformProject;
	}

	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		// first, figure out if the strategy is responsible for generating code for this project
		if (canBuildProject()) {
			final List<IResourceDescription.Delta> deltas = getRelevantDeltas(context);
			if (deltas.isEmpty()) {
				return;
			}
			
			final int numberOfDeltas = deltas.size();
			
			// monitor handling
			if (monitor.isCanceled())
				throw new OperationCanceledException();
			SubMonitor subMonitor = SubMonitor.convert(monitor, numberOfDeltas + 3);
			
			EclipseResourceFileSystemAccess2 access = fileSystemAccessProvider.get();
			access.setProject(platformProject);
			final Map<String, OutputConfiguration> outputConfigurations = getOutputConfigurations(context);
			refreshOutputFolders(outputConfigurations, subMonitor.newChild(1));
			access.setOutputConfigurations(outputConfigurations);
			if (context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
				SubMonitor cleanMonitor = SubMonitor.convert(subMonitor.newChild(1), outputConfigurations.size());
				for (OutputConfiguration config : outputConfigurations.values()) {
					cleanOutput(config, cleanMonitor.newChild(1));
				}
				if (context.getBuildType() == BuildType.CLEAN)
					return;
			}
			
			Map<OutputConfiguration, Iterable<IMarker>> generatorMarkers = newHashMap();
			for (OutputConfiguration config : outputConfigurations.values()) {
				if (config.isCleanUpDerivedResources()) {
					final IFolder outputFolder = platformProject.getFolder(config.getOutputDirectory());
					final Iterable<IMarker> markers = derivedResourceMarkers.findDerivedResourceMarkers(outputFolder, generatorIdProvider.getGeneratorIdentifier());
					generatorMarkers.put(config, markers);
				}
			}
			
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
				access.setPostProcessor(new EclipseResourceFileSystemAccess2.IFileCallback() {
					
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
					handleChangedContents(delta, context, access);
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
	}

    protected List<IResourceDescription.Delta> getRelevantDeltas(IBuildContext context) {
        List<IResourceDescription.Delta> result = newArrayList();
        for (IResourceDescription.Delta delta : context.getDeltas()) {
            if (resourceServiceProvider.canHandle(delta.getUri()))
                result.add(delta);
        }
        return result;
    }
	
	protected void refreshOutputFolders(Map<String, OutputConfiguration> outputConfigurations, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, outputConfigurations.size());
		for (OutputConfiguration config : outputConfigurations.values()) {
			SubMonitor child = subMonitor.newChild(1);
			IFolder folder = platformProject.getFolder(config.getOutputDirectory());
			folder.refreshLocal(IResource.DEPTH_INFINITE, child);
		}
	}

	protected void cleanOutput(OutputConfiguration config, IProgressMonitor monitor) throws CoreException {
		IFolder folder = platformProject.getFolder(config.getOutputDirectory());
		if (!folder.exists())
			return;
		if (config.isCanClearOutputDirectory()) {
			for (IResource resource : folder.members())
				resource.delete(IResource.KEEP_HISTORY, monitor);
		} else {
			if (config.isCleanUpDerivedResources()) {
				List<IFile> resources = derivedResourceMarkers.findDerivedResources(folder, null);
				for (IFile iFile : resources) {
					iFile.delete(IResource.KEEP_HISTORY, monitor);
				}
			}
		}
	}
	
	protected void handleChangedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
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