package org.applause.lang.base;

import org.applause.lang.ApplauseDslRuntimeModule;
import org.applause.lang.base.importmanager.namespacebased.FooBarImportmanager;

public class ApplauseDslTestRuntimeModule extends ApplauseDslRuntimeModule {

	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return FooBarTypeExtensions.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return FooBarPlatformExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return FooBarImportmanager.class;
	}

}
