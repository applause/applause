package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Type
import org.applause.lang.base.ClassBasedImportmanager

class ImportManager extends ClassBasedImportmanager {
	
	@Inject extension org.applause.lang.base.TypeExtensions
	
	override initWellknownClasses() {
		registerWellKnownClass('NSString')
		registerWellKnownClass('NSNumber')
	}
	
	override listType() {
		'NSArray'
	}
	
	override multiplicityTyped(Type it) {
		listType + '*'
	}
	
	override serialize(Type it) {
		val typeName = it.typeName
		if (it.requiresImport) {
			imports.add(typeName)
		}
		typeName
	}
	
}