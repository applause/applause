package org.applause.lang.generator.ios

import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class IosOutputConfigurationProvider extends OutputConfigurationProvider {
	
	public static val OUTPUT_MODEL = "MODEL"
	public static val OUTPUT_UI = "UI"
	public static val OUTPUT_APP = "APP"
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

		val uiOutput = new OutputConfiguration(OUTPUT_UI) 
		uiOutput.description = "Output folder for UI files."
		uiOutput.outputDirectory = "./"
		uiOutput.overrideExistingResources = true
		uiOutput.createOutputDirectory = false
		uiOutput.cleanUpDerivedResources = true
		uiOutput.setDerivedProperty = true
		result.add(uiOutput)
		
		val appOutput = new OutputConfiguration(OUTPUT_APP) 
		appOutput.description = "Output folder for general app files."
		appOutput.outputDirectory = "./"
		appOutput.overrideExistingResources = true
		appOutput.createOutputDirectory = false
		appOutput.cleanUpDerivedResources = true
		appOutput.setDerivedProperty = true
		result.add(appOutput)
		
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