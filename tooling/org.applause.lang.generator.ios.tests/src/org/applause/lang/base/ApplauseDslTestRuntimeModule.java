package org.applause.lang.base;

import org.applause.lang.ApplauseDslRuntimeModule;
import org.applause.lang.base.importmanager.namespacebased.FooBarImportManager;
import org.applause.lang.generator.ios.IosAppGenerator;
import org.eclipse.xtext.generator.IGenerator;

public class ApplauseDslTestRuntimeModule extends ApplauseDslRuntimeModule {

	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return FooBarTypeExtensions.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return FooBarPlatformExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return FooBarImportManager.class;
	}
	
	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return IosAppGenerator.class;
	}

}
