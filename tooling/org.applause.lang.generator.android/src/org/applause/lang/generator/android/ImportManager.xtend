package org.applause.lang.generator.android

import org.applause.lang.applauseDsl.Type
import org.applause.lang.base.NamespaceBasedImportManager

class ImportManager extends NamespaceBasedImportManager {
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.addAll("java.lang")
	}
	

	override listType() {
		'java.util.List'
	}
	
	override multiplicityTyped(Type it) {
		listType + '<' + it.serialize + '>'
	}
	
}