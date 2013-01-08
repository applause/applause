package org.applause.lang.base.importmanager.namespacebased;

import org.applause.lang.ApplauseDslRuntimeModule;
import org.applause.lang.base.FooBarPlatformExtensions;
import org.applause.lang.base.FooBarTypeExtensions;
import org.applause.lang.base.ImportManager;
import org.applause.lang.base.PlatformExtensions;
import org.applause.lang.base.TypeExtensions;

public class NamespaceBasedRuntimeModule extends ApplauseDslRuntimeModule {
	
	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return FooBarTypeExtensions.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return FooBarPlatformExtensions.class;
	}
	
	public Class<? extends ImportManager> bindImportManager() {
		return FooBarImportManager.class;
	}

}
