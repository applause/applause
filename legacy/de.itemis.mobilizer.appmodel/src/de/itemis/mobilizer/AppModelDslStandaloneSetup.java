
package de.itemis.mobilizer;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AppModelDslStandaloneSetup extends AppModelDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AppModelDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

