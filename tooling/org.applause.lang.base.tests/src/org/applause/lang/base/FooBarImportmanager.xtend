package org.applause.lang.base

import org.applause.lang.base.ImportManager
import org.applause.lang.applauseDsl.Type
import com.google.inject.Inject

class FooBarImportmanager extends ImportManager {
	
	@Inject extension TypeExtensions
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.add('foo.base')
	}
	
	override isPrimitiveType(Type type) {
		'zap'.equals(type.typeName)
	}
	
}