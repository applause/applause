package org.applause.lang.base

import org.applause.lang.base.TypeExtensions

class FooBarTypeExtensions extends TypeExtensions {
	
	override toFilePath(String path) {
		path.replace('\\.', '/')
	}
	
}