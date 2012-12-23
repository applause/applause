package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource

/** 
 * The ModelCompiler is responsible for generating all classes and resources that are related to 
 * the model of the application.
 */
class ModelCompiler {

	@Inject EntityCompiler entityCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		entityCompiler.compile(resource, pfsa)
	}

}