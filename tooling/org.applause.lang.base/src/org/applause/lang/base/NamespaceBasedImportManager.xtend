package org.applause.lang.base

import org.applause.lang.base.ImportManager
import org.applause.lang.applauseDsl.Type
import com.google.inject.Inject

abstract class NamespaceBasedImportManager extends ImportManager {
	
	@Inject extension TypeExtensions
	
	def private isIdenticalNamespace(Type type) {
		if (thisType != null)
			type.namespace == thisType.namespace
		else
			false
	}
	
	override requiresImport(Type type) {
		!(wellKnownNamespaces.contains(type.namespace) || type.primitive || type.identicalNamespace)
	} 
	
	// subclasses should override this to change whether to import the namespace or the classname 
	override void addImport(Type type) {
		imports.add(type.fqn)
	}
	
	override void addImport(String type) {
		imports.add(type)
	}	
}