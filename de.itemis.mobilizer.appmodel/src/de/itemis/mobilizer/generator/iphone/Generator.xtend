package de.itemis.mobilizer.generator.iphone

import de.itemis.mobilizer.appModelDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess

class Generator{
	generate(Application app, IFileSystemAccess fsa) {
		fsa.generateFile("iphone_test.txt", app.name)
	}
}