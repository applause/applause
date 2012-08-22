package org.applause.lang.generator.ios

import org.applause.lang.applauseDsl.Entity

class TypeExtensions extends org.applause.lang.base.TypeExtensions {
	
	def moduleFileName(Entity entity) {
		entity.fqn.toFilePath + ".m"
	}
	
	def headerFileName(Entity entity) {
		entity.fqn.toFilePath + ".h"
	}
	
	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}	
	
}