package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Group

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.project.XcodeProject

import static extension org.applause.util.xcode.project.XcodeFile.*
import static extension org.applause.util.xcode.project.Path.*
import java.util.ArrayList

class XcodeGroup {
	
	@Property XcodeProject project
	@Property XcodeGroup parentGroup
	@Property Group pbx_group
	
	def static createGroup(XcodeProject project) {
		new XcodeGroup(project)
	}
	
	def static createMainGroup(XcodeProject project) {
		new XcodeGroup(project) => [
			mainGroup = true
		]
	}
	
	def static createProductsGroup(XcodeProject project) {
		project.mainGroup.createGroup() => [
			productsGroup = true
		]
	}
	
	def createGroup(Path path) {
		val newgroup = new XcodeGroup(project)
		newgroup.parentGroup = this
		newgroup.pbx_group.path = path.pbx_path
		pbx_group.children.add(newgroup.pbx_group)
		newgroup
	}
	
	def createGroup(String groupName) {
		val group = new XcodeGroup(project)
		group.pbx_group.groupName = groupName
		pbx_group.children.add(group.pbx_group)
		group		
	}
	
	def createGroup() {
		val group = new XcodeGroup(project)
		pbx_group.children.add(group.pbx_group)
		group
	}
	
	private new(XcodeProject project) {
		this.project = project
		pbx_group = PbxprojFactory::eINSTANCE.createGroup => [
			name = generateUUID
			isa = 'PBXGroup'
			sourceTree = org::applause::util::xcode::projectfile::pbxproj::SourceTree::GROUP
		]
		project.pbx_projectModel.objects.add(pbx_group)
	}
	
	def setMainGroup(boolean value) {
		project.pbx_project.mainGroup = pbx_group
	}
	
	def isMainGroup() {
		project.pbx_project.mainGroup == pbx_group
	}
	
	def path() {
		pbx_group.path.toPath
	}

	def setGroupName(String name) {
		pbx_group.groupName = name
	}
		
	def groupName() {
		pbx_group.groupName
	}
	
	def setProductsGroup(boolean b) {
		groupName = 'Products'
		project.pbx_project.productRefGroup = pbx_group
	}
	
	def isProductsGroup() {
		project.pbx_project.productRefGroup == pbx_group
	}
	
	ArrayList<XcodeFile> files = newArrayList()
	
	def files() {
		files
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
	
	def createPlistFile(Path path) {
		createPlistFile(this, path)
	}
	
	def createOCTestFile(Path path) {
		createOCTestFile(this, path)
	}
	
	def createFrameworkFile(Path path) {
		new XcodeFrameworkFile(this, path)
	}
	
	def createDatamodelFile(Path path) {
		createDatamodelFile(this, path)
	}
	
}