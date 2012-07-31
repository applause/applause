package org.applause.lang.ui.builder;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.StringInputStream;

/**
 * A FixedEclipseResourceFileSystemAccess2.
 */
public class FixedEclipseResourceFileSystemAccess2 extends EclipseResourceFileSystemAccess2 {
	/** The {@link IProject}. */
	private IProject project;

	/** The {@link IProgressMonitor}. */
	private IProgressMonitor monitor;

	/** The {@link org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2.IFileCallback}. */
	private IFileCallback callBack;

	@Override
	// FIX START
	protected void ensureExists(final IContainer container) throws CoreException {
		if (container.exists()) {
			return;
		}
		if (container instanceof IFolder) {
			ensureExists(container.getParent());
			((IFolder) container).create(true, true, monitor);
		} else if (container instanceof IProject) {
			final IProject containerProject = (IProject) container;
			containerProject.create(monitor);
			containerProject.open(monitor);
		}
		// FIX END
	}

	@Override
	public void generateFile(final String fileName, final String outputName, final CharSequence contents) {
		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		final OutputConfiguration outputConfig = getOutputConfig(outputName);
		// FIX START
		// check output container exists
		final IResource member = project.findMember(outputConfig.getOutputDirectory());
		if (!(member instanceof IContainer)) {
			return;
		}
		final IContainer container = (IContainer) member;
		if (!container.exists()) {
			if (outputConfig.isCreateOutputDirectory()) {
				try {
					ensureExists(container);
				} catch (final CoreException e) {
					throw new RuntimeException(e);
				}
			} else {
				return;
			}
		}
		// FIX END

		final IFile file = getFile(fileName, outputName);
		final String contentsAsString = contents.toString();
		try {
			// ensure that parents exist before checking if the file exists
			// because if a project needs to be created and opened, it might be that the file suddenly exists
			// (it was on disk but not added to the workspace)
			ensureParentExists(file);
		} catch (final CoreException exception) {
			throw new RuntimeException(exception);
		}
		if (file.exists()) {
			if (outputConfig.isOverrideExistingResources()) {
				try {
					final StringInputStream newContent = getInputStream(contentsAsString, file.getCharset(true));
					if (hasContentsChanged(file, newContent)) {
						// reset to offset zero allows to reuse internal byte[]
						// no need to convert the string twice
						newContent.reset();
						file.setContents(newContent, true, true, monitor);
						if (file.isDerived() != outputConfig.isSetDerivedProperty()) {
							file.setDerived(outputConfig.isSetDerivedProperty(), monitor);
						}
					}
				} catch (final CoreException e) {
					throw new RuntimeException(e);
				}
				callBack.afterFileUpdate(file);
			}
		} else {
			try {
				file.create(getInputStream(contentsAsString, file.getCharset(true)), true, monitor);
				if (outputConfig.isSetDerivedProperty()) {
					file.setDerived(true, monitor);
				}
			} catch (final CoreException e) {
				throw new RuntimeException(e);
			}
			callBack.afterFileCreation(file);
		}
	}

	@Override
	protected IFile getFile(final String fileName, final String outputName) {
		final OutputConfiguration configuration = getOutputConfig(outputName);
		// FIX START
		return project.getFile(new Path(configuration.getOutputDirectory()).addTrailingSeparator().append(fileName));
		// FIX END
	}

	@Override
	public void setMonitor(final IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public void setPostProcessor(final IFileCallback postProcessor) {
		this.callBack = postProcessor;
	}

	@Override
	public void setProject(final IProject project) {
		this.project = project;
		super.setProject(project);
	}
}