package org.applause.lang.generator.ios;

import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

public class IosGeneratorModule extends AbstractGenericModule {
	
	public Class<? extends OutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return IosOutputConfigurationProvider.class;
	}

	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.ios.IosAppGenerator.class;
	}

}
