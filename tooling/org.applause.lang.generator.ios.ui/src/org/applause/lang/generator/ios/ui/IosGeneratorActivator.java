package org.applause.lang.generator.ios.ui;

import org.apache.log4j.Logger;
import org.applause.lang.generator.ios.IosGeneratorModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * The activator class controls the plug-in life cycle
 */
public class IosGeneratorActivator extends AbstractUIPlugin {

	private static final Logger logger = Logger.getLogger(IosGeneratorActivator.class);

	private static IosGeneratorActivator INSTANCE;

	private Injector injector;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		injector = createInjector();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		injector = null;
		INSTANCE = null;
		super.stop(context);
	}

	public static IosGeneratorActivator getInstance() {
		return INSTANCE;
	}

	public Injector getInjector() {
		return injector;
	}

	protected Injector createInjector() {
		try {
			Module generatorModule = getGeneratorModule();
			Module generatorUIModule = getGeneratorUIModule();
			Module runtimeModule = getRuntimeModule();
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule();
			Module mergedModule = Modules2.mixin(
					runtimeModule,
					sharedStateModule, 
					uiModule, 
					generatorModule, 
					generatorUIModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for iOS Generator UI.");
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for iOS Generator UI.", e);
		}
	}
	
	protected Module getGeneratorModule() {
		return new IosGeneratorModule();
	}

	protected Module getGeneratorUIModule() {
		return new IosGeneratorUIModule(this);
	}

	protected Module getRuntimeModule() {
		return new org.applause.lang.ApplauseDslRuntimeModule();
	}

	protected Module getUiModule() {
		return new org.applause.lang.ui.ApplauseDslUiModule(this);
	}

	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}

}
