package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*

/**
 * Compiles entity headers and modules.
 */
class EntityCompiler  {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String MODEL_OUPUT = IosOutputConfigurationProvider::OUTPUT_MODEL
	
	/**
	 * Main entry point for the entity compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val modelGroup = pfsa.mainSourceGroup.createGroup("Model".toPath)
		
		resource.allContents.filter(typeof(Entity)).forEach[
			// TODO simplify these calls!
			pfsa.createHeaderFile(modelGroup, MODEL_OUPUT, it.headerFileNameFQN, it.headerFileName, it.compileHeader)
			pfsa.createModuleFile(modelGroup, MODEL_OUPUT, it.moduleFileNameFQN, it.moduleFileName, it.compileModule)
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