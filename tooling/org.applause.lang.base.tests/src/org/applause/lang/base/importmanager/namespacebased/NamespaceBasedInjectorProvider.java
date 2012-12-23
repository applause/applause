package org.applause.lang.base.importmanager.namespacebased;

import org.applause.lang.ApplauseDslInjectorProvider;

import com.google.inject.Injector;

public class NamespaceBasedInjectorProvider extends ApplauseDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new NamespaceBasedStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}
