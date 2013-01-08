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

	XcodeBuildConfigurationList buildConfigurationList
	
	private new(XcodeProject project, String name) {
		this.project = project
		project.targets.add(this)
		
		pbx_target = PbxprojFactory::eINSTANCE.createNativeTarget
		pbx_target.isa = 'PBXNativeTarget'
		pbx_target.name = generateUUID
		pbx_target.targetName = name
		pbx_target.productName = name
		
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
		val target = createTarget(project, name)
		target.pbx_target.productType = ProductType::APPLICATION
		target
	}
	
	def static createApplicationTarget(XcodeProject project, String name, XcodeFile applicationFile) {
		val target = createTarget(project, name)
		target.pbx_target.productType = ProductType::APPLICATION
		target.productReference = applicationFile
		target
	}
	
	def static createBundleTarget(XcodeProject project, String name) {
		val target = createTarget(project, name)
		target.pbx_target.productType = ProductType::BUNDLE
		target
	}
	
	def setProductReference(XcodeFile applicationFile) {
		pbx_target.productReference = applicationFile.pbx_fileReference
	}
	
	def setProductName(String name) {
		pbx_target.productName = name
	}
	
	XcodeBuildPhase sourceBuildPhase	
	def sourceBuildPhase() {
		if (sourceBuildPhase == null) {
			sourceBuildPhase = project.createSourceBuildPhase()
			pbx_target.buildPhases.add(sourceBuildPhase.pbx_buildPhase)
		}
		sourceBuildPhase
	}
	
	XcodeBuildPhase frameworkBuildPhase
	def frameworkBuildPhase() {
		if (frameworkBuildPhase == null) {
			frameworkBuildPhase = project.createFrameworkBuildPhase()
			pbx_target.buildPhases.add(frameworkBuildPhase.pbx_buildPhase)
		}
		frameworkBuildPhase
	}
	
	XcodeBuildPhase copyBundleResourcesBuildPhase
	def copyBundleResourcesBuildPhase() {
		if (copyBundleResourcesBuildPhase == null) {
			copyBundleResourcesBuildPhase = project.createCopyBundleResourcesBuildPhase()
			pbx_target.buildPhases.add(copyBundleResourcesBuildPhase.pbx_buildPhase)
		}
		copyBundleResourcesBuildPhase
	}
	
	def createBuildConfiguration(String name) {
		buildConfigurationList.createBuildConfiguration(name)
	}
	
	def getBuildConfiguration(String name) {
		buildConfigurationList.getBuildConfiguration(name)
	}
	
	def name() {
		pbx_target.targetName
	}
	
	def productName() {
		pbx_target.productName
	}
	
	def productType() {
		pbx_target.productType
	}
	
}