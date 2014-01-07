package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
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
	
	private def datasource(CharSequence input, String datasourceName) {
		val model = input.parse
		model.elements.filter(typeof(DataSource)).findFirst[name == datasourceName]
	}
	
	def void isGeneratedHeaderFileFromModel(CharSequence expectedGeneratedCode, String dataSourceName,  CharSequence input) {
		val datasource = input.datasource(dataSourceName)
		val result = datasource.compileHeaderFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	def void isGeneratedModuleFileFromModel(CharSequence expectedGeneratedCode, String dataSourceName,  CharSequence input) {
		val datasource = input.datasource(dataSourceName)		
		val result = datasource.compileModuleFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
context "Generating Data Access Code for Entities" {
		
		/**
		 * A simple model like this:
		 * 
		 * <pre class="prettyprint linenums lang-applause">
		 * entity Person {
		 * }
		 * entity Person {
		 * }
		 * datasource PersonDataSource {
		 * 	baseUrl: http://localhost:2403
		 * 	resource: Person
		 * 	allPersons()[] GET /persons
		 * 	create(Person person) POST /persons
		 * 	update(Person person) PUT /persons
		 * 	remove(Person person) DELETE /person/:person
		 * }
		 * </pre>
		 * 
		 * will result in the following header and implementation files:
		 */
		describe "Data Access Code" {
			
			val simpleDataSource = '''
				entity Person {
				}
				datasource PersonDataSource {
					baseUrl: http://localhost:2403
					resource: Person
					allPersons()[] GET /persons
					create(Person person) POST /persons
					update(Person person) PUT /persons
					remove(Person person) DELETE /persons/:person
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
					- (void)create:(void (^)(Person *person, NSError *error))block;
					- (void)update:(void (^)(Person *person, NSError *error))block;
					- (void)remove:(void (^)(Person *person, NSError *error))block;
					@end
				'''.isGeneratedHeaderFileFromModel("PersonDataSource", simpleDataSource)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "Person+DataAccess.h"
					#import "PersonAPIClient.h"
					#import "Person+DataMapping.h"
					
					@implementation Person (DataAccess)
					
					static NSString *const kAllPersonsPath = @"/persons";
					
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
					
					static NSString *const kCreatePath = @"/persons";
					
					- (void)create:(void (^)(Person *person, NSError *error))block
					{
						NSDictionary *elementDictionary = [self attributes];
						[[PersonAPIClient sharedClient] POST:kCreatePath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
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
					
					static NSString *const kUpdatePath = @"/persons";
					
					- (void)update:(void (^)(Person *person, NSError *error))block
					{
						NSDictionary *elementDictionary = [self attributes];
						[[PersonAPIClient sharedClient] PUT:kUpdatePath parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
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
					
					static NSString *const kRemovePath = @"/persons/%@";
					
					- (void)remove:(void (^)(Person *person, NSError *error))block
					{
						NSString *urlString = [NSString stringWithFormat:kRemovePath, self.id];
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
				'''.isGeneratedModuleFileFromModel("PersonDataSource", simpleDataSource)
			}
			
		}
	
	}

}