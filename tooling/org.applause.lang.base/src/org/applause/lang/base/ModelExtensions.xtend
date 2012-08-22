package org.applause.lang.base

import org.eclipse.emf.ecore.EObject
import org.applause.lang.applauseDsl.Application

class ModelExtensions {

	/**
	 * Retrieves the main application model element.
	 */
	def application(EObject element) {
		element.eResource.allContents.filter(typeof(Application)).head
	}
	
}