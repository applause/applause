package org.applause.lang.generator.ios.model

import com.google.inject.Inject

import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.base.AttributeExtensions
import org.applause.util.xcode.project.XcodeProject
import static extension org.applause.util.xcode.project.Path.*
import org.applause.util.xcode.project.XcodeGroup


/**
 * Compiles entity headers and modules.
 */
class EntityCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String MODEL_OUPUT = IosOutputConfigurationProvider::OUTPUT_MODEL
	
	/**
	 * Main entry point for the entity compiler.
	 */
	def compile(Resource resource, IFileSystemAccess fsa, XcodeProject project, XcodeGroup mainGroup) {
		val modelGroup = mainGroup.createGroup("Model".toPath) 
		
		resource.allContents.filter(typeof(Entity)).forEach[
			fsa.generateFile(it.headerFileName, MODEL_OUPUT, it.compileHeader)
			modelGroup.createHeaderFile(it.headerFileName.toPath)
			
			fsa.generateFile(it.moduleFileName, MODEL_OUPUT, it.compileModule)
			modelGroup.createModuleFile(it.moduleFileName.toPath)
		]
	}
	
	// -- HEADER
	
	/**
	 * Compiles the header file for an entity.
	 */
	def compileHeader(Entity entity) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create(entity)»
		«val body = entity.compileInterface(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileInterface(Entity entity, ImportManager manager) '''
		@interface «entity.typeName»«entity.extendsClause(manager)»
		
		«FOR attribute: entity.attributes»
			«attribute.compile(manager)»
		«ENDFOR»
				
		@end
	'''
	
	def compile(Attribute attribute, ImportManager manager) '''
		@property (strong, nonatomic) «manager.serialize(attribute.type, attribute.many)» «IF !attribute.type.primitive»*«ENDIF»«attribute.fieldName»;
	'''

	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR imprt: importManager.imports»
			#import "«imprt».h"
		«ENDFOR»
		«ENDIF»
		
	'''
	
	def private extendsClause(Entity entity, ImportManager importManager) {
		if (entity.superEntity != null) {
			": " + importManager.serialize(entity.superEntity)
		}
	}
	
	// -- MODULE
	
	/** 
	 * Compiles the module file for an entity.
	 */
	def compileModule(Entity entity) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create(entity)»
		«val body = entity.compileImplementation(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileImplementation(Entity entity, ImportManager manager) '''
		@implementation «manager.serialize(entity)»
			«FOR attribute: entity.attributes»
				@synthesize «attribute.fieldName»;
			«ENDFOR»
		@end
	'''


		
	
	
}