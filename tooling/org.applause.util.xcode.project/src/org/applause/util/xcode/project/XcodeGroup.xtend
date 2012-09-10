package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.SourceTree

import static org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeGroup extends AbstractXcodeProjectElement {
	
	new(XcodeProject project) {
		super(project)
		
		group = PbxprojFactory::eINSTANCE.createGroup
		group.name = generateUUID
		group.isa = 'PBXGroup'
		group.sourceTree = SourceTree::GROUP
		
		addToProject()
	}
	
	def group() {
		object as Group
	}
	
	def setGroup(Group group) {
		object = group
	}
	
	def void setSourceTree(SourceTree tree) {
		group.sourceTree = tree
	}
	
	def getName() {
		return group.groupName
	}
	
	def setName(String name) {
		group.groupName = name
	}
	
	def addGroup() {
		val xcodeGroup = new XcodeGroup(this.project)
		group.children.add(xcodeGroup.group)
		xcodeGroup
	}
	
	def addGroup(String name) {
		val result = addGroup
		result.name = name;
		result
	}
	
	def isRefGroup() {
		project.project.productRefGroup == group
	}
	
	def setRefGroup(boolean value) {
		project.project.productRefGroup = group
	}
	
	def setPath(String path) {
		group.path = makePath(path)
	}
	
	def addFile(XcodeFile file) {
		// find project
		// add file to filerefs
		// add file to project model objects
		// add file to group refs
		group.children.add(file.fileReference)
	}
	
}