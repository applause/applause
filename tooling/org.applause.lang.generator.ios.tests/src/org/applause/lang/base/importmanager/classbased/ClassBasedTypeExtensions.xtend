package org.applause.lang.base.importmanager.classbased

import org.applause.lang.base.TypeExtensions

class ClassBasedTypeExtensions extends TypeExtensions {
	
	override toFilePath(String path) {
		path.replace('\\.', '/')
	}
	
}