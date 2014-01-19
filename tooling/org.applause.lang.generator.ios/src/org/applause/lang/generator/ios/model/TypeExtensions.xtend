package org.applause.lang.generator.ios.model

import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.Type
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.Platform
import org.applause.lang.applauseDsl.TypeMapping
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Parameter

class TypeExtensions {
	
	// TODO hardcoded access to iOS platform
	def platform(EObject it) {
		val model = EcoreUtil2.getContainerOfType(it, typeof(Model))
		model.elements.filter(Platform).filter[name == 'iOS'].head
	}
	
	def platformMapping(Type that) {
		that.platform.mappings.filter(TypeMapping).findFirst[type.name == that.name]
	}
	
	def dispatch String typeName(Type it) {
		if (it != null) it.name
	}
	
	def dispatch String typeName(DataType it) {
		if (it != null) it.platformMapping.simpleName
	}
	
	def dispatch String typeName(Parameter it) {
		if (it != null) it.type.typeName
	}
	
	def dispatch String typeName(Entity it) {
		if (it != null) it.name
		else "NSObject"
	}
	
	// TODO simplified implementation, we will need an import manager later!
	def dispatch String typeName(Attribute it) {
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
	
	def isScalar(Type it) {
		return switch name {
			case "Bool": true
			default: false
		}
	}
	
}