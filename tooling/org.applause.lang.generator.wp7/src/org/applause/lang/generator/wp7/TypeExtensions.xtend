package org.applause.lang.generator.wp7

import org.applause.lang.applauseDsl.Entity

class TypeExtensions extends org.applause.lang.base.TypeExtensions {
	
	def fileName(Entity entity) {
		entity.fqn.toFilePath + ".cs"
	}
	
	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}	
	
}