package org.applause.lang.generator.ios

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

interface ICompilerModule {
	
	def void doGenerate(Resource resource, IFileSystemAccess fsa);
	
}