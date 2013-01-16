package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.util.xcode.project.XcodeGroup
import org.applause.util.xcode.project.XcodeProject
import org.applause.util.xcode.project.XcodeProjectFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import static extension org.applause.util.xcode.project.XcodeProjectObjectExtensions.*

class ProjectFileSystemAccess {
	IFileSystemAccess fsa
	Resource resource

	XcodeProject project
	XcodeGroup mainSourceGroup
	
	@Inject extension ProjectExtensions
	@Inject XcodeProjectFactory xcodeProjectFactory
	
	def setFsa(IFileSystemAccess fsa) {
		this.fsa = fsa
	}
	
	def setResource(Resource resource) {
		this.resource = resource
	}
	
	def private void setupProject() {
		project().setup
		mainGroup().setup
		mainSourceGroup().setup
	}
	
	// syntactic sugar!
	def setup(XcodeProject project) { project }
	def setup(XcodeGroup group) { group }
	
	def project() {
		if (project == null) {
			project = xcodeProjectFactory.create
		}
		project
	}
	
	def mainGroup() {
		project().mainGroup
	}
	
	def mainSourceGroup() {
		if (mainSourceGroup == null) {
			mainSourceGroup = mainGroup().createGroup(resource.sourceGroupName.toPath)
		}
		mainSourceGroup
	}
	
	def productsGroup() {
		project().productsGroup	
	}
	
	def frameworksGroup() {
		project().frameworksGroup
	}
	
	def mainTarget() {
	}
	
	def createPrecompiledHeaderFile(XcodeGroup group, String outlet, String name, CharSequence contents) { 
		val file = group.createPrecompiledHeaderFile(name.toPath)
		val filePath = file.projectRelativePath
		fsa.generateFile(filePath, outlet, contents)
		file
	}
	
	def createPlistFile(XcodeGroup group, String outlet, String name, CharSequence contents) {
		group.createPlistFile(name.toPath) => [
			val filePath = projectRelativePath
			fsa.generateFile(filePath, outlet, contents)
		]
	}
	
	def createHeaderFile(XcodeGroup group, String outlet, String name, CharSequence contents) { 
		val file = group.createHeaderFile(name.toPath)
		val filePath = file.projectRelativePath
		fsa.generateFile(filePath, outlet, contents)
	}

	def createModuleFile(XcodeGroup group, String outlet, String name, CharSequence contents) { 
		val file = group.createModuleFile(name.toPath)
		val filePath = file.projectRelativePath
		fsa.generateFile(filePath, outlet, contents)
	}
	
	def void saveProject() {
		project.finishPbxFile(mainGroup)
		
		val projectString = project.toString
		val pbxprojFilename = resource.xcodeprojName + '/project.pbxproj'
		fsa.generateFile(pbxprojFilename,  IosOutputConfigurationProvider::OUTPUT_XCODEPROJ, projectString)
	}

	def void finishPbxFile(XcodeProject project, XcodeGroup mainGroup) {
//		// Build configuration list for PBXProject MyTestProject
//		
//		
//		// Build configuration list for PBXNativeTarget MyTestProject
//		val buildConfigurationRelease = applicationTarget.createBuildConfiguration("Release")
////		buildConfigurationRelease.precompilePrefixHeader = true
////		buildConfigurationRelease.prefixHeaderFileName = '"MyTestProject/MyTestProject-Prefix.pch"'
////		buildConfigurationRelease.infoPListFile = '"MyTestProject/MyTestProject-Info.plist"'
////		buildConfigurationRelease.productName = '"$(TARGET_NAME)"'
////		buildConfigurationRelease.wrapperExtension = "app"
//		
//		
//
//		val buildConfigurationDebug = applicationTarget.createBuildConfiguration("Debug")
//		buildConfigurationDebug.setSetting("GCC_PRECOMPILE_PREFIX_HEADER", "YES")
//		buildConfigurationDebug.setSetting("GCC_PREFIX_HEADER", '"MyTestProject/MyTestProject-Prefix.pch"')
//		buildConfigurationDebug.setSetting("INFOPLIST_FILE", '"MyTestProject/MyTestProject-Info.plist"')
//		buildConfigurationDebug.setSetting("PRODUCT_NAME", '"$(TARGET_NAME)"')
//		buildConfigurationDebug.setSetting("WRAPPER_EXTENSION", "app")		
	} 
	
	
}