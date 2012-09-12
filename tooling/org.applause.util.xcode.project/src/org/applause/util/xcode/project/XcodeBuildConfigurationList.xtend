package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.ConfigurationList
import static extension org.applause.util.xcode.project.XcodeBuildConfiguration.*

class XcodeBuildConfigurationList {

	@Property XcodeProject project
	@Property ConfigurationList pbx_BuildConfigurationList
	
	private new(XcodeProject project) {
		this.project = project
		
		pbx_BuildConfigurationList = PbxprojFactory::eINSTANCE.createConfigurationList
		pbx_BuildConfigurationList.name = generateUUID
		pbx_BuildConfigurationList.isa = 'XCConfigurationList'
		pbx_BuildConfigurationList.defaultConfigurationIsVisible = 0
		
		project.pbx_projectModel.objects.add(pbx_BuildConfigurationList)
	}
	
	def static createBuildConfigurationList(XcodeProject project) {
		new XcodeBuildConfigurationList(project)
	}
	
	def createBuildConfiguration(String name) {
		val buildConfiguration = createBuildConfiguration(this, name)
		pbx_BuildConfigurationList.buildConfigurations.add(buildConfiguration.pbx_buildConfiguration)
	}
}