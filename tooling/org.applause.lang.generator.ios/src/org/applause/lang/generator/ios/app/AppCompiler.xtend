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
		setupFrameworks(resource, pfsa)
		setupBuildConfigurations(resource, pfsa)
		
		appDelegateCompiler.compile(resource, pfsa)
		pchCompiler.compile(resource, pfsa)
		infoPlistCompiler.compile(resource, pfsa)
	}
	
	// TODO figure out a smart way how individual compilers can add frameworks.
	// Should be similar to the ImportManager. 
	// For now, let's just add them here. 	
	def setupFrameworks(Resource resource, ProjectFileSystemAccess pfsa) {
		pfsa.frameworksGroup => [
			createFrameworkFile("System/Library/Frameworks/UIKit.framework".toPath)
		]
	}
	
	def setupBuildConfigurations(Resource resource, ProjectFileSystemAccess pfsa) {
		
		// build configuration for the global project
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
		
		// build configurations for the app target
		pfsa.appTarget => [
			getBuildConfiguration("Release") => [
				
			]
			getBuildConfiguration("Debug") => [
				// why is this just here? Shouldn't it go into the main target configuration?
				productName = '"$(TARGET_NAME)"'
				wrapperExtension = "app"
			]
		]
		
	}
	
}