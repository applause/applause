package org.applause.lang.generator.ios.supportfiles

import com.google.inject.Inject
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

class MainClassCompiler implements ICompilerModule {
	
	@Inject extension MainClassModuleFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('main.m', IOS_OUTPUT_SUPPORTFILES, compileModuleFile)
	}
	
}

class MainClassModuleFileCompiler {
	
	def compileModuleFile() '''
		#import <UIKit/UIKit.h>
		
		#import "AppDelegate.h"
		
		int main(int argc, char * argv[])
		{
		    @autoreleasepool {
		        return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));
		    }
		}
	'''
	
}