package org.applause.lang.ui.builder

import java.util.regex.Pattern

class RegExUtils {
	
	// define "matches" function on Strings to make working with RegExes easier 
	def matches(String string, Pattern pattern) {
		pattern.matcher(string).matches();
	}
	
}