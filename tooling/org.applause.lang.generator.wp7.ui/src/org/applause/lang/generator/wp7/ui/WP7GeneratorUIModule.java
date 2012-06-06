
package org.applause.lang.generator.wp7.ui;

import org.applause.lang.ui.builder.AbstractBuildStrategy;
import org.applause.lang.ui.builder.IBuildStrategy;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.DefaultUiModule;

@SuppressWarnings("all")
public class WP7GeneratorUIModule extends DefaultUiModule {
	
	public WP7GeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IBuildStrategy> bindIBuildStrategy() {
		return WP7BuildStrategy.class;
	}
	
}
