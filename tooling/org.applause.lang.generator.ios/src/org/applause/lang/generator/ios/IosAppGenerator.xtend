package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.IBuildParticipant
import org.applause.lang.generator.ios.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class IosAppGenerator implements IBuildParticipant{
	
	@Inject EntityCompiler entityCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.doGenerate(resource, fsa)
	}
	
}