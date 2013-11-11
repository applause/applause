package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.Attribute

class EntityCompiler {
	
	@Inject extension EntityInterfaceCompiler
	@Inject extension EntityModuleCompiler
	@Inject extension EntityExtensions
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.headerFileName, it.compileHeader)
			fsa.generateFile(it.moduleFileName, it.compileModule)
		]
	}
	
}

class EntityInterfaceCompiler {
	
	@Inject extension TypeExtensions
	
	def propertyName(Attribute it) {
		name
	}
	
	def superTypeForwardDeclaration(Entity it) '''
		«IF superType != null»
		
		@class «superType.typeName»;
		«ENDIF»
	'''
	
	def compileHeader(Entity it) '''
		#import <Foundation/Foundation.h>
		«superTypeForwardDeclaration»
		
		@interface «name» : «superType.typeName»
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
	
	@Inject extension EntityExtensions
	
	def superTypeImportDeclaration(Entity it) '''
		«IF superType != null»#import "«superType.headerFileName»"«ENDIF»
	'''
	
	def compileModule(Entity it) '''
		#import "«name».h"
		«superTypeImportDeclaration»
		
		@implementation «name»
		@end
	'''
	
}