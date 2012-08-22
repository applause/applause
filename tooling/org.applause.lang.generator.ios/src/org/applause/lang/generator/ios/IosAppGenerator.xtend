package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.generator.ios.model.ModelCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.applause.lang.generator.ios.ui.UICompiler

class IosAppGenerator implements IGenerator {

	@Inject ModelCompiler modelCompiler
	@Inject UICompiler uiCompiler
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		modelCompiler.compile(resource, fsa)
		uiCompiler.compile(resource, fsa)
	}
	
}
