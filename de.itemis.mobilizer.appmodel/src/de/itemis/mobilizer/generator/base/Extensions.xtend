package de.itemis.mobilizer.generator.base

import de.itemis.mobilizer.appModelDsl.Application
import de.itemis.mobilizer.appModelDsl.Model
import de.itemis.mobilizer.appModelDsl.ContentProvider

class Extensions {
	
	model(Application app) {
		app.eContainer as Model
	}
	
	modelElements(Application app) {
		// TODO: sorting does not work
		app.model.elements //.sortBy(e|e.name)
	}
	
	providersWithImplementation(Application app) {
		app.modelElements.filter(typeof(ContentProvider))
	} 
	
}