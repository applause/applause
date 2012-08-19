package org.applause.lang.generator.android

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Type

class ImportManager extends org.applause.lang.base.ImportManager {
	
	@Inject extension org.applause.lang.base.TypeExtensions
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.addAll("java.lang")
	}
	

	override isPrimitiveType(Type type) {
		type.typeName == 'boolean'
	}
	
	override listType() {
		'java.util.List'
	}
	
	override multiplicityTyped(Type it) {
		listType + '<' + it.serialize + '>'
	}
	
}