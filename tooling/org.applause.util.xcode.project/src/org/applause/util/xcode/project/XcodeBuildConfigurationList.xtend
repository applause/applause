package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.ConfigurationList
import static extension org.applause.util.xcode.project.XcodeBuildConfiguration.*
import java.util.List
import java.util.ArrayList

class XcodeBuildConfigurationList {

	@Property XcodeProject project
	@Property ConfigurationList pbx_BuildConfigurationList
	@Property List<XcodeBuildConfiguration> buildConfigurationList
	
	private new(XcodeProject project) {
		this.project = project
		
		pbx_BuildConfigurationList = PbxprojFactory::eINSTANCE.createConfigurationList
		pbx_BuildConfigurationList.name = generateUUID
		pbx_BuildConfigurationList.isa = 'XCConfigurationList'
		pbx_BuildConfigurationList.defaultConfigurationIsVisible = 0
		
		project.pbx_projectModel.objects.add(pbx_BuildConfigurationList)
		buildConfigurationList = new ArrayList
	}
	
	def static createBuildConfigurationList(XcodeProject project) {
		new XcodeBuildConfigurationList(project)
	}
	
	def createBuildConfiguration(String name) {
		val buildConfiguration = createBuildConfiguration(this, name)
		buildConfigurationList.add(buildConfiguration)
		pbx_BuildConfigurationList.buildConfigurations.add(buildConfiguration.pbx_buildConfiguration)
		buildConfiguration
	}
	
	def getBuildConfiguration(String configurationName) {
		buildConfigurationList.findFirst[it.name == configurationName]
	}
}