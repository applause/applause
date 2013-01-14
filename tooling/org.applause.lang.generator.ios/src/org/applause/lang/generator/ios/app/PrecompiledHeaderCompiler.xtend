package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Application
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.applause.lang.generator.ios.ProjectExtensions
import org.applause.util.xcode.project.XcodeFile


class PrecompiledHeaderCompiler {
	
	@Inject extension BoilerplateExtensions
	
	@Inject extension ProjectExtensions	
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public String APP_OUTPUT = IosOutputConfigurationProvider::OUTPUT_APP
	
	/**
	 * Main entry point for the precompiled header compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val appGroup = pfsa.mainSourceGroup
		
		resource.allContents.filter(typeof(Application)).forEach[
			val fileName = resource.appName + "-Prefix.pch"
			pchFile = pfsa.createPrecompiledHeaderFile(appGroup, APP_OUTPUT, fileName, it.compilePrecompiledHeader)
		]
	}
	
	XcodeFile pchFile
	def file() {
		pchFile
	}
	
	/**
	 * Compiles the header file for precompiled header files for the project.
	 */
	def compilePrecompiledHeader(Application app) '''
		«fileHeader»
		
		// TODO actually use the import manager in the PCH file!
		«val importManager = importManagerFactory.create()»
		«importManager.addImport("<UIKit/UIKit.h>")»
		«val body = app.compileInterface(importManager)»
		«body»
	'''
	
	def compileInterface(Application app, ImportManager manager) '''
		//
		// Prefix header for all source files of the 'GithubBrowser' target in the 'GithubBrowser' project
		//

		#import <Availability.h>

		#ifndef __IPHONE_3_0
		#warning "This project uses features only available in iOS SDK 3.0 and later."
		#endif

		#ifdef __OBJC__
			#import <UIKit/UIKit.h>
			#import <Foundation/Foundation.h>
		#endif
	'''
	
}