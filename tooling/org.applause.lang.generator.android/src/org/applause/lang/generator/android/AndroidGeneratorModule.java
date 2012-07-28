package org.applause.lang.generator.android;

import org.applause.lang.base.ImportManager;
import org.applause.lang.base.PlatformExtensions;
import org.applause.lang.base.TypeExtensions;
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
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return org.applause.lang.generator.android.PlatformExtensions.class;
	}
	
	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return org.applause.lang.generator.android.TypeExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return org.applause.lang.generator.android.ImportManager.class;
	}

}
