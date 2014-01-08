package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.ios.dataaccess.APIClientCompiler
import org.applause.lang.generator.ios.dataaccess.DataAccessCompiler
import org.applause.lang.generator.ios.dataaccess.DataMappingCompiler
import org.applause.lang.generator.ios.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.applause.lang.generator.ios.supportfiles.MainClassCompiler
import org.applause.lang.generator.ios.supportfiles.PrecompiledHeaderCompiler
import org.applause.lang.generator.ios.supportfiles.PlistCompiler
import org.applause.lang.generator.ios.supportfiles.InfoPlistStringsCompiler
import org.applause.lang.generator.ios.ui.ScreenCompiler

class AppGenerator implements IGenerator {
	
	@Inject EntityCompiler entityCompiler
	@Inject DataAccessCompiler dataAccessCompiler
	@Inject APIClientCompiler apiClientCompiler
	@Inject DataMappingCompiler dataMappingCompiler
	
	@Inject MainClassCompiler mainClassCompiler
	@Inject PrecompiledHeaderCompiler precompiledHeaderCompiler
	@Inject PlistCompiler plistCompiler
	@Inject InfoPlistStringsCompiler infoPlistStringsCompiler
	
	@Inject ScreenCompiler screenCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		entityCompiler.doGenerate(resource, fsa)
		apiClientCompiler.doGenerate(resource, fsa)
		dataAccessCompiler.doGenerate(resource, fsa)
		dataMappingCompiler.doGenerate(resource, fsa)
		
		mainClassCompiler.doGenerate(resource, fsa)
		precompiledHeaderCompiler.doGenerate(resource, fsa)
		plistCompiler.doGenerate(resource, fsa)
		infoPlistStringsCompiler.doGenerate(resource, fsa)
		
		screenCompiler.doGenerate(resource, fsa)
	}	
	
}