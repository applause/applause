package org.applause.lang.generator.ios;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class IosOutputConfigurationProvider implements IOutputConfigurationProvider {
	
	public final static String IOS_DEFAULT_OUTPUT = "IOS_DEFAULT_OUTPUT";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(IOS_DEFAULT_OUTPUT);
		defaultOutput.setDescription("iOS Output Folder");
		defaultOutput.setOutputDirectory("../../TodoMobile-iOS/output");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		defaultOutput.setKeepLocalHistory(true);
		return newHashSet(defaultOutput);
	}

}
