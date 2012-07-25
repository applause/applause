
package org.applause.lang.generator.android.ui;

import org.applause.lang.ui.builder.IBuildStrategy;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.DefaultUiModule;

@SuppressWarnings("all")
public class AndroidGeneratorUIModule extends DefaultUiModule {
	
	public AndroidGeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends IBuildStrategy> bindIBuildStrategy() {
		return AndroidBuildStrategy.class;
	}

}
