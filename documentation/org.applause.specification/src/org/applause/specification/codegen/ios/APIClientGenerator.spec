package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.dataaccess.APIClientHeaderFileCompiler
import org.applause.lang.generator.ios.dataaccess.APIClientModuleFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "API Client Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension APIClientHeaderFileCompiler
	@Inject extension APIClientModuleFileCompiler
	
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
	
	context "Entity API Client" {
		
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
		describe "API Client Code" {
			
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
					#import "AFHTTPSessionManager.h"
					
					@interface PersonAPIClient : AFHTTPSessionManager
					+ (PersonAPIClient *)sharedClient;
					@end
				'''.isGeneratedHeaderFileFromModel("Person", simplePersonEntity)
			}
			
			/**
			 * @filter('''|.isGenerated.*)
			 */
			fact "Implementation file" {
				'''
					#import "PersonAPIClient.h"
					
					static NSString *const kBaseUrl = @"http://localhost:2403";
					
					@implementation PersonAPIClient
					
					+ (PersonAPIClient *)sharedClient {
						static dispatch_once_t onceToken;
						static PersonAPIClient *defaultInstance = nil;
						dispatch_once(&onceToken, ^{
							defaultInstance = [[PersonAPIClient alloc] initWithBaseURL:[NSURL URLWithString:kBaseUrl]];
						});
						return defaultInstance;
					}
					
					- (instancetype)initWithBaseURL:(NSURL *)url
					{
						self = [super initWithBaseURL:url];
						if (self) {
							AFJSONResponseSerializer *responseSerializer = [AFJSONResponseSerializer serializer];
							responseSerializer.readingOptions = NSJSONReadingAllowFragments;
							self.responseSerializer = responseSerializer;
							self.requestSerializer = [AFJSONRequestSerializer serializer];
						}
						return self;
					}
					
					@end
				'''.isGeneratedModuleFileFromModel("Person", simplePersonEntity)
			}
			
		}
	
	}

}