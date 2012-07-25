package org.applause.lang.generator.android.ui;

import org.apache.log4j.Logger;
import org.applause.lang.generator.android.AndroidGeneratorModule;
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
public class AndroidGeneratorActivator extends AbstractUIPlugin {

	private static final Logger logger = Logger.getLogger(AndroidGeneratorActivator.class);

	private static AndroidGeneratorActivator INSTANCE;

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

	public static AndroidGeneratorActivator getInstance() {
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
			logger.error("Failed to create injector for Android Generator UI.");
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for Android Generator UI.", e);
		}
	}
	
	protected Module getGeneratorModule() {
		return new AndroidGeneratorModule();
	}

	protected Module getGeneratorUIModule() {
		return new AndroidGeneratorUIModule(this);
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
