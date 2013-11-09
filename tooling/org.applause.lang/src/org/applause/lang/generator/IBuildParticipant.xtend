package org.applause.lang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

interface IBuildParticipant {
	
	def void doGenerate(Resource input, IFileSystemAccess fsa)
	
}