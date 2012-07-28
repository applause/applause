package org.applause.lang.generator.android

import org.applause.lang.applauseDsl.Entity

class TypeExtensions extends org.applause.lang.base.TypeExtensions {
	
	def fileName(Entity entity) {
		entity.fqn.toFilePath + ".java"
	}
	
	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}	
	
}