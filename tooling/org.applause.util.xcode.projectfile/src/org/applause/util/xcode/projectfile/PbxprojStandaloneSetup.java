
package org.applause.util.xcode.projectfile;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PbxprojStandaloneSetup extends PbxprojStandaloneSetupGenerated{

	public static void doSetup() {
		new PbxprojStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

