package org.applause.lang.generator.ios.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity

class TypeExtensions {
	
	def typeName(Entity it) {
		if (it != null) it.name
		else "NSObject"
	}
	
	// TODO simplified implementation, we will need an import manager later!
	def typeName(Attribute it) {
		return switch type.name {
			case "String": "NSString"
			default: type.name
		}
	}
	
}