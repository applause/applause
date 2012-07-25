package org.applause.lang.generator.android.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider

class ModelCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension EntityExtensions
	
	// outlet name
	public static val String MODEL_OUPUT = AndroidOutputConfigurationProvider::OUTPUT_MODEL
	
	def compile(Entity entity) '''
		«fileHeader()»
		public «IF entity.isAbstract»abstract «ENDIF»class «entity.typeName» «IF entity.superEntity != null»extends «entity.superEntity.typeName» «ENDIF»{
			«FOR attribute:entity.attributes»
				«compile(attribute)»
			«ENDFOR»
		}
	'''
	
	def compile(Attribute attribute) '''
		private «attribute.typeName» «attribute.fieldName»;
		
		public «attribute.typeName» «attribute.getterName»() {
			return «attribute.name»;
		}
		
		public void «attribute.setterName»(«attribute.type.name» «attribute.name») {
			this.«attribute.fieldName» = «attribute.name»;
		}
	'''
	

}