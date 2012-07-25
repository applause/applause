package org.applause.lang.generator.android.ui

import com.google.inject.Inject
import java.util.regex.Pattern
import org.applause.lang.ui.builder.AbstractBuildStrategy
import org.applause.lang.ui.builder.RegExUtils

class AndroidBuildStrategy extends AbstractBuildStrategy {
	@Inject extension RegExUtils
	
	// RegEx pattern for Android projects	
	val androidProjectFilePattern = Pattern::compile("AndroidManifest.xml")
	
	// true if there is a a file that ends with "AndroidManifest.xml" and it actually exists on disk 
	def private Boolean isAndroidProject() {
		platformProject.members.exists[it.name.matches(androidProjectFilePattern) && it.exists]
	}
	
	override canBuildProject() {
		androidProject
	}
	
}