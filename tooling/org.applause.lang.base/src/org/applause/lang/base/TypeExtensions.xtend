package org.applause.lang.base

import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.applauseDsl.NamespacedElement
import org.applause.lang.applauseDsl.Type
import org.applause.lang.applauseDsl.DataType
import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute

abstract class TypeExtensions {
	
	
	@Inject extension PlatformExtensions
	
	def dispatch typeName(Type it) {
		name
	}
	
	def dispatch typeName(DataType type) {
		val typeMapping = type.platformConfigurations.map[mappings.findFirst[it.type.name == type.name]].head
		if(typeMapping != null)
			typeMapping.name.substring(typeMapping.name.lastIndexOf('.') + 1)
		else
			type.name		
	}
	
	def dispatch typeName(Attribute it) {
		type?.typeName
	}
	
	def dispatch namespace(NamespacedElement it) {
		(eContainer as NamespaceDeclaration).name
	}
	
	def dispatch namespace(DataType type) {
		val typeMapping = type.platformConfigurations.map[mappings.findFirst[it.type.name == type.name]].head
		var dotIndex = typeMapping.name.lastIndexOf('.')
		if (dotIndex >= 0)
			typeMapping.name.substring(0, dotIndex)
		else
			typeMapping.name
	}
	
	def fqn(Type it) {
		namespace + '.' + typeName
	}
	
	def String toFilePath(String path)	
	
}