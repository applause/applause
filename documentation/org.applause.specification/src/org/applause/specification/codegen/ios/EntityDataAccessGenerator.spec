package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessHeaderFileCompiler
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessModuleFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Entity Data Access Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension EntityDataAccessHeaderFileCompiler
	@Inject extension EntityDataAccessModuleFileCompiler
	
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
		describe "Data Access Code" {
			
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
					#import "Person.h"

					@interface Person (DataAccess)
					+ (void)allPersons:(void (^)(NSArray *persons, NSError *error))block;
					- (void)post:(void (^)(Person *person, NSError *error))block;
					- (void)put:(void (^)(Person *person, NSError *error))block;
					- (void)remove:(void (^)(Person *person, NSError *error))block;
					@end
				'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person+DataAccess.h"
					#import "PersonAPIClient.h"
					#import "Person+DataMapping.h"
					
					static NSString *const kAllPersonsPath = @"/persons";
					static NSString *const kPostPersonPath = @"/persons";
					static NSString *const kPutPersonPath = @"/persons";
					static NSString *const kDeletePersonPath = @"/persons/%@";
					
					@implementation Person (DataAccess)
					
					+ (void)allPersons:(void (^)(NSArray *persons, NSError *error))block
					{
						[[PersonAPIClient sharedClient] GET:kAllPersonsPath parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
						{
							NSArray *elementsFromJSON = responseObject;
							NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
							for (NSDictionary *attributes in elementsFromJSON) {
								Person *mappedElement = [[Person alloc] initWithAttributes:attributes];
								[result addObject:mappedElement];
							}
					
							if (block) {
								block([result copy], nil);
							}
						} failure:^(NSURLSessionDataTask *task, NSError *error)
						{
							if (block) {
								block(@[], error);
							}
						}];
					}
					
					- (void)post:(void (^)(Person *person, NSError *error))block
					{
						NSDictionary *elementDictionary = [self attributes];
						[[PersonAPIClient sharedClient] POST:kPostPersonPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
						{
							Person *postedElement = responseObject;
							if(block) {
								block(postedElement, nil);
							}
						} failure:^(NSURLSessionDataTask *task, NSError *error)
						{
							if(block) {
								block(nil, error);
							}
						}];
					}
					
					- (void)put:(void (^)(Person *person, NSError *error))block
					{
						NSDictionary *elementDictionary = [self attributes];
						[[PersonAPIClient sharedClient] PUT:kPutPersonPath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
						{
							Person *postedElement = responseObject;
							if(block) {
								block(postedElement, nil);
							}
						} failure:^(NSURLSessionDataTask *task, NSError *error)
						{
							if(block) {
								block(nil, error);
							}
						}];
					}
					
					- (void)remove:(void (^)(Person *person, NSError *error))block
					{
						NSString *urlString = [NSString stringWithFormat:kDeletePersonPath, self.id];
						[[PersonAPIClient sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
						{
							if(block) {
								block(self, nil);
							}
						} failure:^(NSURLSessionDataTask *task, NSError *error)
						{
							if(block) {
								block(nil, error);
							}
						}];
					}
					
					@end
				'''.isGeneratedModuleFileFromModel("Person", simplePersonEntity)
			}
			
		}
	
	}

}