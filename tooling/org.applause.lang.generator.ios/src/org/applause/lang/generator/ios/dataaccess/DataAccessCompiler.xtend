package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.DataSourceAccessMethod
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.RESTVerb
import org.applause.lang.applauseDsl.Type
import org.applause.lang.generator.ios.FileNameExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

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
	@Inject extension RESTURLExtensions
	
	def mappingClassName(Entity it) {
		typeName + '+' + 'DataMapping'
	}
	
	@Inject extension APIClientClassExtensions
	@Inject extension DataAccessClassExtensions
	
	def compileModuleFile(DataSource it) '''
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		#import "«resourceType.apiClientClassName.headerFileName»"
		#import "«resourceType.mappingClassName.headerFileName»"
		
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
	
	def urlConstantForRESTMethod(DataSourceAccessMethod it) {
		'k' + name.toFirstUpper + 'Path'
	}
	
	def compileGETLISTMethod(DataSourceAccessMethod it) '''
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";
		
		+ (void)«name»:(void (^)(NSArray *«resourceType.parameterName.plural», NSError *error))block
		{
			[[«resourceType.apiClientClassName» sharedClient] GET:«urlConstantForRESTMethod» parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
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
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";

		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] POST:«urlConstantForRESTMethod» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
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
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";
		
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] PUT:«urlConstantForRESTMethod» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
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
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";
		
		- (void)«name»:(void (^)(«parameterList()», NSError *error))block
		{
			NSString *urlString = [NSString stringWithFormat:«urlConstantForRESTMethod», self.id];
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