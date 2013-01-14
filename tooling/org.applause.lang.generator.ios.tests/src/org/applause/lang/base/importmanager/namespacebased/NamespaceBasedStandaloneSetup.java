package org.applause.lang.base.importmanager.namespacebased;

import org.applause.lang.ApplauseDslStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class NamespaceBasedStandaloneSetup extends ApplauseDslStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new NamespaceBasedRuntimeModule());
	}
	
}
