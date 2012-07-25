package org.applause.lang.generator.android.namespace

import org.applause.lang.applauseDsl.NamespaceDeclaration
import org.eclipse.emf.ecore.EObject

class NamespaceExtensions {
	
	def dispatch namespace(NamespaceDeclaration element) {
		element.name
	}
	
	def dispatch namespace(EObject element) {
		element.eContainer.namespace
	}
	
	def toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}
	
}