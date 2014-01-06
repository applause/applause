package org.applause.lang.generator.ios.supportfiles

import com.google.inject.Inject
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*	

class PrecompiledHeaderCompiler implements ICompilerModule {
	
	@Inject extension PrecompiledHeaderFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('Application-Prefix.pch', IOS_OUTPUT_SUPPORTFILES, compileHeaderFile)
	}
	
}

class PrecompiledHeaderFileCompiler {
	
	def compileHeaderFile() '''
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