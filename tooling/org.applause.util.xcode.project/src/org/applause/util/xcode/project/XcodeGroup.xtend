package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Group

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.project.XcodeProject

import static extension org.applause.util.xcode.project.XcodeFile.*

class XcodeGroup {
	
	@Property XcodeProject project
	@Property Group pbx_group
	
	def static createGroup(XcodeProject project) {
		val group = new XcodeGroup(project)
		group
	}
	
	def static createMainGroup(XcodeProject project) {
		val group = new XcodeGroup(project)
		group.mainGroup = true
		group
	}
	
	def createGroup(Path path) {
		val group = new XcodeGroup(project)
		group.pbx_group.path = path.pbx_path
		pbx_group.children.add(group.pbx_group)
		group
	}
	
	def createGroup(String groupName) {
		val group = new XcodeGroup(project)
		group.pbx_group.groupName = groupName
		pbx_group.children.add(group.pbx_group)
		group		
	}
	
	private new(XcodeProject project) {
		this.project = project
		pbx_group = PbxprojFactory::eINSTANCE.createGroup
		pbx_group.name = generateUUID
		pbx_group.isa = 'PBXGroup'
		pbx_group.sourceTree = org::applause::util::xcode::projectfile::pbxproj::SourceTree::GROUP
		
		project.pbx_projectModel.objects.add(pbx_group)
	}
	
	def setMainGroup(boolean value) {
		project.pbx_project.mainGroup = pbx_group
	}
	
	def isMainGroup() {
		project.pbx_project.mainGroup == pbx_group
	}
	
	def setProductsGroup(boolean b) {
		project.pbx_project.productRefGroup = pbx_group
	}
	
	def isProductsGroup() {
		project.pbx_project.productRefGroup == pbx_group
	}
	
	def createHeaderFile(Path path) {
		createHeaderFile(this, path)
	}
	
	def createModuleFile(Path path) {
		createModuleFile(this, path)
	}
	
	def createAppFile(Path path) {
		createAppFile(this, path)
	}
	
}