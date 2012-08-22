package org.applause.lang.generator.wp7

import org.applause.lang.applauseDsl.Type
import org.applause.lang.base.NamespaceBasedImportManager

class ImportManager extends NamespaceBasedImportManager {
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.addAll("System")
	}
	
	override listType() {
		'List'
	}
	
	override multiplicityTyped(Type it) {
		listType + '<' + it.serialize + '>'
	}
	
}