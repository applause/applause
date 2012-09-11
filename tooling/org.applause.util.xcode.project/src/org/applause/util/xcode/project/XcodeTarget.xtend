package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.NativeTarget
import org.applause.util.xcode.projectfile.pbxproj.ProductType

class XcodeTarget {
	
	@Property XcodeProject project
	@Property NativeTarget pbx_target
	
	private new(XcodeProject project, String name) {
		this.project = project
		
		pbx_target = PbxprojFactory::eINSTANCE.createNativeTarget
		pbx_target.isa = 'PBXNativeTarget'
		pbx_target.name = generateUUID
		pbx_target.targetName = name
		
		project.pbx_project.targets.add(pbx_target)
		project.pbx_projectModel.objects.add(pbx_target)
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
	
}