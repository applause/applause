package org.applause.lang.base.importmanager.classbased;

import org.applause.lang.ApplauseDslInjectorProvider;

import com.google.inject.Injector;

public class ClassBasedInjectorProvider extends ApplauseDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new ClassBasedStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}
