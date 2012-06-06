package org.applause.lang.generator.wp7.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity

class EntityExtensions {
	
	def fileName(Entity entity) {
		entity.name + ".cs"
	}
	
	def typeName(Entity entity) {
		entity.name;
	}
	
	def typeName(Attribute attribute) {
		attribute.type.name
	}
	
	def attributeName(Attribute attribute) { 
		attribute.name.toFirstUpper
	}
	
	
}