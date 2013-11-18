package org.applause.lang.generator.ios

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

abstract class AbstractCompilerModule<T> implements ICompilerModule {
	
	def String headerFileName(T it)
	def String moduleFileName(T it)
	
	def CharSequence compileHeaderFile(T it) 
	def CharSequence compileModuleFile(T it)
	
	def Class<T> clazz()
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(clazz).forEach[
			fsa.generateFile(it.headerFileName, it.compileHeaderFile)
			fsa.generateFile(it.moduleFileName, it.compileModuleFile)
		]
	}
	
}