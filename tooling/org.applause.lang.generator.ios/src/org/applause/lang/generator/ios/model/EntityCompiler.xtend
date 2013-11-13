package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class EntityCompiler implements ICompilerModule {
	
	@Inject extension EntityHeaderFileCompiler
	@Inject extension EntityModuleFileCompiler
	@Inject extension EntityModelExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.headerFileName, it.compileHeader)
			fsa.generateFile(it.moduleFileName, it.compileModule)
		]
	}
	
}

class EntityModelExtensions {
	def headerFileName(Entity it) {
		name + '.h'
	}
	def moduleFileName(Entity it) {
		name + '.m'
	}
}

class EntityHeaderFileCompiler {
	
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

class EntityModuleFileCompiler {
	
	@Inject extension EntityModelExtensions
	
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