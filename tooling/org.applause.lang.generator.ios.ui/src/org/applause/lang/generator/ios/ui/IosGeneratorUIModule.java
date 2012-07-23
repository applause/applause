
package org.applause.lang.generator.ios.ui;

import org.applause.lang.ui.builder.IBuildStrategy;
import org.eclipse.xtext.ui.DefaultUiModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class IosGeneratorUIModule extends DefaultUiModule {
	
	public IosGeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends IBuildStrategy> bindIBuildStrategy() {
		return IosBuildStrategy.class;
	}

}
