package org.applause.lang.generator.ios.ui

import org.applause.lang.ui.builder.AbstractBuildStrategy
import com.google.inject.Inject
import org.applause.lang.ui.builder.RegExUtils
import java.util.regex.Pattern

class IosBuildStrategy extends AbstractBuildStrategy {
	@Inject extension RegExUtils
	
	// RegEx pattern for WP7 solution files	
	val xcodeProjectFilePattern = Pattern::compile(".*\\.xcodeproj")
	
	// true if there is a a file that ends with "*.xcodeproj" and it actually exists on disk 
	def private Boolean isXcodeProject() {
		platformProject.members.exists[it.name.matches(xcodeProjectFilePattern) && it.exists]
	}
	
	override canBuildProject() {
		isXcodeProject
	}
	
}