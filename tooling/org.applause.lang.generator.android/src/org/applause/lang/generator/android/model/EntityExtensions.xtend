package org.applause.lang.generator.android.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.android.platform.PlatformExtensions
import org.applause.lang.generator.android.namespace.NamespaceExtensions

class EntityExtensions {
	
	@Inject extension PlatformExtensions
	@Inject extension NamespaceExtensions
	
	def fileName(Entity entity) {
		entity.fqn.toFilePath + ".java"
	}
	
	def fqn(Entity entity) {
		entity.namespace + '.' + entity.typeName 
	}
	
	def dispatch typeName(Entity entity) {
		entity.name;
	}
	
	def dispatch typeName(DataType type) {
		val androidPlatforms = type.platformConfigurations
		androidPlatforms.findFirst[mappings.exists[it.type == type]].mappings.findFirst[it.type == type].name
	}
	
	def dispatch typeName(Attribute attribute) {
		attribute.type.typeName
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