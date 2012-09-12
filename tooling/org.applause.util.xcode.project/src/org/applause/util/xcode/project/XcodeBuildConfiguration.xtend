package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.BuildConfiguration
import org.applause.util.xcode.project.XcodeProject

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeBuildConfiguration {
	XcodeProject project
	XcodeBuildConfigurationList buildConfigurationList
	
	@Property BuildConfiguration pbx_buildConfiguration

	private new(XcodeBuildConfigurationList buildConfigurationList, String name) {
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
}