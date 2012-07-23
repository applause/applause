package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.model.ModelCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.applause.lang.generator.ios.model.EntityExtensions

class IosAppGenerator implements IGenerator {

	@Inject extension EntityExtensions
	@Inject extension ModelCompiler
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.fileName, ModelCompiler::MODEL_OUPUT, it.compile)
		]
	}
	
}
