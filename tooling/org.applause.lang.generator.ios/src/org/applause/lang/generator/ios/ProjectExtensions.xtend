package org.applause.lang.generator.ios

import com.google.inject.Inject
import org.applause.lang.base.ModelExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

class ProjectExtensions {
	
	@Inject extension ModelExtensions
	
	def xcodeprojName(Resource it) {
		it.application?.name + '.xcodeproj'
	}
	
	def xcodeprojName(EObject it) {
		it.application?.name + '.xcodeproj'
	}
	
}