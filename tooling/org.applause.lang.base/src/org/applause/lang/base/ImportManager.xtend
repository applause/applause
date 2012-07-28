package org.applause.lang.base

import java.util.HashSet
import org.applause.lang.applauseDsl.Type
import com.google.inject.Inject

abstract class ImportManager {
	
	@Inject extension TypeExtensions
	
	val imports = new HashSet<String>
	protected val wellKnownNamespaces = new HashSet<String>
	
	new() {
		initWellknownNamespaces
	}
	
	def void initWellknownNamespaces()
	
	def getImports() {
		return imports.unmodifiableView		
	}
	
	def isEmpty() {
		imports.empty
	}
	
	def boolean isPrimitiveType(Type type)
	
	def requiresImport(Type type) {
		!(wellKnownNamespaces.contains(type.namespace) || type.isPrimitiveType)
	} 
	
	def void add(Type type) {
		if (type.requiresImport)
			imports.add(type.fqn);
	}
	
	def serialize(Type it) {
		if (it.requiresImport) {
			imports.add(it.fqn)
			it.typeName
		}
		else 
			it.typeName
	}
	
}