package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.supportfiles.PrecompiledHeaderFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Precompiled Header Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension PrecompiledHeaderFileCompiler
	
	def void isGeneratedModuleFile(CharSequence expectedGeneratedCode) {
		val result = compileHeaderFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	/**
	 * Any model will result in the following implementation code for `Application-Prefix.pch`:
	 */
	describe "Precompiled Header" {
		
		/**
		 * @filter('''|.isGenerated.*)
		 */
		fact "Header file" {
			'''
				#import <Availability.h>
				
				#ifndef __IPHONE_3_0
				#warning "This project uses features only available in iOS SDK 3.0 and later."
				#endif
				
				#ifdef __OBJC__
				    #import <UIKit/UIKit.h>
				    #import <Foundation/Foundation.h>
				#endif	
			'''.isGeneratedModuleFile()
		}
		
	}
	
}