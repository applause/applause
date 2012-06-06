package org.applause.lang.generator.wp7;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class WP7OutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static final String OUTPUT_MODEL = "MODEL";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> result = super.getOutputConfigurations();
		
		OutputConfiguration modelOutput = new OutputConfiguration(OUTPUT_MODEL);
		modelOutput.setDescription("Output folder for model files.");
		modelOutput.setOutputDirectory("./$PROJECTNAME$/Application/Model");
		modelOutput.setOverrideExistingResources(true);
		modelOutput.setCreateOutputDirectory(true);
		modelOutput.setCleanUpDerivedResources(true);
		modelOutput.setSetDerivedProperty(true);
		result.add(modelOutput);
		
		return result;
	}

}
