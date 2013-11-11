package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.model.EntityInterfaceCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Entity Generator" {
	
	@Inject extension ParseHelper<Model>
	@Inject extension EntityInterfaceCompiler
	
	def void isGeneratedHeaderFileFromModel(CharSequence expectedGeneratedCode, String entityName,  CharSequence input) {
		val model = input.parse
		val entity = model.elements.filter(typeof(Entity)).findFirst[name == entityName]
		val result = entity.compileInterface
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
		
	
	describe "Simple Entities" {
		
		val simplePersonEntity = '''
			entity Person {
			}
		'''
		
		fact "Header File" {
			'''
				#import <Foundation/Foundation.h>
				
				@interface Person : NSObject
				@end
			'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			
		}
	}

}