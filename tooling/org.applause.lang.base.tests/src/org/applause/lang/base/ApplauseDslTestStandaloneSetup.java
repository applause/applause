package org.applause.lang.base;

import org.applause.lang.ApplauseDslStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplauseDslTestStandaloneSetup extends ApplauseDslStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new ApplauseDslTestRuntimeModule());
	}

}
