package org.applause.lang.generator.wp7;

import org.applause.lang.base.ImportManager;
import org.applause.lang.base.PlatformExtensions;
import org.applause.lang.base.TypeExtensions;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

public class WP7GeneratorModule extends AbstractGenericModule {
	
	public Class<? extends OutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return WP7OutputConfigurationProvider.class;
	}
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.applause.lang.generator.wp7.WP7AppGenerator.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return org.applause.lang.generator.wp7.PlatformExtensions.class;
	}
	
	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return org.applause.lang.generator.wp7.TypeExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return org.applause.lang.generator.wp7.ImportManager.class;
	}
	

}
