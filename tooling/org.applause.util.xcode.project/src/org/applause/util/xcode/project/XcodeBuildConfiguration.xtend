package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.BuildConfiguration
import org.applause.util.xcode.projectfile.pbxproj.ComplexBuildSetting
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.SimpleBuildsetting
import org.eclipse.xtend.lib.Property

import static org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeBuildConfiguration {
	XcodeProject project
	XcodeBuildConfigurationList buildConfigurationList
	
	@Property BuildConfiguration pbx_buildConfiguration
	@Property String name

	private new(XcodeBuildConfigurationList buildConfigurationList, String name) {
		this.name = name
		this.project = buildConfigurationList.project
		this.buildConfigurationList = buildConfigurationList
		
		pbx_buildConfiguration = PbxprojFactory::eINSTANCE.createBuildConfiguration
		pbx_buildConfiguration.isa = 'XCBuildConfiguration'
		pbx_buildConfiguration.name = generateUUID
		pbx_buildConfiguration.configurationName = name
		project.pbx_projectModel.objects.add(pbx_buildConfiguration)
	}
	
	def static createBuildConfiguration(XcodeBuildConfigurationList buildConfigurationList, String name) {
		val buildConfiguration = new XcodeBuildConfiguration(buildConfigurationList, name)
		buildConfiguration
	}
	
	def setSetting(String settingName, String value) {
		var setting = pbx_buildConfiguration.buildSettings.findFirst[name == settingName]
		if (setting == null) {
			setting = PbxprojFactory::eINSTANCE.createSimpleBuildsetting;
			setting.name = settingName
			pbx_buildConfiguration.buildSettings.add(setting)
		}
		setting.value = value
	}
	
	def setComplexSetting(String settingName, String value) {
		var setting = pbx_buildConfiguration.buildSettings.findFirst[name == settingName]
		if (setting == null) {
			setting = PbxprojFactory::eINSTANCE.createComplexBuildSetting
			pbx_buildConfiguration.buildSettings.add(setting)
			setting.name = settingName
		}
		setting.value = value
	}
	
	def dispatch void setValue(SimpleBuildsetting setting, String value) {
		setting.value = value
	}
	
	def dispatch void setValue(ComplexBuildSetting setting, String value) {
		if (!setting.values.exists[it == value]) {
			setting.values.add(value)
		}
	}
}