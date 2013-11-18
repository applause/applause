package org.applause.lang.generator.ios

class FileNameExtensions {
	
	def headerFileName(String className) {
		className + '.h'
	}
	
	def moduleFileName(String className) {
		className + '.m'
	}
	
}