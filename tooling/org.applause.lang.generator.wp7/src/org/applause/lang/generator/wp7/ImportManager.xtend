package org.applause.lang.generator.wp7

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Type

class ImportManager extends org.applause.lang.base.ImportManager {
	
	@Inject extension org.applause.lang.base.TypeExtensions
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.addAll("System")
	}
	

	override isPrimitiveType(Type type) {
		(
			type.typeName == 'string' 
			|| type.typeName == 'int'
			|| type.typeName == 'bool'
		)
	}
	
}