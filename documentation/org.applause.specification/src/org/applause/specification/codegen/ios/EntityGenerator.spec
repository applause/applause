package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.model.EntityHeaderFileCompiler
import org.applause.lang.generator.ios.model.EntityModuleFileCompiler
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
	@Inject extension EntityHeaderFileCompiler
	@Inject extension EntityModuleFileCompiler
	
	private def entity(CharSequence input, String entityName) {
		val model = input.parse
		model.elements.filter(typeof(Entity)).findFirst[name == entityName]
	}
	
	def void isGeneratedHeaderFileFromModel(CharSequence expectedGeneratedCode, String entityName,  CharSequence input) {
		val entity = input.entity(entityName)
		val result = entity.compileHeader
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	def void isGeneratedModuleFileFromModel(CharSequence expectedGeneratedCode, String entityName,  CharSequence input) {
		val entity = input.entity(entityName)		
		val result = entity.compileModule
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	context "Generating Entities" {
		
		/**
		 * A simple entity like this:
		 * 
		 * <pre class="prettyprint linenums lang-applause">
		 * entity Person {
		 * }
		 * </pre>
		 * 
		 * will result in the following header and implementation files:
		 */
		describe "Simple Entities" {
			
			val simplePersonEntity = '''
				entity Person {
				}
			'''
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Header File" {
				'''
					#import <Foundation/Foundation.h>
					
					@interface Person : NSObject
					@end
				'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person.h"

					@implementation Person
					@end
				'''.isGeneratedModuleFileFromModel("Person", simplePersonEntity)
			}
			
		}
	
		describe "Abstract Entities" {
		}
		
		describe "Entity inheritance" {
			
			val inheritedPersonEntity = '''
				entity Creature {
				}
				entity Person extends Creature {
				}
			'''
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Header File" {
				'''
					#import <Foundation/Foundation.h>
					
					@class Creature;
					
					@interface Person : Creature
					@end
				'''.isGeneratedHeaderFileFromModel("Person", inheritedPersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person.h"
					#import "Creature.h"

					@implementation Person
					@end
				'''.isGeneratedModuleFileFromModel("Person", inheritedPersonEntity)
			}
			
		}
		
	}

	context "Generating Entity Attributes" {
		
		/**
		 * Simple attributes like these:
		 * 
		 * <pre class="prettyprint linenums lang-applause">
		 * datatype String
		 * entity Person {
		 *	String name
		 * }
		 * </pre>
		 * 
		 * will result in the following header and implementation files:
		 */
		describe "Simple Attributes" {
			
			val simplePersonEntity = '''
				datatype String
				datatype Bool
				entity Person {
					String name
					Bool grownUp
				}
			'''
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Header File" {
				'''
					#import <Foundation/Foundation.h>
					
					@interface Person : NSObject
					@property (nonatomic, strong) NSString *name;
					@property (nonatomic) BOOL grownUp;
					@end
				'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person.h"

					@implementation Person
					@end
				'''.isGeneratedModuleFileFromModel("Person", simplePersonEntity)
			}
			
		}
			
	}	
	
}