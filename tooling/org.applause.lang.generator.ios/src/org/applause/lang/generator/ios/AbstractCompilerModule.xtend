package org.applause.lang.generator.ios

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*;

abstract class AbstractCompilerModule<T> implements ICompilerModule {
	
	def String headerFileName(T it)
	def String moduleFileName(T it)
	
	def CharSequence compileHeaderFile(T it) 
	def CharSequence compileModuleFile(T it)
	
	def Class<T> clazz()
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(clazz).forEach[
			fsa.generateFile(it.headerFileName, IOS_DEFAULT_OUTPUT, it.compileHeaderFile)
			fsa.generateFile(it.moduleFileName, IOS_DEFAULT_OUTPUT, it.compileModuleFile)
		]
	}
	
}