package org.applause.lang.base.importmanager.namespacebased;

import org.applause.lang.base.importmanager.JnarioSpecCreator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class NamespaceBasedSpecCreator extends JnarioSpecCreator {

	private static IInjectorProvider injectorProvider = new NamespaceBasedInjectorProvider();	

	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
