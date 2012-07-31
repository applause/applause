package org.applause.lang.generator.wp7

import org.applause.lang.applauseDsl.Entity
import com.google.inject.Inject

class TypeExtensions extends org.applause.lang.base.TypeExtensions {
	
	@Inject extension ProjectExtensions
	
	def fileName(Entity entity) {
		entity.projectName + '/Application/Model/' + entity.typeName + '.cs'
	}
	
	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}	
	
}