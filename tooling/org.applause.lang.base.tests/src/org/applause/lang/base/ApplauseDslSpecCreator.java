package org.applause.lang.base;

import org.applause.lang.base.importmanager.JnarioSpecCreator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ApplauseDslSpecCreator extends JnarioSpecCreator {

	private static IInjectorProvider injectorProvider = new ApplauseDslTestInjectorProvider();	

	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
