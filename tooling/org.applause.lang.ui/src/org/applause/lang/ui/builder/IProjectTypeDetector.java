package org.applause.lang.ui.builder;

import org.eclipse.core.resources.IProject;

public interface IProjectTypeDetector {

	public abstract boolean canBuildProject(IProject project);

}