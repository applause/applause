package org.applause.specification;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.jnario.lib.AbstractSpecCreator;

import com.google.inject.Injector;

public class ApplauseDslTestCreator extends AbstractSpecCreator{

	protected Injector injector;
	private static ApplauseDslInjectorProvider injectorProvider = new ApplauseDslInjectorProvider();

	public <T> T create(Class<T> klass){
		if(injector == null){
			beforeSpecRun();
		}
		return injector.getInstance(klass);
	}

	public void beforeSpecRun() {
		injector = getInjectorProvider().getInjector();
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).setupRegistry();
		}
	}

	public void afterSpecRun() {
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).restoreRegistry();
		}
	}

	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
