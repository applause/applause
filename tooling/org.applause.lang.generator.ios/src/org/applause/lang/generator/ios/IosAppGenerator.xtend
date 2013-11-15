package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.IBuildParticipant
import org.applause.lang.generator.ios.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.generator.ios.dataaccess.DataAccessCompiler
import org.applause.lang.generator.ios.dataaccess.APIClientCompiler

class IosAppGenerator implements IBuildParticipant{
	
	@Inject EntityCompiler entityCompiler
	@Inject DataAccessCompiler dataAccessCompiler
	@Inject APIClientCompiler apiClientCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.doGenerate(resource, fsa)
		dataAccessCompiler.doGenerate(resource, fsa)
		apiClientCompiler.doGenerate(resource, fsa)
	}
	
}