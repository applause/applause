package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.ios.dataaccess.APIClientCompiler
import org.applause.lang.generator.ios.dataaccess.DataAccessCompiler
import org.applause.lang.generator.ios.dataaccess.DataMappingCompiler
import org.applause.lang.generator.ios.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class AppGenerator implements IGenerator {
	
	@Inject EntityCompiler entityCompiler
	@Inject DataAccessCompiler dataAccessCompiler
	@Inject APIClientCompiler apiClientCompiler
	@Inject DataMappingCompiler dataMappingCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('ios.txt', IosOutputConfigurationProvider.IOS_DEFAULT_OUTPUT, stuff)
		
		entityCompiler.doGenerate(resource, fsa)
		apiClientCompiler.doGenerate(resource, fsa)
		dataAccessCompiler.doGenerate(resource, fsa)
		dataMappingCompiler.doGenerate(resource, fsa)
	}	
	
	def stuff() '''
		Hallo Stuff.
	'''
	
}