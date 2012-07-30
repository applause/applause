package org.applause.lang.base

import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.applauseDsl.NamespacedElement
import org.applause.lang.applauseDsl.Type
import org.applause.lang.applauseDsl.DataType
import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Model

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
			type.name as String		
	}
	
	def dispatch typeName(Attribute it) {
		type?.typeName
	}
	
	def private dispatch name(Model it) {
		''
	}
	
	def private dispatch name(NamespaceDeclaration it) {
		it.name
	}
	
	def dispatch namespace(NamespacedElement it) {
		it.eContainer.name
	}
	
	def dispatch namespace(DataType type) {
		val typeMapping = type.platformConfigurations.map[mappings.findFirst[it.type.name == type.name]].head
		if (typeMapping != null) {
			var dotIndex = typeMapping.name.lastIndexOf('.')
			if (dotIndex >= 0)
				typeMapping.name.substring(0, dotIndex)
			else
				''
		}
		else
			''
	}
	
	def fqn(Type it) {
		if (namespace != "")
			namespace + '.' + typeName
		else
			typeName + '' // HACK
	}
	
	def String toFilePath(String path)	
	
}