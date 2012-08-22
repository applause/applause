package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.generator.ios.model.EntityCompiler

class ModelCompiler {

	@Inject EntityCompiler entityCompiler
	
	def compile(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.compile(resource, fsa)
	}

}