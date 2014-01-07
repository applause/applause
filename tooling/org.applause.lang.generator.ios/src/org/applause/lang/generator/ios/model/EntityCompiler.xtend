package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*;

class EntityCompiler implements ICompilerModule {
	
	@Inject extension EntityHeaderFileCompiler
	@Inject extension EntityModuleFileCompiler
	@Inject extension EntityClassExtensions
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.entityModelHeaderFileName, IOS_OUTPUT_MODELS, it.compileHeader)
			fsa.generateFile(it.entityModelModuleFileName, IOS_OUTPUT_MODELS, it.compileModule)
		]
	}
	
}

class EntityClassExtensions {
	
	@Inject extension TypeExtensions

	def entityModelHeaderFileName(Entity it) {
		typeName + '.h'
	}
	def entityModelModuleFileName(Entity it) {
		typeName + '.m'
	}
	
	def propertyName(Attribute it) {
		name
	}
	
}

class EntityHeaderFileCompiler {
	
	@Inject extension TypeExtensions
	@Inject extension EntityClassExtensions
	
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
		«IF scalar»
			@property (nonatomic) «typeName» «propertyName»;
		«ELSE»
			@property (nonatomic, strong) «typeName» *«propertyName»;
		«ENDIF»
	'''
	
}

class EntityModuleFileCompiler {
	
	@Inject extension EntityClassExtensions
	
	def superTypeImportDeclaration(Entity it) '''
		«IF superType != null»#import "«superType.entityModelHeaderFileName»"«ENDIF»
	'''
	
	def compileModule(Entity it) '''
		#import "«name».h"
		«superTypeImportDeclaration»
		
		@implementation «name»
		@end
	'''
	
}