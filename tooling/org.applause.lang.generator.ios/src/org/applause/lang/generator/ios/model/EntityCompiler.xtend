package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.Attribute

class EntityCompiler {
	
	@Inject extension EntityInterfaceCompiler
	@Inject extension EntityModuleCompiler
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.interfaceFileName, it.compileInterface)
			fsa.generateFile(it.moduleFileName, it.compileModule)
		]
	}
	
}

class EntityInterfaceCompiler {
	
	def interfaceFileName(Entity it) {
		name + '.h'
	}
	
	// TODO simplified implementation, we will need an import manager later!
	def typeName(Attribute it) {
		return switch type.name {
			case "String": "NSString"
			default: type.name
		}
	}
	
	def propertyName(Attribute it) {
		name
	}
	
	def compileInterface(Entity it) '''
		#import <Foundation/Foundation.h>
		
		@interface «name» : NSObject
			«FOR attribute: attributes»
		«attribute.compile»
			«ENDFOR»
		@end
	'''
	
	def compile(Attribute it) '''
		@property (nonatomic, strong) «typeName» *«propertyName»;
	'''
	
}

class EntityModuleCompiler {
	
	def moduleFileName(Entity it) {
		name + '.m'
	}
	
	def compileModule(Entity it) '''
		#import "«name».h"
		
		@implementation «name»
		@end
	'''
}