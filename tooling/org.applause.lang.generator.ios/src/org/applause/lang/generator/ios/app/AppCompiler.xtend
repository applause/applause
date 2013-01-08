package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.applause.lang.generator.ios.ProjectFileSystemAccess

import org.applause.lang.generator.ios.ProjectExtensions
import static extension org.applause.util.xcode.project.Path.*

class AppCompiler {
	
	@Inject extension ProjectExtensions
	
	@Inject AppDelegateCompiler appDelegateCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		appDelegateCompiler.compile(resource, pfsa)
		
		setupProducts(resource, pfsa)
	}
	
	def setupProducts(Resource resource, ProjectFileSystemAccess pfsa) { 
		val productsGroup = pfsa.productsGroup
		val appFileName = resource.appName() + '.app'
		productsGroup.createAppFile(appFileName.toPath)
	}
	
}