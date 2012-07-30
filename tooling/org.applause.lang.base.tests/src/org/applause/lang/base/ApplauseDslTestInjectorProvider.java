package org.applause.lang.base;

import org.applause.lang.ApplauseDslInjectorProvider;

import com.google.inject.Injector;

public class ApplauseDslTestInjectorProvider extends ApplauseDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new ApplauseDslTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}
