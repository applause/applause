package de.itemis.mobilizer.generator.iphone

import de.itemis.mobilizer.appModelDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess

class Generator{
	 
	@Inject ApplicationDelegate
	@Inject Provider 
	 
	generate(Application app, IFileSystemAccess fsa) {
		applicationDelegate.main(app, fsa)
		provider.main(app, fsa)
	}
}