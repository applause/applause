package org.applause.lang.ui.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.Inject;

public class ProjectTypeAwareBuilderParticipant extends org.eclipse.xtext.builder.BuilderParticipant {
	
	@Inject
	private IProjectTypeDetector projectTypeDetector;
	
	protected boolean canBuildProject(IProject project) {
		if (projectTypeDetector != null) {
			return projectTypeDetector.canBuildProject(project);
		}
		else return true;
	}
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		if (canBuildProject(context.getBuiltProject())) {
			super.build(context, monitor);
		}
	}

}
