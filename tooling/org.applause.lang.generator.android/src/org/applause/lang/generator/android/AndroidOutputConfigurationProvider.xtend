package org.applause.lang.generator.android

import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class AndroidOutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static val OUTPUT_MODEL = "MODEL"
	
	override getOutputConfigurations() {
		var result = super.getOutputConfigurations()
		val modelOutput = new OutputConfiguration(OUTPUT_MODEL) 
		modelOutput.description = "Output folder for model files."
		modelOutput.outputDirectory = "./src"
		modelOutput.overrideExistingResources = true
		modelOutput.createOutputDirectory = true
		modelOutput.cleanUpDerivedResources = true
		modelOutput.setDerivedProperty = true
		result.add(modelOutput)
		result
	}
	
}