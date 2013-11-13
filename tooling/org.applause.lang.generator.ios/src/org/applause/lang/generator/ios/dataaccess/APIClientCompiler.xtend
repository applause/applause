package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class APIClientCompiler implements ICompilerModule {
	
	@Inject extension APIClientHeaderFileCompiler
	@Inject extension APIClientModuleFileCompiler
	@Inject extension APIClientExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.headerFileName, it.compileHeaderFile)
			fsa.generateFile(it.moduleFileName, it.compileModuleFile)
		]
	}
	
}

class APIClientExtensions {
	
	def className(Entity it) {
		name + 'APIClient'
	}
	
	def headerFileName(Entity it) {
		className + '.h'
	}
	def moduleFileName(Entity it) {
		className + '.m'
	}

	def parameterName(Entity it) {
		it.name.toFirstLower
	}
	
}

class APIClientHeaderFileCompiler {
	
	@Inject extension APIClientExtensions
	
	def compileHeaderFile(Entity it) '''
		#import <Foundation/Foundation.h>
		#import "AFHTTPSessionManager.h"
		
		@interface «className» : AFHTTPSessionManager
		+ («className» *)sharedClient;
		@end
	'''
	
}

class APIClientModuleFileCompiler {
	
	@Inject extension TypeExtensions
	
	def apiClientClassName(Entity it) {
		name + 'APIClient'
	}
	
	def headerFileName(String className) {
		className + '.h'
	}
	
	def mappingClassName(Entity it) {
		typeName + '+' + 'DataMapping'
	}
	
	def compileModuleFile(Entity it) '''
		#import "«apiClientClassName.headerFileName»"
		
		static NSString *const kBaseUrl = @"http://localhost:2403";
		
		@implementation «apiClientClassName»
		
		+ («apiClientClassName» *)sharedClient {
			static dispatch_once_t onceToken;
			static «apiClientClassName» *defaultInstance = nil;
			dispatch_once(&onceToken, ^{
				defaultInstance = [[«apiClientClassName» alloc] initWithBaseURL:[NSURL URLWithString:kBaseUrl]];
			});
			return defaultInstance;
		}
		
		- (instancetype)initWithBaseURL:(NSURL *)url
		{
			self = [super initWithBaseURL:url];
			if (self) {
				AFJSONSerializer *responseSerializer = [AFJSONSerializer serializer];
				responseSerializer.readingOptions = NSJSONReadingAllowFragments;
				self.responseSerializer = responseSerializer;
				self.requestSerializer = [AFJSONSerializer serializer];
			}
			return self;
		}
		
		@end
	'''
	
}