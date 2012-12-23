package org.applause.util.xcode.project.tests

import com.google.inject.Inject
import org.applause.util.xcode.project.CLanguageDialect
import org.applause.util.xcode.project.CxxLanguageDialect
import org.applause.util.xcode.project.GCCVersion
import org.applause.util.xcode.project.IOSVersion
import org.applause.util.xcode.project.SDKRoot
import org.applause.util.xcode.project.XcodeProjectFactory
import org.applause.util.xcode.projectfile.PbxprojInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*

@InjectWith(typeof(PbxprojInjectorProvider))
@RunWith(typeof(XtextRunner))
class ProjectTests {
	
	@Inject XcodeProjectFactory projectFactory
	
	@Test
	def failingTest() {
		assertTrue(true)
	}
	
	@Test
	def createNewProject() {
		val path = "/Users/peterfriese/Projects/peterfriese.de/Applause2/applause/tooling/org.applause.util.xcode.projectfile.sample/MyTestProject/MyTestProject.xcodeproj"
		
		// Project root
		// val project = XcodeProject::createProject(path)
		val project = projectFactory.create(path)
		val mainGroup = project.createMainGroup()
		

		// MyTestProject group
		val groupEmptyApplicationProject = mainGroup.createGroup("MyTestProject".toPath)
		
		val appDelegeateHeaderFile = groupEmptyApplicationProject.createHeaderFile("AppDelegate.h".toPath)
		val appDelegateModuleFile = groupEmptyApplicationProject.createModuleFile("AppDelegate.m".toPath)
		
		// Supporting Files (this group does not have a physical folder)
		val groupSupportingFilesEAP = groupEmptyApplicationProject.createGroup("Supporting Files")
		val mainModuleFile = groupSupportingFilesEAP.createModuleFile("main.m".toPath)
		groupSupportingFilesEAP.createPlistFile("MyTestProject-Info.plist".toPath)
		groupSupportingFilesEAP.createHeaderFile("MyTestProject-Prefix.pch".toPath)
		
		
		// This group has a physical folder
		val groupSomeSubGroupEAP = groupEmptyApplicationProject.createGroup("ThisGroupHasAPhysicalFolder".toPath)
		val someSubFile = groupSomeSubGroupEAP.createModuleFile("FileInASubFolder.m".toPath)

		
		// MyTestProjectTests group
		val groupEmptyApplicationProjectTests = mainGroup.createGroup("MyTestProjectTests".toPath)
		groupEmptyApplicationProjectTests.createHeaderFile("MyTestProjectTests.h".toPath)
		groupEmptyApplicationProjectTests.createModuleFile("MyTestProjectTests.m".toPath)
		
		val groupSupportingFileEAPT = groupEmptyApplicationProjectTests.createGroup("Supporting Files")
		groupSupportingFileEAPT.createPlistFile("MyTestProjectTests-Info.plist".toPath)
		
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
		
		project.save()
		System::out.println(project.toString)
	}
}