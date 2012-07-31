package org.applause.lang.ui.builder;

import static com.google.common.collect.Sets.newLinkedHashSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.DerivedResourceMarkers;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * A FixedBuilderParticipant, that also supports output configurations on the project level.
 */
public class FixedBuilderParticipant extends BuilderParticipant {
	/** The {@link DerivedResourceMarkers}. */
	@Inject
	private DerivedResourceMarkers derivedResourceMarkers;
	/** The {@link EclipseResourceFileSystemAccess2}. */
	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;

	@Override
	public void build(final IBuildContext context, final IProgressMonitor monitor) throws CoreException {
		if (!isEnabled(context)) {
			return;
		}
		final int numberOfDeltas = context.getDeltas().size();

		// monitor handling
		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		final SubMonitor subMonitor = SubMonitor.convert(monitor, numberOfDeltas + 3);

		final EclipseResourceFileSystemAccess2 access = fileSystemAccessProvider.get();
		final IProject builtProject = context.getBuiltProject();
		access.setProject(builtProject);
		final Map<String, OutputConfiguration> outputConfigurations = getOutputConfigurations(context);
		refreshOutputFolders(context, outputConfigurations, subMonitor.newChild(1));
		access.setOutputConfigurations(outputConfigurations);
		if (context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
			final SubMonitor cleanMonitor = SubMonitor.convert(subMonitor.newChild(1), outputConfigurations.size());
			for (final OutputConfiguration config : outputConfigurations.values()) {
				cleanOutput(context, config, cleanMonitor.newChild(1));
			}
			if (context.getBuildType() == BuildType.CLEAN) {
				return;
			}
		}
		for (int i = 0; i < numberOfDeltas; i++) {
			final IResourceDescription.Delta delta = context.getDeltas().get(i);

			// monitor handling
			if (subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			subMonitor.subTask("Compiling " + delta.getUri().lastSegment() + " (" + i + " of " + numberOfDeltas + ")");
			access.setMonitor(subMonitor.newChild(1));

			final String uri = delta.getUri().toString();
			final Set<IFile> derivedResources = newLinkedHashSet();
			for (final OutputConfiguration config : outputConfigurations.values()) {
				if (config.isCleanUpDerivedResources()) {
					// FIX START root folder output directory
					final IResource member = builtProject.findMember(config.getOutputDirectory());
					if (!(member instanceof IContainer)) {
						continue;
					}
					final List<IFile> resources = derivedResourceMarkers.findDerivedResources((IContainer) member, uri);
					// FIX END root folder output directory
					derivedResources.addAll(resources);
				}
			}
			access.setPostProcessor(new EclipseResourceFileSystemAccess2.IFileCallback() {

				@Override
				public void afterFileCreation(final IFile file) {
					handleFileAccess(file);
				}

				@Override
				public void afterFileUpdate(final IFile file) {
					handleFileAccess(file);
				}

				@Override
				public boolean beforeFileDeletion(final IFile file) {
					derivedResources.remove(file);
					context.needRebuild();
					return true;
				}

				protected void handleFileAccess(final IFile file) {
					try {
						derivedResources.remove(file);
						derivedResourceMarkers.installMarker(file, uri);
						context.needRebuild();
					} catch (final CoreException e) {
						throw new RuntimeException(e);
					}
				}

			});
			if (delta.getNew() != null) {
				handleChangedContents(delta, context, access);
			}
			final SubMonitor deleteMonitor = SubMonitor.convert(subMonitor.newChild(1), derivedResources.size());
			for (final IFile iFile : derivedResources) {
				if (!iFile.isDerived()) {
					continue;
				}
				final IMarker marker = derivedResourceMarkers.findDerivedResourceMarker(iFile, uri);
				if (marker != null) {
					marker.delete();
				}
				if (derivedResourceMarkers.findDerivedResourceMarkers(iFile).length == 0) {
					iFile.delete(IResource.KEEP_HISTORY, deleteMonitor.newChild(1));
					context.needRebuild();
				}
			}
		}
	}

	/** {@inheritDoc} */
	@Override
	protected void cleanOutput(final IBuildContext ctx, final OutputConfiguration config, final IProgressMonitor monitor) throws CoreException {
		final IProject project = ctx.getBuiltProject();
		// FIX START root folder output directory
		final IResource member = project.findMember(config.getOutputDirectory());
		if (!member.exists() || !(member instanceof IContainer)) {
			return;
		}
		final IContainer container = (IContainer) member;
		if (config.isCanClearOutputDirectory()) {
			for (final IResource resource : container.members()) {
				resource.delete(IResource.KEEP_HISTORY, monitor);
			}
		} else {
			if (config.isCleanUpDerivedResources()) {
				final List<IFile> resources = derivedResourceMarkers.findDerivedResources(container, null);
				for (final IFile iFile : resources) {
					// FIX START derived resources
					if (iFile.isDerived()) {
						iFile.delete(IResource.KEEP_HISTORY, monitor);
					}
					// FIX END derived resources
				}
			}
		}
		// FIX END root folder output directory
	}

	/** {@inheritDoc} */
	@Override
	protected void refreshOutputFolders(final IBuildContext ctx, final Map<String, OutputConfiguration> outputConfigurations, final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, outputConfigurations.size());
		for (final OutputConfiguration config : outputConfigurations.values()) {
			final SubMonitor child = subMonitor.newChild(1);
			final IProject project = ctx.getBuiltProject();
			final IResource resource = project.findMember(config.getOutputDirectory());
			if (resource != null) {
				resource.refreshLocal(IResource.DEPTH_INFINITE, child);
			}
		}
	}
}