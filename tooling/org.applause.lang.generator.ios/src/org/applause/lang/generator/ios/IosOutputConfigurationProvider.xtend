package org.applause.lang.generator.ios

import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class IosOutputConfigurationProvider implements IOutputConfigurationProvider {
	
	public final static String IOS_DEFAULT_OUTPUT = "IOS_DEFAULT_OUTPUT";
	public final static String IOS_OUTPUT_MODELS = "IOS_OUTPUT_MODELS";
	public final static String IOS_OUTPUT_DATAACCESS = "IOS_OUTPUT_DATAACCESS";
	public final static String IOS_OUTPUT_SUPPORTFILES = "IOS_OUTPUT_SUPPORTFILES";
	public final static String IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN = "IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN";
	public final static String IOS_OUTPUT_CONTROLLERS = "IOS_OUTPUT_CONTROLLERS";
	
	override getOutputConfigurations() {
		val defaultOutput = new OutputConfiguration(IOS_DEFAULT_OUTPUT);
		defaultOutput => [
			description = "iOS Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]

		val modelsOutput = new OutputConfiguration(IOS_OUTPUT_MODELS);
		modelsOutput => [
			description = "iOS Models Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$/Models"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]
		
		val dataAccessOutput = new OutputConfiguration(IOS_OUTPUT_DATAACCESS);
		dataAccessOutput => [
			description = "iOS Data Access Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$/DataAccess"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]
		
		val supportFilesOutput = new OutputConfiguration(IOS_OUTPUT_SUPPORTFILES);
		supportFilesOutput => [
			description = "iOS Support Files Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]
		
		val localizedSupportFilesOutput = new OutputConfiguration(IOS_OUTPUT_SUPPORTFILES_LOCALIZED_EN);
		localizedSupportFilesOutput => [
			description = "iOS Localized Support Files Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$/en.lproj"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]
		
		val contollerFilesOutput = new OutputConfiguration(IOS_OUTPUT_CONTROLLERS);
		contollerFilesOutput => [
			description = "iOS Localized Support Files Output Folder"
			outputDirectory = "../../$PROJECTNAME$-iOS/$PROJECTNAME$/Controllers"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			setDerivedProperty = true
			// Xtext 2.5 feature keepLocalHistory = true
		]
		
		#{defaultOutput, modelsOutput, dataAccessOutput, supportFilesOutput, localizedSupportFilesOutput, contollerFilesOutput}
	}
	
}