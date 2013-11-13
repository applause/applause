package org.applause.lang.generator.ios

import org.applause.lang.applauseDsl.Entity

class EntityExtensions {
	
	def modelClassName(Entity it) {
		name.toFirstUpper
	}
	
}