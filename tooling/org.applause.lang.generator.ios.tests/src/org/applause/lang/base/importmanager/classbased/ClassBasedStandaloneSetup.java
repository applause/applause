package org.applause.lang.base.importmanager.classbased;

import org.applause.lang.ApplauseDslStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClassBasedStandaloneSetup extends ApplauseDslStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new ClassBasedRuntimeModule());
	}
	
}
