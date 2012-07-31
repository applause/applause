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
	
	def compile(Entity entity) '''
		«fileHeader()»
		
		package «entity.namespace»;
		
		«val importManager = importManagerProvider.get»
		«val body = compile(entity, importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def private compile(Entity entity, ImportManager importManager) '''
		public «entity.abstractClause»class «entity.typeName» «entity.extendsClause(importManager)» {
			«FOR attribute:entity.attributes»
				«compile(attribute, importManager)»
			«ENDFOR»
		}
	'''
	
	def private abstractClause(Entity entity) {
		if (entity.isAbstract()) 
			"abstract " 
	}
	
	def private extendsClause(Entity entity, ImportManager importManager) {
		if (entity.superEntity != null) {
			"extends " + importManager.serialize(entity.superEntity)
		}
	}
	
	def private compile(Attribute attribute, ImportManager importManager) '''
		private «importManager.serialize(attribute.type)» «attribute.fieldName»;
		
		public «importManager.serialize(attribute.type)» «attribute.getterName»() {
			return «attribute.name»;
		}
		
		public void «attribute.setterName»(«importManager.serialize(attribute.type)» «attribute.name») {
			this.«attribute.fieldName» = «attribute.name»;
		}
	'''
	
	def private setterName(Attribute attribute) {
		"set" + attribute.name.toFirstUpper
	}
	
	def private getterName(Attribute attribute) {
		"get" + attribute.name.toFirstUpper
	}
	
	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR i: importManager.imports»
			import «i»;
		«ENDFOR»
		
		«ENDIF»
	'''
	

}