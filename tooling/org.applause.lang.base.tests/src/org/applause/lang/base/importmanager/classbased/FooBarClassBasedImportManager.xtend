package org.applause.lang.base.importmanager.classbased

import org.applause.lang.base.ClassBasedImportmanager
import org.applause.lang.applauseDsl.Type

class FooBarClassBasedImportManager extends ClassBasedImportmanager {

	override initWellknownClasses() {
		registerWellKnownClass('HubbaClass', 'BaseClasses/ChewingGums')
		registerWellKnownClass('ChuppaClass')
	}
	
	override listType() {
		// TODO ensure this is tested!
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override multiplicityTyped(Type it) {
		// TODO ensure this is tested!
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	

	
}