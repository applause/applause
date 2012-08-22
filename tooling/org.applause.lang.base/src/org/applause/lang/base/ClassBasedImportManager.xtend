package org.applause.lang.base

import org.applause.lang.applauseDsl.Type
import org.applause.lang.base.ImportManager
import com.google.inject.Inject
import org.applause.lang.base.TypeExtensions

abstract class ClassBasedImportmanager extends ImportManager {
	
	@Inject extension TypeExtensions
	
	override requiresImport(Type type) {
		!type.primitive
	}
	
	override addImport(Type type) {
		val typeName = type.typeName as String
		imports.add(typeName)
	}
	
	override addImport(String type) {
		imports.add(type)
	}
	
}