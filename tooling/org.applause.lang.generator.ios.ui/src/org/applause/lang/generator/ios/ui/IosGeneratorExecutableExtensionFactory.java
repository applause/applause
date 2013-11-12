package org.applause.lang.generator.ios.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class IosGeneratorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return IosGeneratorActivator.getDefault().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return IosGeneratorActivator.getDefault().getInjector();
	}
	
}
