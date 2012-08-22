package org.applause.lang.base.importmanager.namespacebased

import org.applause.lang.applauseDsl.Type
import org.applause.lang.base.NamespaceBasedImportManager

class FooBarImportmanager extends NamespaceBasedImportManager {
	
	override initWellknownNamespaces() {
		wellKnownNamespaces.add('foo.base')
	}
	
	override listType() {
		'foo.util.List'
	}
	
	override multiplicityTyped(Type type) {
		listType.serialize +  '<' + type.serialize + '>' 
	}
	
}