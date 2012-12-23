package org.applause.lang.base.importmanager.classbased;

import org.applause.lang.base.importmanager.JnarioSpecCreator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ClassBasedSpecCreator extends JnarioSpecCreator {

	private static IInjectorProvider injectorProvider = new ClassBasedInjectorProvider();	

	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
