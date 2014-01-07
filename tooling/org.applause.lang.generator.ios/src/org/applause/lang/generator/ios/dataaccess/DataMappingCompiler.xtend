package org.applause.lang.generator.ios.dataaccess

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.FileNameExtensions
import org.applause.lang.generator.ios.ICompilerModule
import org.applause.lang.generator.ios.model.EntityClassExtensions
import org.applause.lang.generator.ios.model.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*;

class DataMappingCompiler implements ICompilerModule {
	
	@Inject extension DataMappingExtensions
	@Inject extension EntityDataMappingHeaderFileCompiler
	@Inject extension EntityDataMappingModuleFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.dataMappingHeaderFileName, IOS_OUTPUT_DATAACCESS, it.compileHeaderFile)
			fsa.generateFile(it.dataMappingModuleFileName, IOS_OUTPUT_DATAACCESS, it.compileModuleFile)
		]
	}
	
}

class DataMappingExtensions {
	@Inject extension TypeExtensions
	@Inject extension FileNameExtensions
	
	val categoryName = "DataMapping"
	
	def dataMappingHeaderFileName(Entity it) {
		(typeName + '+' + categoryName).headerFileName
	}
	def dataMappingModuleFileName(Entity it) {
		(typeName + '+' + categoryName).moduleFileName
	}
}

class EntityDataMappingHeaderFileCompiler {
	
	@Inject extension EntityClassExtensions
	@Inject extension TypeExtensions
	
	def compileHeaderFile(Entity it) '''
		#import <Foundation/Foundation.h>
		#import "«entityModelHeaderFileName»"
		
		@interface «typeName» (DataMapping)
		- (id)initWithAttributes:(NSDictionary *)attributes;
		
		- (NSDictionary *)attributes;
		@end
	'''
	
}

class EntityDataMappingModuleFileCompiler {
	
	@Inject extension TypeExtensions
	@Inject extension EntityClassExtensions
	@Inject extension DataMappingExtensions
	
	def compileModuleFile(Entity it) '''
		#import "«entityModelHeaderFileName»"
		#import "«dataMappingHeaderFileName»"
		
		@implementation «typeName» (DataMapping)
		- (id)initWithAttributes:(NSDictionary *)attributes
		{
			self = [super init];
			if (self) {
				«FOR attribute: it.attributes»
					«attribute.compileAttributeToPropertyMapping»
				«ENDFOR»
			}
		
			return self;
		}
		
		- (NSDictionary *)attributes
		{
			NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];
			«FOR attribute: it.attributes»
				«attribute.compilePropertyToAttributeMapping»
			«ENDFOR»
			return attributes;
		}
		@end
	'''
	
	def compilePropertyToAttributeMapping(Attribute it) {
		switch (typeName) {
			case "NSString": 
				'''
					if (self.«propertyName» != nil) {
						attributes[@"«propertyName»"] = self.«propertyName»;
					}
				'''
			case "NSDate":
				'''
					NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];
					[dateFormatter setTimeStyle:NSDateFormatterNoStyle];
					[dateFormatter setDateStyle:NSDateFormatterShortStyle];
					NSString *«propertyName»String = [dateFormatter stringFromDate:self.dueDate];
					if («propertyName»String != nil) {
						attributes[@"«propertyName»"] = «propertyName»String;
					}
				'''
			case "BOOL":
				'''
					attributes[@"«propertyName»"] = [NSNumber numberWithBool:self.«propertyName»];
				'''
		}
	}
	
	def compileAttributeToPropertyMapping(Attribute it) {
		switch (typeName) {
			case "NSString": 
				'''
					self.«propertyName» = [attributes valueForKeyPath:@"«it.name»"];
				'''
			case "NSDate":
				'''
					NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];
					[dateFormatter setTimeStyle:NSDateFormatterNoStyle];
					[dateFormatter setDateStyle:NSDateFormatterShortStyle];
					self.«propertyName» = [dateFormatter dateFromString:[attributes valueForKeyPath:@"«it.name»"]];
				'''
			case "BOOL":
				'''
					self.«propertyName» = [[attributes valueForKeyPath:@"«it.name»"] boolValue];
				'''
		}
	}
	
}
