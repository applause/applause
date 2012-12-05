package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.util.xcode.project.XcodeGroup
import org.applause.util.xcode.project.XcodeProject
import org.applause.util.xcode.project.XcodeProjectFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import org.applause.util.xcode.project.CLanguageDialect
import org.applause.util.xcode.project.CxxLanguageDialect
import org.applause.util.xcode.project.GCCVersion
import org.applause.util.xcode.project.IOSVersion
import org.applause.util.xcode.project.SDKRoot

class ProjectFileSystemAccess {
	IFileSystemAccess fsa
	Resource resource

	XcodeProject project
	XcodeGroup mainGroup
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
		if (mainGroup == null) {
			mainGroup = project().createMainGroup
		}
		mainGroup
	}
	
	def mainSourceGroup() {
		if (mainSourceGroup == null) {
			mainSourceGroup = mainGroup().createGroup(resource.sourceGroupName.toPath)
		}
		mainSourceGroup
	}
	
	def createHeaderFile(XcodeGroup group, String outlet, String fqn, String name, CharSequence header) { 
		fsa.generateFile(fqn, outlet, header)
		group.createHeaderFile(name.toPath)			
	}

	def createModuleFile(XcodeGroup group, String outlet, String fqn, String name, CharSequence header) { 
		fsa.generateFile(fqn, outlet, header)
		group.createModuleFile(name.toPath)			
	}
	
	def saveProject() {
		project.finishPbxFile(mainGroup)
		
		val projectString = project.toString
		val pbxprojFilename = resource.xcodeprojName + '/project.pbxproj'
		fsa.generateFile(pbxprojFilename,  IosOutputConfigurationProvider::OUTPUT_XCODEPROJ, projectString)
	}

	def void finishPbxFile(XcodeProject project, XcodeGroup mainGroup) {
		// MyTestProject group
		val groupEmptyApplicationProject = mainGroup.createGroup("MyTestProject".toPath)
		val appDelegeateHeaderFile = groupEmptyApplicationProject.createHeaderFile("AppDelegate.h".toPath)
		val appDelegateModuleFile = groupEmptyApplicationProject.createModuleFile("AppDelegate.m".toPath)
		
		// Supporting Files (this group does not have a physical folder)
		val groupSupportingFilesEAP = groupEmptyApplicationProject.createGroup("Supporting Files")
		val mainModuleFile = groupSupportingFilesEAP.createModuleFile("main.m".toPath)
		groupSupportingFilesEAP.createPlistFile("MyTestProject-Info.plist".toPath)
		groupSupportingFilesEAP.createHeaderFile("MyTestProject-Prefix.pch".toPath)
		
		// Frameworks group
		val groupFrameworks = mainGroup.createGroup("Frameworks")
		groupFrameworks.createFrameworkFile("System/Library/Frameworks/UIKit.framework".toPath)
		

		// Products group
		val groupProducts = mainGroup.createGroup("Products")
		groupProducts.productsGroup = true
		val applicationFile = groupProducts.createAppFile("MyTestProject.app".toPath)
		val octestFile = groupProducts.createOCTestFile("MyTestProjectTests.octest".toPath)
		
		// MyTestProject app target
		val applicationTarget = project.createApplicationTarget("MyTestProject", applicationFile)
		applicationTarget.productName = "MyTestProject" 
		applicationTarget.add(appDelegateModuleFile)
		
		val applicationTestTarget = project.createApplicationTarget("MyTestProjectTests", octestFile)
		applicationTestTarget.productName = "MyTestProjectTests" 
		applicationTestTarget.add(appDelegateModuleFile)
		
		// Build configuration list for PBXProject MyTestProject
		val buildConfigurationProject = project.createBuildConfiguration("Release")
		buildConfigurationProject.alwaysSearchUserPaths = false
		buildConfigurationProject.enableArc = true
		buildConfigurationProject.warnDuplicateMethods = true
		buildConfigurationProject.warnAboutReturnType = true
		buildConfigurationProject.warnUninitializedAutos = true
		buildConfigurationProject.warnUnusedVariables = true
		buildConfigurationProject.validateProduct = true
		buildConfigurationProject.SDKRoot = SDKRoot::iPhoneOS
		buildConfigurationProject.iOSDeploymentTarget = IOSVersion::iOS_51
		buildConfigurationProject.stripDebugSymbolsDuringCopy = true
		buildConfigurationProject.codeSigningIdentity = '"iPhone Developer"'
		buildConfigurationProject.architectures = '"$(ARCHS_STANDARD_32_BIT)"'
		buildConfigurationProject.gccVersion = GCCVersion::LLVM_41
		buildConfigurationProject.cLanguageDialect = CLanguageDialect::GNU99
		buildConfigurationProject.cxxLanguageDialect = CxxLanguageDialect::CXX_11
		buildConfigurationProject.blockAssertions = true
		
		val buildConfigurationProjectDebug = project.createBuildConfiguration("Debug")
		buildConfigurationProjectDebug.alwaysSearchUserPaths = false
		buildConfigurationProjectDebug.enableArc = true
		buildConfigurationProjectDebug.warnDuplicateMethods = true
		buildConfigurationProjectDebug.warnAboutReturnType = true
		buildConfigurationProjectDebug.warnUninitializedAutos = true
		buildConfigurationProjectDebug.warnUnusedVariables = true
		buildConfigurationProjectDebug.validateProduct = true
		buildConfigurationProjectDebug.SDKRoot = SDKRoot::iPhoneOS
		buildConfigurationProjectDebug.iOSDeploymentTarget = IOSVersion::iOS_51
		buildConfigurationProjectDebug.stripDebugSymbolsDuringCopy = true
		buildConfigurationProjectDebug.codeSigningIdentity = '"iPhone Developer"'
		buildConfigurationProjectDebug.architectures = '"$(ARCHS_STANDARD_32_BIT)"'
		buildConfigurationProjectDebug.gccVersion = GCCVersion::LLVM_41
		buildConfigurationProjectDebug.cLanguageDialect = CLanguageDialect::GNU99
		buildConfigurationProjectDebug.cxxLanguageDialect = CxxLanguageDialect::CXX_11
		buildConfigurationProjectDebug.blockAssertions = true
		
		
		// Build configuration list for PBXNativeTarget MyTestProject
		val buildConfigurationRelease = applicationTarget.createBuildConfiguration("Release")
//		buildConfigurationRelease.precompilePrefixHeader = true
//		buildConfigurationRelease.prefixHeaderFileName = '"MyTestProject/MyTestProject-Prefix.pch"'
//		buildConfigurationRelease.infoPListFile = '"MyTestProject/MyTestProject-Info.plist"'
//		buildConfigurationRelease.productName = '"$(TARGET_NAME)"'
//		buildConfigurationRelease.wrapperExtension = "app"
		
		

		val buildConfigurationDebug = applicationTarget.createBuildConfiguration("Debug")
		buildConfigurationDebug.setSetting("GCC_PRECOMPILE_PREFIX_HEADER", "YES")
		buildConfigurationDebug.setSetting("GCC_PREFIX_HEADER", '"MyTestProject/MyTestProject-Prefix.pch"')
		buildConfigurationDebug.setSetting("INFOPLIST_FILE", '"MyTestProject/MyTestProject-Info.plist"')
		buildConfigurationDebug.setSetting("PRODUCT_NAME", '"$(TARGET_NAME)"')
		buildConfigurationDebug.setSetting("WRAPPER_EXTENSION", "app")		
	} 
	
	
}