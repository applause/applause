package org.applause.lang.generator.android

import org.applause.lang.applauseDsl.Type
import com.google.inject.Inject

class ImportManager extends org.applause.lang.base.ImportManager {
	
	@Inject extension org.applause.lang.base.TypeExtensions
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.addAll("java.lang")
	}
	

	override isPrimitiveType(Type type) {
		type.typeName == 'boolean'
	}
	
}