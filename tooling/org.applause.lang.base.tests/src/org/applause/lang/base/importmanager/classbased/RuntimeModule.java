package org.applause.lang.base.importmanager.classbased;

import org.applause.lang.ApplauseDslRuntimeModule;
import org.applause.lang.base.FooBarTypeExtensions;
import org.applause.lang.base.ImportManager;
import org.applause.lang.base.PlatformExtensions;
import org.applause.lang.base.TypeExtensions;

public class RuntimeModule extends ApplauseDslRuntimeModule {

	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return FooBarTypeExtensions.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return ClassBasedPlatformExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return FooBarClassBasedImportManager.class;
	}

}
