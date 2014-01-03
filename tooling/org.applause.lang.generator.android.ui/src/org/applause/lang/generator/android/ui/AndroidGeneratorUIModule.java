
package org.applause.lang.generator.android.ui;

import org.applause.lang.generator.android.AndroidAppGenerator;
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.ui.DefaultUiModule;

@SuppressWarnings("all")
public class AndroidGeneratorUIModule extends DefaultUiModule {
	
	public AndroidGeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return org.eclipse.xtext.builder.BuilderParticipant.class;
	}
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return AndroidAppGenerator.class;
	}
	
	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return AndroidOutputConfigurationProvider.class;
	}
	
}
