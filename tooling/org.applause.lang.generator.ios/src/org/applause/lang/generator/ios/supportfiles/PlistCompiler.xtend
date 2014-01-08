package org.applause.lang.generator.ios.supportfiles

import com.google.inject.Inject
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static org.applause.lang.generator.ios.IosOutputConfigurationProvider.*

class PlistCompiler implements ICompilerModule {
	
	@Inject extension PlistFileCompiler
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('Application-Info.plist', IOS_OUTPUT_SUPPORTFILES, compilePlistFile)
	}
	
}

class PlistFileCompiler {

	public static final String PACKAGENAME = 'org.applause'
	
	def compilePlistFile() '''
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
			<string>«PACKAGENAME».${PRODUCT_NAME:rfc1034identifier}</string>
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