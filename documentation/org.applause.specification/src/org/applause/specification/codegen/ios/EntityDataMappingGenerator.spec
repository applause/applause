package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.dataaccess.EntityDataMappingHeaderFileCompiler
import org.applause.lang.generator.ios.dataaccess.EntityDataMappingModuleFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Entity Data Mapping Generator" {
	
	@Inject extension ParseHelper<Model>
	@Inject extension EntityDataMappingHeaderFileCompiler
	@Inject extension EntityDataMappingModuleFileCompiler
	
	private def entity(CharSequence input, String entityName) {
		val model = input.parse
		model.elements.filter(typeof(Entity)).findFirst[name == entityName]
	}
	
	def void isGeneratedHeaderFileFromModel(CharSequence expectedGeneratedCode, String entityName,  CharSequence input) {
		val entity = input.entity(entityName)
		val result = entity.compileHeaderFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	def void isGeneratedModuleFileFromModel(CharSequence expectedGeneratedCode, String entityName,  CharSequence input) {
		val entity = input.entity(entityName)		
		val result = entity.compileModuleFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	context "Mapping Entities" {
		
		/**
		 * A simple entity like this:
		 * 
		 * <pre class="prettyprint linenums lang-applause">
		 * datatype String
		 * entity Person {
		 * 	String name
		 * }
		 * </pre>
		 * 
		 * will result in the following header and implementation files:
		 */
		describe "Data Mapping Code" {
			
			val simplePersonEntity = '''
				datatype String
				entity Person {
					String name
				}
			'''
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Header File" {
				'''
					#import <Foundation/Foundation.h>
					#import "Person.h"
					
					@interface Person (DataMapping)
					- (id)initWithAttributes:(NSDictionary *)attributes;
					
					- (NSDictionary *)attributes;
					@end
				'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person.h"
					#import "Person+DataMapping.h"
					
					@implementation Person (DataMapping)
					- (id)initWithAttributes:(NSDictionary *)attributes
					{
						self = [super init];
						if (self) {
							self.name = [attributes valueForKeyPath:@"name"];
						}

						return self;
					}
					
					- (NSDictionary *)attributes
					{
						NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];
						if (self.name != nil) {
							attributes[@"name"] = self.name;
						}
						return attributes;
					}
					@end
				'''.isGeneratedModuleFileFromModel("Person", simplePersonEntity)
			}
			
		}
	
	}

}