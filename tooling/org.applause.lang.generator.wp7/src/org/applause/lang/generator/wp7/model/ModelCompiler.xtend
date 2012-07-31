package org.applause.lang.generator.wp7.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.base.TypeExtensions
import org.applause.lang.generator.wp7.BoilerplateExtensions
import org.applause.lang.generator.wp7.WP7OutputConfigurationProvider

class ModelCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String MODEL_OUPUT = WP7OutputConfigurationProvider::OUTPUT_MODEL
	
	def compile(Entity entity) '''
		«fileHeader()»
		«val importManager = importManagerFactory.create(entity)»
		using System;
		«val body = entity.compile(importManager)»
		«importManager.imports()»

		namespace «entity.namespace» {
			«body»
		}
	'''
	
	def private compile(Entity entity, ImportManager importManager) '''
		public «entity.abstractClause»class «entity.typeName»«entity.extendsClause(importManager)» {
			«FOR attribute:entity.attributes»
				«attribute.compile(importManager)»
			«ENDFOR»		
		}
	'''
	
	def private abstractClause(Entity entity) {
		if (entity.isAbstract()) 
			"abstract " 
	}

	def private extendsClause(Entity entity, ImportManager importManager) {
		if (entity.superEntity != null) {
			': ' + importManager.serialize(entity.superEntity)
		}
	}

	def private compile(Attribute attribute, ImportManager importManager) '''
		public «importManager.serialize(attribute.type)» «attribute.fieldName» { get; set; }
	'''

	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR i: importManager.imports»
			using «i»;
		«ENDFOR»
		«ENDIF»
	'''

}