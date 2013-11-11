package org.applause.lang.generator.android.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class AndroidGeneratorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AndroidGeneratorActivator.getDefault().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AndroidGeneratorActivator.getDefault().getInjector();
	}
	
}
