package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.generator.ios.ProjectExtensions
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.util.xcode.project.CLanguageDialect
import org.applause.util.xcode.project.CxxLanguageDialect
import org.applause.util.xcode.project.GCCVersion
import org.applause.util.xcode.project.IOSVersion
import org.applause.util.xcode.project.SDKRoot
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import static extension org.applause.util.xcode.project.XcodeProjectObjectExtensions.*

class AppCompiler {
	
	@Inject extension ProjectExtensions
	
	@Inject AppDelegateCompiler appDelegateCompiler
	@Inject PrecompiledHeaderCompiler pchCompiler
	@Inject InfoPlistCompiler infoPlistCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		appDelegateCompiler.compile(resource, pfsa)
		pchCompiler.compile(resource, pfsa)
		infoPlistCompiler.compile(resource, pfsa)
		
		setupProducts(resource, pfsa)
		setupFrameworks(resource, pfsa)
		setupBuildConfiguration(resource, pfsa)
	}
	
	def setupProducts(Resource resource, ProjectFileSystemAccess pfsa) { 
		val productsGroup = pfsa.productsGroup
		
		// set up default product plus its target and build config
		val appFileName = resource.appName() + '.app'
		val appFile = productsGroup.createAppFile(appFileName.toPath)
		
		pfsa.project => [
			val targetName = resource.appName()
			val appTarget = createApplicationTarget(targetName, appFile)
			appTarget.createBuildConfiguration("Release") => [
				
			]
			appTarget.createBuildConfiguration("Debug") => [
				precompilePrefixHeader = true
				
				val pchFilePath = pchCompiler.file.projectRelativePath
				prefixHeaderFileName = '"' + pchFilePath +  '"'
			
				val infoPlistFilePath = infoPlistCompiler.file.projectRelativePath
				infoPListFile = '"' + infoPlistFilePath + '"'
				
				productName = '"$(TARGET_NAME)"'
				wrapperExtension = "app"
			]
		]
		
	}

	// TODO figure out a smart way how individual compilers can add frameworks.
	// Should be similar to the ImportManager. 
	// For now, let's just add them here. 	
	def setupFrameworks(Resource resource, ProjectFileSystemAccess pfsa) {
		pfsa.frameworksGroup => [
			createFrameworkFile("System/Library/Frameworks/UIKit.framework".toPath)
		]
	}
	
	def setupBuildConfiguration(Resource resource, ProjectFileSystemAccess pfsa) {
		pfsa.project => [
			createBuildConfiguration("Release") => [
				alwaysSearchUserPaths = false
				enableArc = true
				warnDuplicateMethods = true
				warnAboutReturnType = true
				warnUninitializedAutos = true
				warnUnusedVariables = true
				validateProduct = true
				SDKRoot = SDKRoot::iPhoneOS
				iOSDeploymentTarget = IOSVersion::iOS_51
				stripDebugSymbolsDuringCopy = true
				codeSigningIdentity = '"iPhone Developer"'
				architectures = '"$(ARCHS_STANDARD_32_BIT)"'
				gccVersion = GCCVersion::LLVM_41
				cLanguageDialect = CLanguageDialect::GNU99
				cxxLanguageDialect = CxxLanguageDialect::CXX_11
				blockAssertions = true
			]
			
			createBuildConfiguration("Debug") => [
				alwaysSearchUserPaths = false
				enableArc = true
				warnDuplicateMethods = true
				warnAboutReturnType = true
				warnUninitializedAutos = true
				warnUnusedVariables = true
				validateProduct = true
				SDKRoot = SDKRoot::iPhoneOS
				iOSDeploymentTarget = IOSVersion::iOS_51
				stripDebugSymbolsDuringCopy = true
				codeSigningIdentity = '"iPhone Developer"'
				architectures = '"$(ARCHS_STANDARD_32_BIT)"'
				gccVersion = GCCVersion::LLVM_41
				cLanguageDialect = CLanguageDialect::GNU99
				cxxLanguageDialect = CxxLanguageDialect::CXX_11
				blockAssertions = true
			]
		]
	}
	
}