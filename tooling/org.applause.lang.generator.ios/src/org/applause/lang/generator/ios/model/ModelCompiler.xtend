package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.generator.ios.model.EntityCompiler
import org.applause.util.xcode.project.XcodeProject
import org.applause.util.xcode.project.XcodeGroup

class ModelCompiler {

	@Inject EntityCompiler entityCompiler
	
	def compile(Resource resource, IFileSystemAccess fsa, XcodeProject project, XcodeGroup mainGroup) {
		entityCompiler.compile(resource, fsa, project, mainGroup)
	}

}