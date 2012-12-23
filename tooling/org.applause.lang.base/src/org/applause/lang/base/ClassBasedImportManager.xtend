package org.applause.lang.base

import com.google.inject.Inject
import java.util.HashMap
import org.applause.lang.applauseDsl.Type
import org.eclipse.xtend.lib.Property

abstract class ClassBasedImportmanager extends ImportManager {
	
	@Inject extension TypeExtensions
	
	@Property HashMap<String, String> wellknownClasses = newHashMap()
	def void initWellknownClasses()
	
	new() {
		super()
		initWellknownClasses
	}
	
	def private isWellknownClass(Type type) {
		wellknownClasses.containsKey(type.typeName)
	}
	
	def private wellknownClassHasImport(Type type) {
		wellknownClasses.get(type.typeName) != null
	}
	
	def protected registerWellKnownClass(String className, String importSpecification) {
		wellknownClasses.put(className, importSpecification)
	}

	def protected registerWellKnownClass(String className) {
		wellknownClasses.put(className, null)
	}
	
	override requiresImport(Type type) {
		!(type.primitive 
			|| (type.wellknownClass && !type.wellknownClassHasImport) 
			|| (type == thisType)
		)
	}
	
	override addImport(Type type) {
		val typeName = 
			if(type.wellknownClass) 
				wellknownClasses.get(type.typeName) 
			else 
				type.typeName as String 
		imports.add(typeName)
	}
	
	override addImport(String type) {
		imports.add(type)
	}
	
}