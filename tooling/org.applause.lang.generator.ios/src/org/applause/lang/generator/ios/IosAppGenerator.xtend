package org.applause.lang.generator.ios

import org.applause.lang.generator.IBuildParticipant
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class IosAppGenerator implements IBuildParticipant{
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		fsa.generateFile('ios.txt', 'contents')
	}
	
}