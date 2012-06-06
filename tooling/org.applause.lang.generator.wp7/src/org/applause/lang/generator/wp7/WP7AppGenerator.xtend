package org.applause.lang.generator.wp7

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.wp7.model.EntityExtensions
import org.applause.lang.generator.wp7.model.ModelCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class WP7AppGenerator implements IGenerator {

	@Inject extension EntityExtensions
	@Inject extension ModelCompiler
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(entity:resource.allContents.toIterable.filter(typeof(Entity))) {
			fsa.generateFile(entity.fileName, MODEL_OUPUT, compile(entity))
		}
	}
	
}
