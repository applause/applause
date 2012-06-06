package org.applause.lang.generator.wp7.ui;

import org.applause.lang.ui.builder.IProjectTypeDetector;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public class WP7ProjectTypeDetector implements IProjectTypeDetector {

	@Override
	public boolean canBuildProject(IProject project) {
		IFile file = project.getFile("main.m");
		return file.exists();
	}

}
