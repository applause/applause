package org.applause.lang.base

import org.eclipse.emf.ecore.EObject
import org.applause.lang.applauseDsl.Application
import org.eclipse.emf.ecore.resource.Resource

class ModelExtensions {

	/**
	 * Retrieves the main application model element.
	 */
	def application(EObject element) {
		element.eResource.application
	}
	
	/**
	 * Retrieves the main application model element.
	 */
	def application(Resource resource) {
		resource.allContents.filter(typeof(Application)).head
	}
	
}