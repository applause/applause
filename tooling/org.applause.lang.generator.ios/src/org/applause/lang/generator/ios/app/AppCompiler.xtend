package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.applause.lang.generator.ios.ProjectFileSystemAccess

class AppCompiler {
	
	@Inject AppDelegateCompiler appDelegateCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		appDelegateCompiler.compile(resource, pfsa)
	}
	
}