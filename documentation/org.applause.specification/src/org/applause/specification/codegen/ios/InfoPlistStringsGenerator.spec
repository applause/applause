package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.supportfiles.InfoPlistStringsFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Info Plist Strings Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension InfoPlistStringsFileCompiler
	
	def void isGeneratedModuleFile(CharSequence expectedGeneratedCode) {
		val result = compilePlistStringsFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	/**
	 * Any model will result in the following implementation code for `main.m`:
	 */
	describe "Plist Strings file" {
		
		/**
		 * @filter('''|.isGenerated.*)
		 */
		fact "Plist Strings file" {
			'''
				/* Localized versions of Info.plist keys */
			'''.isGeneratedModuleFile()
		}
		
	}
	
}