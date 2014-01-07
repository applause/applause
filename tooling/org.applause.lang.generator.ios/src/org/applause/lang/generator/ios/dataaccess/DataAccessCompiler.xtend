package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.FileNameExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*;
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.DataSourceAccessMethod
import org.applause.lang.applauseDsl.RESTVerb
import org.applause.lang.applauseDsl.Type

class DataAccessCompiler implements ICompilerModule {
	
	@Inject extension EntityDataAccessHeaderFileCompiler
	@Inject extension EntityDataAccessModuleFileCompiler
	
	@Inject extension DataAccessClassExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(DataSource)).forEach[
			fsa.generateFile(it.resourceType.entityDataAccessCategoryHeaderFileName, IOS_OUTPUT_DATAACCESS, it.compileHeaderFile)
			fsa.generateFile(it.resourceType.entityDataAccessCategoryModuleFileName, IOS_OUTPUT_DATAACCESS, it.compileModuleFile)
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
	
	@Inject extension TypeExtensions
	
	def parameterName(Type it) {
		it.name.toFirstLower
	}
	
	def parameterName(Entity it) {
		it.name.toFirstLower
	}
	
	def plural(String it) {
		it + 's'
	}
	
	def listAllMethodName(Entity it) {
		'all' + it.name.plural.toFirstUpper
	}
	
	def parameterList(DataSourceAccessMethod it) {
		declaredParameters.map(param | param.type.typeName + ' *' + param.type.parameterName).join(', ') 
	}
	
	def resourceType(DataSourceAccessMethod it) {
		(it.eContainer as DataSource).resourceType
	}
	
}

class EntityDataAccessHeaderFileCompiler {
	
	@Inject extension EntityClassExtensions
	@Inject extension TypeExtensions
	@Inject extension EntityDataAccessExtensions
	
	def compileHeaderFile(DataSource it) '''
		#import <Foundation/Foundation.h>
		#import "«resourceType.entityModelHeaderFileName»"
		
		@interface «resourceType.typeName» (DataAccess)
		«FOR method: methods»
			«method.compileRESTMethod»
		«ENDFOR»
		@end
	'''
	
	def compileRESTMethod(DataSourceAccessMethod it) {
		switch restSpecification.verb {
			case RESTVerb.GET: compileGETLISTMethod
			case RESTVerb.POST: compilePOSTMethod
			case RESTVerb.PUT: compilePUTMethod
			case RESTVerb.DELETE: compileDELETEMethod
		}
	}
	
	def compileGETLISTMethod(DataSourceAccessMethod it) '''
		+ (void)«name»:(void (^)(NSArray *«resourceType.parameterName.plural», NSError *error))block;
	'''
	
	def compilePOSTMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block;
	'''	
	
	def compilePUTMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block;
	'''	
	
	def compileDELETEMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block;
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
	
	def compileModuleFile(DataSource it) '''
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		#import "«resourceType.apiClientClassName.headerFileName»"
		#import "«resourceType.mappingClassName.headerFileName»"
		
		static NSString *const «resourceType.listAllUrlConstantName» = @"«resourceType.listAllUrlPattern»";
		static NSString *const «resourceType.postUrlConstantName» = @"«resourceType.postUrlPattern»";
		static NSString *const «resourceType.putUrlConstantName» = @"«resourceType.putUrlPattern»";
		static NSString *const «resourceType.deleteUrlConstantName» = @"«resourceType.deleteUrlPattern»";
		
		@implementation «resourceType.typeName» (DataAccess)
		
		«FOR method: methods»
			«method.compileRESTMethod»
			
		«ENDFOR»
		@end
	'''
	
	def compileRESTMethod(DataSourceAccessMethod it) {
		switch restSpecification.verb {
			case RESTVerb.GET: compileGETLISTMethod
			case RESTVerb.POST: compilePOSTMethod
			case RESTVerb.PUT: compilePUTMethod
			case RESTVerb.DELETE: compileDELETEMethod
		}
	}
	
	def compileGETLISTMethod(DataSourceAccessMethod it) '''
		+ (void)«name»:(void (^)(NSArray *«resourceType.parameterName.plural», NSError *error))block
		{
			[[«resourceType.apiClientClassName» sharedClient] GET:«resourceType.listAllUrlConstantName» parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
			{
				NSArray *elementsFromJSON = responseObject;
				NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
				for (NSDictionary *attributes in elementsFromJSON) {
					«resourceType.typeName» *mappedElement = [[«resourceType.typeName» alloc] initWithAttributes:attributes];
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
	'''
	
	def compilePOSTMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] POST:«resourceType.postUrlConstantName» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«resourceType.typeName» *postedElement = responseObject;
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
	'''
	
	def compilePUTMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] PUT:«resourceType.putUrlConstantName» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«resourceType.typeName» *postedElement = responseObject;
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
	'''
	
	def compileDELETEMethod(DataSourceAccessMethod it) '''
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSString *urlString = [NSString stringWithFormat:«resourceType.deleteUrlConstantName», self.id];
			[[«resourceType.apiClientClassName» sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
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
	'''
	
}