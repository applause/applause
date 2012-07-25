package org.applause.lang.generator.android;

import org.applause.lang.generator.android.AndroidOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

public class AndroidGeneratorModule extends AbstractGenericModule {
	
	public Class<? extends OutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return AndroidOutputConfigurationProvider.class;
	}

	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.android.AndroidAppGenerator.class;
	}

}
