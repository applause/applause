package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ListView
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*


class ListViewCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String UI_OUTPUT = IosOutputConfigurationProvider::OUTPUT_UI
	
	/**
	 * Main entry point for the listview compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val modelGroup = pfsa.mainSourceGroup.createGroup("UI".toPath)
		
		resource.allContents.filter(typeof(ListView)).forEach[
//			// TODO simplify these calls!
			pfsa.createHeaderFile(modelGroup, UI_OUTPUT, it.headerFileNameFQN, it.headerFileName, it.compileHeader)
//			pfsa.createModuleFile(modelGroup, MODEL_OUPUT, it.moduleFileNameFQN, it.moduleFileName, it.compileModule)
		]
	}
	
	// -- HEADER
	
	/**
	 * Compiles the header file for an entity.
	 */
	def compileHeader(ListView listview) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = listview.compileInterface(importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def compileInterface(ListView listview, ImportManager manager) '''
		@interface «listview.typeName»«listview.extendsClause(manager)»
		@end
	'''
	
	def private imports(ImportManager importManager) '''
		«IF (!importManager.empty)»
		«FOR imprt: importManager.imports»
			#import "«imprt».h"
		«ENDFOR»
		«ENDIF»
		
	'''
	
	def private extendsClause(ListView listview, ImportManager importManager) '''
		: UITableViewController
	'''
	
	
}