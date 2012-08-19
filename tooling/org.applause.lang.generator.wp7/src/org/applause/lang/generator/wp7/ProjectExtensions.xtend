package org.applause.lang.generator.wp7

import com.google.inject.Inject
import org.applause.lang.base.ModelExtensions
import org.eclipse.emf.ecore.EObject

class ProjectExtensions {
	
	@Inject extension ModelExtensions
	
	/**
	 * The name for the C# project inside the project solution.
	 */
	def projectName(EObject it) {
		it.application?.name
	}
	
}