package org.applause.lang.base

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.DataType
import org.applause.lang.applauseDsl.Model
import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.applause.lang.applauseDsl.NamespaceMapping
import org.applause.lang.applauseDsl.NamespacedElement
import org.applause.lang.applauseDsl.Type
import org.applause.lang.applauseDsl.TypeMapping
import org.applause.lang.applauseDsl.ListView
import org.applause.lang.applauseDsl.NamedElement
import org.applause.lang.applauseDsl.View

abstract class TypeExtensions {
	
	
	@Inject extension PlatformExtensions
	
	def isPrimitive(Type type) {
		val typeMapping = type.platformConfigurations.map[mappings.filter(typeof(TypeMapping)).findFirst[it.type.name == type.name]].head
		if(typeMapping != null)
			typeMapping.isPrimitive
		else
			false
	}
	
	def dispatch String typeName(Type it) {
		name
	}
	
	def dispatch String typeName(DataType type) {
		val typeMapping = type.platformConfigurations.map[mappings.filter(typeof(TypeMapping)).findFirst[it.type.name == type.name]].head
		if(typeMapping != null)
			typeMapping.simpleName
		else
			type.name as String		
	}
	
	def dispatch String typeName(Attribute it) {
		type?.typeName
	}
	
	def dispatch String typeName(View it) {
	}
	
	def dispatch String typeName(ListView it) {
		it.name + 'ViewController'
	}
	
	def private dispatch name(Model it) {
		''
	}
	
	def private dispatch name(NamespaceDeclaration it) {
		it.name
	}
	
//	def private platformspecificNamespace(TypeMapping it) {
//		val mapping = it.platformConfigurations.map[mappings.filter(typeof(NamespaceMapping)).findFirst[it.platformIndependentName == ]]
//	}
//	
	def dispatch namespace(NamespacedElement it) {
		val regularNamespace = it.eContainer.name
		val mapping = it.platformConfigurations.map[mappings.filter(typeof(NamespaceMapping)).findFirst[it.platformIndependentName == regularNamespace]].head
		if (mapping != null)
			mapping.name
		else
			regularNamespace
		//it.eContainer.name
	}
	
	def private internalNamespace(DataType type) {
		val typeMapping = type.platformConfigurations.map[mappings.filter(typeof(TypeMapping)).findFirst[it.type.name == type.name]].head
		if (typeMapping != null) {
			if (typeMapping.namespace != null) 
				typeMapping.namespace
			else
				''
		}
		else
			''
	}
	
	def dispatch namespace(DataType type) {
		val ns = type.internalNamespace()
		val mapping = type.platformConfigurations.map[mappings.filter(typeof(NamespaceMapping)).findFirst[it.platformIndependentName == ns]].head
		if (mapping != null)
			mapping.name
		else
			ns
	}
	
	def fqn(NamedElement it) {
		if (namespace != "")
			namespace + '.' + typeName
		else
			typeName + '' // HACK
	}
	
	// TODO: can remove as we've got a more generic version above?
	def fqn(Type it) {
		if (namespace != "")
			namespace + '.' + typeName
		else
			typeName + '' // HACK
	}
	
	def String toFilePath(String path)	
	
}