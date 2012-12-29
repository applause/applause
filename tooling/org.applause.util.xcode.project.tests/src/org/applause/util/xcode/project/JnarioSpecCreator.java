package org.applause.util.xcode.project;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.jnario.lib.AbstractSpecCreator;

import com.google.inject.Injector;

public abstract class JnarioSpecCreator extends AbstractSpecCreator {
	
	protected Injector injector;
	
	@Override
	protected <T> T create(Class<T> clazz) {
		if (injector == null) {
			beforeSpecRun();
		}
		return injector.getInstance(clazz);
	}
	
	@Override
	public void beforeSpecRun() {
		injector = getInjectorProvider().getInjector();
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).setupRegistry();
		}		
	}
	
	@Override
	public void afterSpecRun() {
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator)getInjectorProvider()).restoreRegistry();
		}
	}

	protected abstract IInjectorProvider getInjectorProvider();

}
