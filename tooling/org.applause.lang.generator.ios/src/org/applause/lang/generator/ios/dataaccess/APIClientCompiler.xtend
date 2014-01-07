package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.FileNameExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*;

class APIClientCompiler implements ICompilerModule {
	
	@Inject extension FileNameExtensions
	@Inject extension APIClientClassExtensions
	@Inject extension APIClientHeaderFileCompiler
	@Inject extension APIClientModuleFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.apiClientClassName.headerFileName, IOS_OUTPUT_DATAACCESS, it.compileHeaderFile)
			fsa.generateFile(it.apiClientClassName.moduleFileName, IOS_OUTPUT_DATAACCESS, it.compileModuleFile)
		]
	}
	
}

class APIClientClassExtensions {
	
	def apiClientClassName(Entity it) {
		name + 'APIClient'
	}
	
}

class APIClientExtensions {
	
	def parameterName(Entity it) {
		it.name.toFirstLower
	}
	
}

class APIClientHeaderFileCompiler {
	
	@Inject extension APIClientClassExtensions
	
	def compileHeaderFile(Entity it) '''
		#import <Foundation/Foundation.h>
		#import "AFHTTPSessionManager.h"
		
		@interface «apiClientClassName» : AFHTTPSessionManager
		+ («apiClientClassName» *)sharedClient;
		@end
	'''
	
}

class APIClientModuleFileCompiler {
	
	@Inject extension TypeExtensions
	@Inject extension FileNameExtensions
	@Inject extension APIClientClassExtensions
	
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
				AFJSONResponseSerializer *responseSerializer = [AFJSONResponseSerializer serializer];
				responseSerializer.readingOptions = NSJSONReadingAllowFragments;
				self.responseSerializer = responseSerializer;
				self.requestSerializer = [AFJSONRequestSerializer serializer];
			}
			return self;
		}
		
		@end
	'''
	
}