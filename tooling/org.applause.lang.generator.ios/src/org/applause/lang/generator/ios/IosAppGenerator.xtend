package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.ios.model.ModelCompiler
import org.applause.lang.generator.ios.ui.UICompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.applause.lang.generator.ios.app.AppCompiler

class IosAppGenerator implements IGenerator {

	@Inject ModelCompiler modelCompiler
	@Inject UICompiler uiCompiler
	@Inject AppCompiler appCompiler
	
	@Inject ProjectFileSystemAccessFactory projectFileSystemAccessFactory
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val pfsa = projectFileSystemAccessFactory.create(fsa, resource) 
		
		modelCompiler.compile(resource, pfsa)
		uiCompiler.compile(resource, pfsa)
		appCompiler.compile(resource, pfsa)

		pfsa.saveProject()
	}
	
}
