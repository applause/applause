package org.applause.lang.generator.ios

import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class IosOutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static val OUTPUT_MODEL = "MODEL"
	public static val OUTPUT_XCODEPROJ = "XCODEPROJ"
	
	override getOutputConfigurations() {
		var result = super.getOutputConfigurations()
		
		val modelOutput = new OutputConfiguration(OUTPUT_MODEL) 
		modelOutput.description = "Output folder for model files."
		modelOutput.outputDirectory = "./"
		modelOutput.overrideExistingResources = true
		modelOutput.createOutputDirectory = false
		modelOutput.cleanUpDerivedResources = true
		modelOutput.setDerivedProperty = true
		result.add(modelOutput)
		
		val xcodeprojFileOutput = new OutputConfiguration(OUTPUT_XCODEPROJ) 
		xcodeprojFileOutput.description = "Output folder for xcodeproj files."
		xcodeprojFileOutput.outputDirectory = "./"
		xcodeprojFileOutput.overrideExistingResources = true
		xcodeprojFileOutput.createOutputDirectory = false
		xcodeprojFileOutput.cleanUpDerivedResources = true
		xcodeprojFileOutput.setDerivedProperty = true
		result.add(xcodeprojFileOutput)
		result
	}
	
}