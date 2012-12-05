package org.applause.util.xcode.project;

import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Inject;

public class XcodeProjectBase {
	
	// See http://www.eclipse.org/forums/index.php/m/655755/
	//
	// We need to access the Guice injector for the Pbxproj DSL. See Jan's blog post for more detail on how to do this:
	// http://koehnlein.blogspot.de/2012/11/xtext-tip-how-do-i-get-guice-injector.html
	// As Xtend does not allow us to refer to inner interfaces, I'm doing this in this Java base class which I inherit from in XcodeProject.
	@Inject IResourceServiceProvider.Registry reg;

}
