package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource

class UICompiler {
	
	@Inject ListViewCompiler listViewCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		listViewCompiler.compile(resource, pfsa)
	}
	
}