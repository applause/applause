package org.applause.specification.codegen.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Model
import org.applause.lang.generator.ios.supportfiles.PlistFileCompiler
import org.applause.specification.ApplauseDslInjectorProvider
import org.applause.specification.ApplauseDslTestCreator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.jnario.runner.CreateWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@InjectWith(ApplauseDslInjectorProvider)
@CreateWith(typeof(ApplauseDslTestCreator))
describe "Plist Generator"{
	
	@Inject extension ParseHelper<Model>
	@Inject extension PlistFileCompiler
	
	def void isGeneratedModuleFile(CharSequence expectedGeneratedCode) {
		val result = compilePlistFile
		assertThat(result.toString, equalTo(expectedGeneratedCode.toString))
	}
	
	/**
	 * Any model will result in the following implementation code for `main.m`:
	 */
	describe "Plist file" {
		
		/**
		 * @filter('''|.isGenerated.*)
		 */
		fact "Plist file" {
			'''
				<?xml version="1.0" encoding="UTF-8"?>
				<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
				<plist version="1.0">
				<dict>
					<key>CFBundleDevelopmentRegion</key>
					<string>en</string>
					<key>CFBundleDisplayName</key>
					<string>${PRODUCT_NAME}</string>
					<key>CFBundleExecutable</key>
					<string>${EXECUTABLE_NAME}</string>
					<key>CFBundleIdentifier</key>
					<string>org.applause.${PRODUCT_NAME:rfc1034identifier}</string>
					<key>CFBundleInfoDictionaryVersion</key>
					<string>6.0</string>
					<key>CFBundleName</key>
					<string>${PRODUCT_NAME}</string>
					<key>CFBundlePackageType</key>
					<string>APPL</string>
					<key>CFBundleShortVersionString</key>
					<string>1.0</string>
					<key>CFBundleSignature</key>
					<string>????</string>
					<key>CFBundleVersion</key>
					<string>1.0</string>
					<key>LSRequiresIPhoneOS</key>
					<true/>
					<key>UIRequiredDeviceCapabilities</key>
					<array>
						<string>armv7</string>
					</array>
					<key>UISupportedInterfaceOrientations</key>
					<array>
						<string>UIInterfaceOrientationPortrait</string>
						<string>UIInterfaceOrientationLandscapeLeft</string>
						<string>UIInterfaceOrientationLandscapeRight</string>
					</array>
				</dict>
				</plist>
			'''.isGeneratedModuleFile()
		}
		
	}
	
}