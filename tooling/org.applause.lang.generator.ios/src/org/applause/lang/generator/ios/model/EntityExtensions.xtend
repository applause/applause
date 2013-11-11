package org.applause.lang.generator.ios.model

import org.applause.lang.applauseDsl.Entity

class EntityExtensions {
	
	def moduleFileName(Entity it) {
		name + '.m'
	}
	
	def headerFileName(Entity it) {
		name + '.h'
	}
	
}