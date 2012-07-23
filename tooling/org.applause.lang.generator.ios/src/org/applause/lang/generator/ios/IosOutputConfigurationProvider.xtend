package org.applause.lang.generator.ios

import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class IosOutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static val OUTPUT_MODEL = "MODEL"
	
	override getOutputConfigurations() {
		var result = super.getOutputConfigurations()
		val modelOutput = new OutputConfiguration(OUTPUT_MODEL) 
		modelOutput.description = "Output folder for model files."
		modelOutput.outputDirectory = "./$PROJECTNAME$"
		modelOutput.overrideExistingResources = true
		modelOutput.createOutputDirectory = false
		modelOutput.cleanUpDerivedResources = true
		modelOutput.setDerivedProperty = true
		result.add(modelOutput)
		result
	}
	
}