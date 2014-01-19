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
import org.eclipse.xtext.EcoreUtil2

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

class DataAccessMethodCompiler {
	
	@Inject extension TypeExtensions
	@Inject extension EntityDataAccessExtensions

	def private parameterClause(DataSourceAccessMethod it) {
		'WithParameter:(' + it.considerableParameters.map[it.type.typeName + ' *)' + it.name].join(' and:(')
	}
	
	def methodType(DataSourceAccessMethod it) {
		switch restSpecification.verb {
			case RESTVerb.GET: '+'
			case RESTVerb.POST: '-'
			case RESTVerb.PUT: '-'
			case RESTVerb.DELETE: '-'
		}
	}
	
	def private dataSource(DataSourceAccessMethod it) {
		EcoreUtil2.getContainerOfType(it, DataSource)
	}
	
	def parametersInEntity(DataSourceAccessMethod it) {
		if (dataSource.resourceType == it.declaredParameters.head.type)
			it.declaredParameters.head
	}
	
	def parametersInSignature(DataSourceAccessMethod it) {
		if (restSpecification.verb == RESTVerb.GET) 
			it.declaredParameters
		else if (dataSource.resourceType == it.declaredParameters.head.type)
			it.declaredParameters.tail
	}
	
	def private considerableParameters(DataSourceAccessMethod it) {
		if (restSpecification.verb == RESTVerb.GET) 
			it.declaredParameters
		else if (dataSource.resourceType == it.declaredParameters.head.type)
			it.declaredParameters.tail
	}
	
	def private returnType(DataSourceAccessMethod it) {
		if (returnsMany) 'NSArray *items'
		else resourceType.typeName + ' *item'
	}
	
	def dataAccessMethodName(DataSourceAccessMethod it) {
		val parameterSection = 
			if (it.considerableParameters.size == 0) {
				name + ':'
			} else {
				name + parameterClause + ' onResult:'
			}
			
		methodType + ' (void)' + parameterSection + '(void (^)(' + returnType + ', NSError *error))resultBlock'
	}
	
	def private parameterCallClause(DataSourceAccessMethod it) {
		'WithParameter:' + it.considerableParameters.map['self.' + it.name].join(' and:')
	}
	
	def dataAccessMethodCall(DataSourceAccessMethod it) {
		val parameterSection = 
			if (it.considerableParameters.size == 0) {
				name + ':'
			} else {
				name + parameterCallClause + ' onResult:'
			}
			
		parameterSection + '^(' + returnType + ', NSError *error)'
	}
	
}

class EntityDataAccessHeaderFileCompiler {
	
	@Inject extension TypeExtensions
	@Inject extension DataAccessMethodCompiler
	@Inject extension DataAccessImportHelper
	
	def compileHeaderFile(DataSource it) '''
		«compileHeaderImports»
		
		@interface «resourceType.typeName» (DataAccess)
		«FOR method: methods»
			«method.dataAccessMethodName»;
		«ENDFOR»
		@end
	'''
	
}

class EntityDataAccessModuleFileCompiler {
	
	@Inject extension EntityDataAccessExtensions
	@Inject extension TypeExtensions
	@Inject extension RESTURLExtensions
	@Inject extension APIClientClassExtensions
	@Inject extension DataAccessImportHelper
	@Inject extension DataAccessMethodCompiler
	
	def mappingClassName(Entity it) {
		typeName + '+' + 'DataMapping'
	}
	
	def compileModuleFile(DataSource it) '''
		«compileModuleImports»
		
		@implementation «resourceType.typeName» (DataAccess)
		
		«FOR method: methods»
			«method.compileRESTMethod»
			
		«ENDFOR»
		@end
	'''
	
