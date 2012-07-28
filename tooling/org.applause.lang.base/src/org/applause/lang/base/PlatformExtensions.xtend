package org.applause.lang.base

import org.applause.lang.applauseDsl.Platform
import org.eclipse.emf.ecore.EObject

abstract class PlatformExtensions {
	
	def String platformName()
	
	def platformConfigurations(EObject element) {
		val platforms = element.eResource.allContents.toIterable.filter(typeof(Platform))
		platforms.filter[name == platformName]
	}
	
}