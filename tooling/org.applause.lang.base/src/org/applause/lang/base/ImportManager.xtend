package org.applause.lang.base

import com.google.inject.Inject
import java.util.HashSet
import org.applause.lang.applauseDsl.Type

abstract class ImportManager {
	
	@Inject extension TypeExtensions
	
	val imports = new HashSet<String>
	protected val wellKnownNamespaces = new HashSet<String>
	
	new() {
		initWellknownNamespaces
	}
	
	var Type thisType
	def setThisType(Type type) {
		thisType = type
	}
	
	def void initWellknownNamespaces()
	
	def getImports() {
		return imports.unmodifiableView		
	}
	
	def isEmpty() {
		imports.empty
	}
	
	def boolean isPrimitiveType(Type type)
	
	def isIdenticalNamespace(Type type) {
		if (thisType != null)
			type.namespace == thisType.namespace
		else
			false
	}
	
	def requiresImport(Type type) {
		!(wellKnownNamespaces.contains(type.namespace) || type.isPrimitiveType || type.identicalNamespace)
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