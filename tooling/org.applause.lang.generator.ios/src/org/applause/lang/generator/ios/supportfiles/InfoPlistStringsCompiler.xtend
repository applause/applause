package org.applause.lang.generator.ios.supportfiles

import com.google.inject.Inject
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

class InfoPlistStringsCompiler implements ICompilerModule {

	@Inject extension InfoPlistStringsFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('InfoPlist.strings', IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN, compilePlistStringsFile)
	}
	
}

class InfoPlistStringsFileCompiler {

	public static final String PACKAGENAME = 'org.applause'
	
	def compilePlistStringsFile() '''
		/* Localized versions of Info.plist keys */
	'''
	
}