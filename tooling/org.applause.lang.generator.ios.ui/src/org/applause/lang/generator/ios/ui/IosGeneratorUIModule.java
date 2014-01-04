
package org.applause.lang.generator.ios.ui;

import org.applause.lang.generator.ios.AppGenerator;
import org.applause.lang.generator.ios.IosOutputConfigurationProvider;
import org.applause.lang.ui.builder.ApplauseBuilderParticipant;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.ui.DefaultUiModule;

@SuppressWarnings("all")
public class IosGeneratorUIModule extends DefaultUiModule {
	
	public IosGeneratorUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
//		return org.eclipse.xtext.builder.BuilderParticipant.class;
		return ApplauseBuilderParticipant.class;
	}
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return AppGenerator.class;
	}
	
	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return IosOutputConfigurationProvider.class;
	}
	
}
