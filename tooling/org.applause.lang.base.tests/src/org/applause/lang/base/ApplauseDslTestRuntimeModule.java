package org.applause.lang.base;

import org.applause.lang.ApplauseDslRuntimeModule;

public class ApplauseDslTestRuntimeModule extends ApplauseDslRuntimeModule {

	public Class<? extends TypeExtensions> bindTypeExtensions() {
		return FooBarTypeExtensions.class;
	}
	
	public Class<? extends PlatformExtensions> bindPlatformExtensions() {
		return FooBarPlatformExtensions.class;
	}

}
