package org.applause.lang.generator.android

import org.applause.lang.generator.IBuildParticipant
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.applause.lang.generator.android.model.EntityCompiler

class AndroidAppGenerator implements IBuildParticipant {
	
	@Inject EntityCompiler entityCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.doGenerate(resource, fsa)
	}
	
}