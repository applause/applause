package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.supportfiles.MainClassModuleFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Main Class Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension MainClassModuleFileCompiler
	
	def void isGeneratedModuleFile(CharSequence expectedGeneratedCode) {
		val result = compileModuleFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	/**
	 * Any model will result in the following implementation code for `main.m`:
	 */
	describe "Main class" {
		
		/**
		 * @filter('''|.isGenerated.*)
		 */
		fact "Implementation file" {
			'''
				#import <UIKit/UIKit.h>
				
				#import "AppDelegate.h"
				
				int main(int argc, char * argv[])
				{
				    @autoreleasepool {
				        return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));
				    }
				}
			'''.isGeneratedModuleFile()
		}
		
	}
	
}