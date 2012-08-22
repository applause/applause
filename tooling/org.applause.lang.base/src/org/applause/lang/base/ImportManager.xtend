package org.applause.lang.base

import com.google.inject.Inject
import java.util.HashSet
import org.applause.lang.applauseDsl.Type

abstract class ImportManager {
	
	@Inject extension TypeExtensions
	
	protected val imports = new HashSet<String>
	
	@Property Type thisType
	
	
	def getImports() {
		return imports.unmodifiableView		
	}
	
	def isEmpty() {
		imports.empty
	}
	
	def boolean requiresImport(Type type)
	
	// subclasses should override this to change whether to import the namespace or the classname 
	def void addImport(Type type)
	
	def void addImport(String type)
		
	def void add(Type type) {
		if (type.requiresImport)
			addImport(type)
	}
	
	def serialize(Type type) {
		if (type.requiresImport) {
			addImport(type)
		}
		type.typeName
	}
	
	def serialize(String type) {
		addImport(type)
		type
	}
	
	def String listType()
	def String multiplicityTyped(Type it)
	
	def serialize(Type it, boolean many) {
		if (many) it.multiplicityTyped
		else it.serialize
	}
	
}