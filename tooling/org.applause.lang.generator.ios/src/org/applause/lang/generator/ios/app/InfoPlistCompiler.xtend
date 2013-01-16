package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Application
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectExtensions
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import static extension org.applause.util.xcode.project.XcodeProjectObjectExtensions.*


class InfoPlistCompiler {
	
	@Inject extension ProjectExtensions	
	
	// outlet name
	public String APP_OUTPUT = IosOutputConfigurationProvider::OUTPUT_APP
	
	/**
	 * Main entry point for the Info.plist compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val appGroup = pfsa.mainSourceGroup
		
		resource.allContents.filter(typeof(Application)).forEach[
			val fileName = resource.appName + "-Info.plist"
			val infoPlistFile = pfsa.createPlistFile(appGroup, APP_OUTPUT, fileName, it.compileInfoPlist)
			pfsa.appTarget => [
				getBuildConfiguration("Release") => [
					
				]
				getBuildConfiguration("Debug") => [
					val infoPlistFilePath = infoPlistFile.projectRelativePath
					infoPListFile = '"' + infoPlistFilePath + '"'
				]
			]
		]
	}
	
	/**
	 * Compiles the header file for precompiled header files for the project.
	 */
	def compileInfoPlist(Application app) '''
		«app.compileInterface()»
	'''
	
	def compileInterface(Application app) '''
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
	'''
	
}