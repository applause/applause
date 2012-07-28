package org.applause.lang.generator.android.model

import com.google.inject.Inject
import com.google.inject.Provider
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.TypeExtensions
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.base.ImportManager

class ModelCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	
	@Inject Provider<ImportManager> importManagerProvider
	
	// outlet name
	public static val String MODEL_OUPUT = AndroidOutputConfigurationProvider::OUTPUT_MODEL
	
	def setterName(Attribute attribute) {
		"set" + attribute.name.toFirstUpper
	}
	
	def getterName(Attribute attribute) {
		"get" + attribute.name.toFirstUpper
	}
	
	def compile(Entity entity) '''
		«fileHeader()»
		
		package «entity.namespace»;
		
		«val importManager = importManagerProvider.get»
		«val body = compile(entity, importManager)»
		«IF (!importManager.empty)»
		«FOR i: importManager.imports»
			import «i»;
		«ENDFOR»
		
		«ENDIF»
		«body»
		
	'''
	
	def abstractness(Entity entity) {
		if (entity.isAbstract()) 
			"abstract " 
	}
	
	def extendsClause(Entity entity, ImportManager importManager) {
		if (entity.superEntity != null) {
			"extends " + importManager.serialize(entity.superEntity)
		}
	}
	
	def compile(Entity entity, ImportManager importManager) '''
		public «entity.abstractness»class «entity.typeName» «entity.extendsClause(importManager)» {
			«FOR attribute:entity.attributes»
				«compile(attribute, importManager)»
			«ENDFOR»
		}
	'''
	
	def compile(Attribute attribute, ImportManager importManager) '''
		private «importManager.serialize(attribute.type)» «attribute.fieldName»;
		
		public «importManager.serialize(attribute.type)» «attribute.getterName»() {
			return «attribute.name»;
		}
		
		public void «attribute.setterName»(«importManager.serialize(attribute.type)» «attribute.name») {
			this.«attribute.fieldName» = «attribute.name»;
		}
	'''
	

}