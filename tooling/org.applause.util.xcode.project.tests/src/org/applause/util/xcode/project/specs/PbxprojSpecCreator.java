package org.applause.util.xcode.project.specs;

import org.applause.util.xcode.projectfile.PbxprojInjectorProvider;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class PbxprojSpecCreator extends JnarioSpecCreator {

	private static PbxprojInjectorProvider injectorProvider = new PbxprojInjectorProvider();

	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
