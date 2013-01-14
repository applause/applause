package org.applause.lang.base;

import org.applause.lang.ApplauseDslInjectorProvider;
import org.applause.util.xcode.projectfile.PbxprojStandaloneSetup;

import com.google.inject.Injector;

public class ApplauseDslTestInjectorProvider extends ApplauseDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		// fire up the .pbxproj DSL 
		new PbxprojStandaloneSetup().createInjectorAndDoEMFRegistration();

		// create injector for Applause DSL
		return new ApplauseDslTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}
