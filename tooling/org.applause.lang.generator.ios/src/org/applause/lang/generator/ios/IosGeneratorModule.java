package org.applause.lang.generator.ios;

import org.applause.lang.base.ImportManager;
import org.applause.lang.base.PlatformExtensions;
import org.applause.lang.base.TypeExtensions;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

public class IosGeneratorModule extends AbstractGenericModule {
	
	public Class<? extends OutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return IosOutputConfigurationProvider.class;
	}

	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.ios.IosAppGenerator.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return org.applause.lang.generator.ios.PlatformExtensions.class;
	}
	
	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return org.applause.lang.generator.ios.TypeExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return org.applause.lang.generator.ios.ImportManager.class;
	}
	
	
}
