package org.applause.lang.generator.wp7.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import com.google.inject.Inject
import org.applause.lang.generator.wp7.BoilerplateExtensions
import org.applause.lang.generator.wp7.WP7OutputConfigurationProvider
import org.applause.lang.base.TypeExtensions
import org.applause.lang.base.AttributeExtensions

class ModelCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	
	// outlet name
	public String MODEL_OUPUT = WP7OutputConfigurationProvider::OUTPUT_MODEL
	
	def compile(Entity entity) '''
		«fileHeader()»
		using System;
		
		namespace «entity.namespace» {
		
			public class «entity.typeName» {
				«FOR attribute:entity.attributes»
					«compile(attribute)»
				«ENDFOR»
			}
		}
	'''
	
	def compile(Attribute attribute) '''
		public «attribute.typeName» «attribute.fieldName» { get; set; }
	'''

}