	def compileRESTMethod(DataSourceAccessMethod it) {
		switch restSpecification.verb {
			case RESTVerb.GET: {
				if (returnsMany) compileGETLISTMethod
				else compileGETMethod
			}
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
		
		«dataAccessMethodName»
		{
			[[«resourceType.apiClientClassName» sharedClient] GET:«urlConstantForRESTMethod» parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
			{
				NSArray *elementsFromJSON = responseObject;
				NSMutableArray *result = [[NSMutableArray alloc] initWithCapacity:[elementsFromJSON count]];
				for (NSDictionary *attributes in elementsFromJSON) {
					«resourceType.typeName» *mappedElement = [[«resourceType.typeName» alloc] initWithAttributes:attributes];
					[result addObject:mappedElement];
				}
		
				if (resultBlock) {
					resultBlock([result copy], nil);
				}
			} failure:^(NSURLSessionDataTask *task, NSError *error)
			{
				if (resultBlock) {
					resultBlock(@[], error);
				}
			}];
		}
	'''
	
	def compileGETMethod(DataSourceAccessMethod it) '''
		// TODO generate GET method for single items:
		// «dataAccessMethodName»
	'''
	
	def compilePOSTMethod(DataSourceAccessMethod it) '''
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";

		«dataAccessMethodName»
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] POST:«urlConstantForRESTMethod» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«resourceType.typeName» *postedElement = responseObject;
				if(resultBlock) {
					resultBlock(postedElement, nil);
				}
			} failure:^(NSURLSessionDataTask *task, NSError *error)
			{
				if(resultBlock) {
					resultBlock(nil, error);
				}
			}];
		}
	'''
	
	def compilePUTMethod(DataSourceAccessMethod it) '''
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";
		
		«dataAccessMethodName»
		{
			NSDictionary *elementDictionary = [self attributes];
			[[«resourceType.apiClientClassName» sharedClient] PUT:«urlConstantForRESTMethod» parameters:elementDictionary success:^(NSURLSessionDataTask *task, id responseObject)
			{
				«resourceType.typeName» *postedElement = responseObject;
				if(resultBlock) {
					resultBlock(postedElement, nil);
				}
			} failure:^(NSURLSessionDataTask *task, NSError *error)
			{
				if(resultBlock) {
					resultBlock(nil, error);
				}
			}];
		}
	'''
	
	def composeUrlString(DataSourceAccessMethod it) {
		'[NSString stringWithFormat:' + urlConstantForRESTMethod + 
//		', ' + restSpecification.path.variables.join(', ') + 
		', ' + composeUrlVariables +
		']'
	}
	
	def composeUrlVariables(DataSourceAccessMethod it) {
		val paramInEntity = parametersInEntity.name
		restSpecification.path.variables.map[
			if (it.variableName == paramInEntity) {
				'self' + variableTail
			}
			else {
				it
			}
		].join(', ')
	}
	
	private def variableName(String variableExpression) {
		val dot = variableExpression.indexOf('.')
		if (dot > 0) {
			variableExpression.substring(0, dot)
		}
		else {
			variableExpression
		}
	}
	
	private def variableTail(String variableExpression) {
		val dot = variableExpression.indexOf('.')
		if (dot > 0) {
			variableExpression.substring(dot)
		}
		else {
			""
		}
	}
	
	def compileDELETEMethod(DataSourceAccessMethod it) '''
		static NSString *const «urlConstantForRESTMethod» = @"«restSpecification.path.value»";
		
		«dataAccessMethodName»
		{
			NSString *urlString = «composeUrlString»;
			[[«resourceType.apiClientClassName» sharedClient] DELETE:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject)
			{
				if(resultBlock) {
					resultBlock(self, nil);
				}
			} failure:^(NSURLSessionDataTask *task, NSError *error)
			{
				if(resultBlock) {
					resultBlock(nil, error);
				}
			}];
		}
	'''
	
}

// TODO We really should introduce a full blown import manager
class DataAccessImportHelper {
	
	@Inject extension TypeExtensions
	@Inject extension FileNameExtensions
	@Inject extension APIClientClassExtensions
	@Inject extension DataAccessClassExtensions
	@Inject extension EntityClassExtensions
	
	def private mappingClassName(Entity it) {
		typeName + '+' + 'DataMapping'
	}
	
	def compileHeaderImports(DataSource it) '''
		#import <Foundation/Foundation.h>
		#import "«resourceType.entityModelHeaderFileName»"
		
		«val importedFileNames = importedHeaderFilesForDataSourceAccessMethods»
		«val uniqueFileNames = importedFileNames.unique»
		«FOR fileName: uniqueFileNames»
			#import "«fileName»"
		«ENDFOR»
	'''
	
	def compileModuleImports(DataSource it) '''
		#import "«resourceType.entityDataAccessCategoryHeaderFileName»"
		#import "«resourceType.apiClientClassName.headerFileName»"
		#import "«resourceType.mappingClassName.headerFileName»"

		«val importedFileNames = importedHeaderFilesForDataSourceAccessMethods»
		«val uniqueFileNames = importedFileNames.unique»
		«FOR fileName: uniqueFileNames»
			#import "«fileName»"
		«ENDFOR»
	'''
	
	def unique(Iterable<String> strings) {
		val unique = newHashSet()
		unique.addAll(strings)
		unique
	}
	
	def importedHeaderFilesForDataSourceAccessMethods(DataSource it) {
		methods.map[declaredParameters].flatten.map[type].filter(Entity).map[entityModelHeaderFileName]
	}
}

class DataAccessUrlHelper {
	
}
