package org.applause.lang.generator.android

import com.google.inject.Inject
import org.applause.lang.generator.android.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class AndroidAppGenerator implements IGenerator {
	
	@Inject EntityCompiler entityCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.doGenerate(resource, fsa)
	}
	
}