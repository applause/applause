
package org.applause.lang.generator.wp7.ui;

import org.applause.lang.ui.builder.IProjectTypeDetector;
import org.applause.lang.ui.builder.ProjectTypeAwareBuilderParticipant;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.DefaultUiModule;

@SuppressWarnings("all")
public class WP7GeneratorUIModule extends DefaultUiModule {
	
	public WP7GeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IProjectTypeDetector> bindIProjectTypeDetector() {
		return WP7ProjectTypeDetector.class;
	}

	public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return ProjectTypeAwareBuilderParticipant.class;
	}
	
}
