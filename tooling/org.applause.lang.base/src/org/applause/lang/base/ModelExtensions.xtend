package org.applause.lang.base

import org.eclipse.emf.ecore.EObject
import org.applause.lang.applauseDsl.Application

class ModelExtensions {

	/**
	 * Retrieves the main application model element.
	 */
	def application(EObject it) {
		eResource.allContents.toIterable.filter(typeof(Application)).head
	}
	
}