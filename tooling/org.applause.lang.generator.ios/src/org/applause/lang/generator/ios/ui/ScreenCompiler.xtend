package org.applause.lang.generator.ios.ui

import org.applause.lang.applauseDsl.Screen
import org.applause.lang.generator.ios.ICompilerModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.applause.lang.applauseDsl.ScreenKind

class ScreenCompiler implements ICompilerModule {
	
	@Inject DefaultListScreenCompiler defaultListScreenCompiler 
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Screen)).forEach [
			switch (kind) {
				case ScreenKind.DEFAULT_LIST:
					defaultListScreenCompiler.doGenerate(resource, fsa)
			}
		]
	}

}
