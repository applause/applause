package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.FileNameExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class DataAccessCompiler implements ICompilerModule {
	
	@Inject extension EntityDataAccessHeaderFileCompiler
	@Inject extension EntityDataAccessModuleFileCompiler
	
	@Inject extension DataAccessClassExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.entityDataAccessCategoryHeaderFileName, it.compileHeaderFile)
			fsa.generateFile(it.entityDataAccessCategoryModuleFileName, it.compileModuleFile)
		]		
	}
	
}

class DataAccessClassExtensions {
	
	@Inject extension TypeExtensions
	@Inject extension FileNameExtensions
	
	val categoryName = 'DataAccess'

	def entityDataAccessCategoryHeaderFileName(Entity it) {
		(typeName + '+' + categoryName).headerFileName
	}
	
	def entityDataAccessCategoryModuleFileName(Entity it) {
		(typeName + '+' + categoryName).moduleFileName
	}

}

class EntityDataAccessExtensions {
	
	def parameterName(Entity it) {
		it.name.toFirstLower
	}
	
	def plural(String it) {
		it + 's'
	}
	
	def listAllMethodName(Entity it) {
		'all' + it.name.plural.toFirstUpper
	}
	
}

class EntityDataAccessHeaderFileCompiler {
	
	@Inject extension EntityClassExtensions
	@Inject extension TypeExtensions
	@Inject extension EntityDataAccessExtensions
	
	def compileHeaderFile(Entity it) '''
		#import <Foundation/Foundation.h>
		#import "«entityModelHeaderFileName»"
		
		@interface «name» (DataAccess)
		+ (void)«listAllMethodName»:(void (^)(NSArray *«parameterName.plural», NSError *error))block;
		- (void)post:(void (^)(«typeName» *«parameterName», NSError *error))block;
		- (void)put:(void (^)(«typeName» *«parameterName», NSError *error))block;
		- (void)remove:(void (^)(«typeName» *«parameterName», NSError *error))block;
		@end
	'''
	
}

class EntityDataAccessModuleFileCompiler {
	
	@Inject extension EntityDataAccessExtensions
	@Inject extension TypeExtensions
	@Inject extension FileNameExtensions
	
	def listAllUrlConstantName(Entity it) {
		'kAll' + name.plural + 'Path'
	}
	
	// TODO this needs to be coerced from the datasource! 
	def listAllUrlPattern(Entity it) {
		'/' + name.plural.toFirstLower
	}
	
	def putUrlConstantName(Entity it) {
		'kPut' + name + 'Path'
	}
	
	// TODO this needs to be coerced from the datasource! 
	def putUrlPattern(Entity it) {
		'/' + name.plural.toFirstLower
	}
	
	def postUrlConstantName(Entity it) {
		'kPost' + name + 'Path'
	}
	
	// TODO this needs to be coerced from the datasource! 
	def postUrlPattern(Entity it) {
		'/' + name.plural.toFirstLower
	}
	
	def deleteUrlConstantName(Entity it) {
		'kDelete' + name + 'Path'
	}
	
	// TODO this needs to be coerced from the datasource! 
	def deleteUrlPattern(Entity it) {
		'/' + name.plural.toFirstLower + '/%@'
	}
	
	def mappingClassName(Entity it) {
		typeName + '+' + 'DataMapping'
	}
	
	@Inject extension APIClientClassExtensions
	@Inject extension DataAccessClassExtensions
	
	def compileModuleFile(Entity it) '''
		#import "«entityDataAccessCategoryHeaderFileName»"
		#import "«apiClientClassName.headerFileName»"
		#import "«mappingClassName.headerFileName»"
		
		static NSString *const «listAllUrlConstantName» = @"«listAllUrlPattern»";
		static NSString *const «postUrlConstantName» = @"«postUrlPattern»";
		static NSString *const «putUrlConstantName» = @"«putUrlPattern»";
		static NSString *const «deleteUrlConstantName» = @"«deleteUrlPattern»";
		
		@implementation «name» (DataAccess)
		
		+ (void)«listAllMethodName»:(void (^)(NSArray *«parameterName.plural», NSError *error))block
		{
			[[«apiClientClassName» sharedClient] GET:«listAllUrlConstantName» parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
			{
				NSArray *elementsFromJSON = responseObject;
				NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
				for (NSDictionary *attributes in elementsFromJSON) {
					«typeName» *mappedElement = [[«typeName» alloc] initWithAttributes:attributes];
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
		
		- (void)post:(void (^)(«typeName» *«parameterName», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«apiClientClassName» sharedClient] POST:«postUrlConstantName» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«typeName» *postedElement = responseObject;
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
		
		- (void)put:(void (^)(«typeName» *«parameterName», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«apiClientClassName» sharedClient] PUT:«putUrlConstantName» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«typeName» *postedElement = responseObject;
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
		
		- (void)remove:(void (^)(«typeName» *«parameterName», NSError *error))block
		{
			NSString *urlString = [NSString stringWithFormat:«deleteUrlConstantName», self.id];
			[[«apiClientClassName» sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
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
	'''
	
}