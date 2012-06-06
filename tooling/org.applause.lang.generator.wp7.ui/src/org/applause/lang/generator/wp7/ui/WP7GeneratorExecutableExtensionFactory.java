package org.applause.lang.generator.wp7.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class WP7GeneratorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return WP7GeneratorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return WP7GeneratorActivator.getInstance().getInjector();
	}
	
}
