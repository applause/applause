package org.applause.lang.generator.wp7

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Attribute
import com.google.inject.Inject

class WP7AppGenerator implements IGenerator {

	@Inject extension BoilerplateExtensions
	@Inject extension EntityExtensions
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(entity:resource.allContents.toIterable.filter(typeof(Entity))) {
			fsa.generateFile(entity.fileName, compile(entity))
		}
	}
	
	def compile(Entity entity) '''
		«fileHeader()»
		using System;
		
		public class «entity.typeName»{
			«FOR attribute:entity.attributes»
				«compile(attribute)»
			«ENDFOR»
		}
	'''
	
	def compile(Attribute attribute) '''
		public «attribute.typeName» «attribute.name» { get; set; }
	'''

}
