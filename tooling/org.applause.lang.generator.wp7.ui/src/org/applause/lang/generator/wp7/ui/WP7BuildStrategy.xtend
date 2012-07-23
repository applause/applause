package org.applause.lang.generator.wp7.ui

import java.util.regex.Pattern
import org.applause.lang.ui.builder.AbstractBuildStrategy
import com.google.inject.Inject
import org.applause.lang.ui.builder.RegExUtils

class WP7BuildStrategy extends AbstractBuildStrategy {
	
	@Inject extension RegExUtils
	
	// RegEx pattern for WP7 solution files	
	val solutionFilePattern = Pattern::compile(".*\\.sln")
	
	// true if there is a a file that ends with "*.sln" and it actually exists on disk 
	def private Boolean isWP7Solution() {
		platformProject.members.exists[name.matches(solutionFilePattern) && exists]
	}
	
	override canBuildProject() {
		isWP7Solution
	}
	
}