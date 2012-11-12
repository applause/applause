package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.NativeTarget
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.ProductType
import org.eclipse.xtend.lib.Property

import static org.applause.util.xcode.project.XcodeProjectUtils.*
import static org.applause.util.xcode.project.XcodeTarget.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationList.*

class XcodeTarget {
	
	@Property XcodeProject project
	@Property NativeTarget pbx_target
	XcodeBuildPhase _sourceBuildPhase
	XcodeBuildConfigurationList buildConfigurationList
	
	private new(XcodeProject project, String name) {
		this.project = project
		
		pbx_target = PbxprojFactory::eINSTANCE.createNativeTarget
		pbx_target.isa = 'PBXNativeTarget'
		pbx_target.name = generateUUID
		pbx_target.targetName = name
		
		project.pbx_project.targets.add(pbx_target)
		project.pbx_projectModel.objects.add(pbx_target)
		
		buildConfigurationList = project.createBuildConfigurationList()
		buildConfigurationList.createBuildConfiguration('Release')
		buildConfigurationList.createBuildConfiguration('Debug')
		pbx_target.buildConfigurationList = buildConfigurationList.pbx_BuildConfigurationList
		buildConfigurationList.defaultConfigurationName = 'Release'
	}
	
	def static createTarget(XcodeProject project, String name) {
		new XcodeTarget(project, name)
	}
	
	def static createApplicationTarget(XcodeProject project, String name) {
		val proj = createTarget(project, name)
		proj.pbx_target.productType = ProductType::APPLICATION
		proj
	}
	
	def static createApplicationTarget(XcodeProject project, String name, XcodeFile applicationFile) {
		val target = createTarget(project, name)
		target.pbx_target.productType = ProductType::APPLICATION
		target.productReference = applicationFile
		target
	}
	
	def setProductReference(XcodeFile applicationFile) {
		pbx_target.productReference = applicationFile.pbx_fileReference
	}
	
	def setProductName(String name) {
		pbx_target.productName = name
	}
	
	def getSourceBuildPhase() {
		if (_sourceBuildPhase == null) {
			_sourceBuildPhase = project.createSourceBuildPhase()
			pbx_target.buildPhases.add(_sourceBuildPhase.pbx_buildPhase)
		}
		_sourceBuildPhase
	}
	
	def add(XcodeFile file) {
		sourceBuildPhase.add(file)
	}
	
	def getBuildConfiguration(String name) {
		buildConfigurationList.getBuildConfiguration(name)
	}
	
}