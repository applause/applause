package org.applause.lang.generator.ios.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Type

class TypeExtensions {
	
	def typeName(Type it) {
		if (it != null) it.name
	}
	
	def typeName(Entity it) {
		if (it != null) it.name
		else "NSObject"
	}
	
	// TODO simplified implementation, we will need an import manager later!
	def typeName(Attribute it) {
		return switch type.name {
			case "String": "NSString"
			case "Bool": "BOOL"
			case "Date": "NSDate"
			case "Integer": "NSNumber"
			default: type.name
		}
	}
	
	def isScalar(Attribute it) {
		return switch type.name {
			case "Bool": true
			default: false
		}
	}
	
}