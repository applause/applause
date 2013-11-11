package org.applause.lang.generator.android.model

import org.applause.lang.applauseDsl.Attribute

class AttributeExtensions {
	
	def typeName(Attribute it) {
		type.name
	}
	def setterName(Attribute it) {
		'set' + name.toFirstUpper
	}
	def getterName(Attribute it) {
		'get' + name.toFirstUpper
	}
	
}