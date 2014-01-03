package org.applause.lang.generator.android;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class AndroidOutputConfigurationProvider implements IOutputConfigurationProvider {
	
	public final static String ANDROID_DEFAULT_OUTPUT = "ANDROID_DEFAULT_OUTPUT";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(ANDROID_DEFAULT_OUTPUT);
		defaultOutput.setDescription("Android Output Folder");
		defaultOutput.setOutputDirectory("../../TodoMobile-Android/output");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		defaultOutput.setKeepLocalHistory(true);
		return newHashSet(defaultOutput);
	}

}
