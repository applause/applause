package org.applause.lang.generator.ios;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ProjectFileSystemAccessFactory {
	
	@Inject 
	private Provider<ProjectFileSystemAccess> projectFileSystemAccessProvider;
	
	public ProjectFileSystemAccess create() {
		ProjectFileSystemAccess projectFileSystemAccess = projectFileSystemAccessProvider.get();
		return projectFileSystemAccess;
	}
	
	public ProjectFileSystemAccess create(IFileSystemAccess fsa, Resource resource) {
		ProjectFileSystemAccess projectFileSystemAccess = create();
		projectFileSystemAccess.setFsa(fsa);
		projectFileSystemAccess.setResource(resource);
		return projectFileSystemAccess;
	}

}
