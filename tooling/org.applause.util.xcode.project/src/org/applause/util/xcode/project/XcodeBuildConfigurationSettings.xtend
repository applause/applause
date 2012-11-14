package org.applause.util.xcode.project

import static extension org.applause.util.xcode.project.Utilities.*

class XcodeBuildConfigurationSettings {
	
	def static setAlwaysSearchUserPaths(XcodeBuildConfiguration configuration, boolean value) { 
		configuration.setSetting("ALWAYS_SEARCH_USER_PATHS", value.truthValue)
	}
	
	def static setEnableArc(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("CLANG_ENABLE_OBJC_ARC", value.truthValue)
	}
	
	def static setWarnDuplicateMethods(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("CLANG_WARN__DUPLICATE_METHOD_MATCH", value.truthValue)
	}

	def static setWarnAboutReturnType(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("GCC_WARN_ABOUT_RETURN_TYPE", value.truthValue)
	}

	def static setWarnUninitializedAutos(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("GCC_WARN_UNINITIALIZED_AUTOS", value.truthValue)
	}

	def static setWarnUnusedVariables(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("GCC_WARN_UNUSED_VARIABLE", value.truthValue)
	}

	def static setValidateProduct(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("VALIDATE_PRODUCT", value.truthValue)
	}

	def static setSDKRoot(XcodeBuildConfiguration configuration, SDKRoot value) {
		configuration.setSetting("SDKROOT", value.toString)
	}

	def static setIOSDeploymentTarget(XcodeBuildConfiguration configuration, IOSVersion value) {
		configuration.setSetting("IPHONEOS_DEPLOYMENT_TARGET", value.toString)
	}
	
	def static setStripDebugSymbolsDuringCopy(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("COPY_PHASE_STRIP", value.toString)
	}
	
	def static setCodeSigningIdentity(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting('"CODE_SIGN_IDENTITY[sdk=iphoneos*]"', value)
	}

	/**
	 * Space-separated list of identifiers. Specifies the architectures (ABIs, processor models) to 
	 * which the binary is targeted. When this build setting specifies more than one architecture, 
	 * the generated binary may contain object code for each of the specified architectures.
	 * 
	 * @see https://developer.apple.com/library/mac/#documentation/DeveloperTools/Reference/XcodeBuildSettingRef/1-Build_Setting_Reference/build_setting_ref.html#//apple_ref/doc/uid/TP40003931-CH3-SW62
	 */
	def static setArchitectures(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting("ARCHS", value)
	}

	def static setGccVersion(XcodeBuildConfiguration configuration, GCCVersion value) {
		configuration.setSetting("GCC_VERSION", value.toString)
	}
	
	def static setCLanguageDialect(XcodeBuildConfiguration configuration, CLanguageDialect value) {
		configuration.setSetting("GCC_C_LANGUAGE_STANDARD", '"' + value.toString + '"')
	}
	
	def static setCxxLanguageDialect(XcodeBuildConfiguration configuration, CxxLanguageDialect value) {
		configuration.setSetting("CLANG_CXX_LANGUAGE_STANDARD", '"' + value.toString + '"')
	}
	
	def static setBlockAssertions(XcodeBuildConfiguration configuration, boolean value) {
		val v = if (value) 1 else 0
		val s = '"-DNS_BLOCK_ASSERTIONS=' + v + '"'
		configuration.setSetting("OTHER_CFLAGS", s)
	}
	
	def static setPrecompilePrefixHeader(XcodeBuildConfiguration configuration, boolean value) {
		configuration.setSetting("GCC_PRECOMPILE_PREFIX_HEADER", value.truthValue)
	}

	def static setPrefixHeaderFileName(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting("GCC_PRECOMPILE_PREFIX_HEADER", value)
	}

	def static setInfoPListFile(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting("INFOPLIST_FILE", value)		
	}
	
	def static setProductName(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting("PRODUCT_NAME", value)		
	}

	def static setWrapperExtension(XcodeBuildConfiguration configuration, String value) {
		configuration.setSetting("WRAPPER_EXTENSION", value)
	}

}