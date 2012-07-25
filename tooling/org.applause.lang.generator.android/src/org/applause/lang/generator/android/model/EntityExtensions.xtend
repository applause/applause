package org.applause.lang.generator.android.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity

class EntityExtensions {
	
	def fileName(Entity entity) {
		entity.name + ".java"
	}
	
	def typeName(Entity entity) {
		entity.name;
	}
	
	def typeName(Attribute attribute) {
		attribute.type.name
	}
	
	def fieldName(Attribute attribute) {
		attribute.name;
	}
	
	def setterName(Attribute attribute) {
		"set" + attribute.name.toFirstUpper
	}
	
	def getterName(Attribute attribute) {
		"get" + attribute.name.toFirstUpper
	}
}