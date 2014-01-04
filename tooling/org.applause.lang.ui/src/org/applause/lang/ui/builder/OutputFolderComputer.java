package org.applause.lang.ui.builder;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;

import com.google.common.base.Preconditions;

public class OutputFolderComputer {
	
	private static String replaceVariables(IProject project, String path) {
		return path.replaceAll("\\$PROJECTNAME\\$", project.getName());
	}
	
	public static IContainer getContainer(IProject project, String path) {
		Preconditions.checkNotNull(project, "parameter 'project' must not be null");
		Preconditions.checkNotNull(path, "parameter 'path' must not be null");
		
		String resolvedPath = replaceVariables(project, path);
		
		if (".".equals(resolvedPath) || "./".equals(resolvedPath) || "".equals(resolvedPath)) {
			return project;
		}
		IPath relativePath = project.getProjectRelativePath().append(resolvedPath);
		IPath makeAbsolute = relativePath.makeAbsolute();
		
		IWorkspaceRoot root = project.getWorkspace().getRoot();
		IResource resource = root.findMember(resolvedPath);
		if (resource != null) {
			IPath location = resource.getLocation();
			IContainer containerForLocation = project.getWorkspace().getRoot().getContainerForLocation(location);
			if (containerForLocation.getType() == IResource.PROJECT) {
				return containerForLocation.getProject();
			}
		}
		return project.getFolder(resolvedPath);
	}
	

}
