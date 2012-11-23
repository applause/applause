package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.ios.model.ModelCompiler
import org.applause.lang.generator.ios.ui.UICompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class IosAppGenerator implements IGenerator {

	@Inject ModelCompiler modelCompiler
	@Inject UICompiler uiCompiler
	@Inject ProjectFileSystemAccessFactory projectFileSystemAccessFactory
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val pfsa = projectFileSystemAccessFactory.create(fsa, resource) 
		
		modelCompiler.compile(resource, pfsa)
		uiCompiler.compile(resource, fsa)

		pfsa.saveProject()
	}
	
}
