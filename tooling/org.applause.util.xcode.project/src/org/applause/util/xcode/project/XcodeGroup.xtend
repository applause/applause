package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.SourceTree
import org.eclipse.xtend.lib.Property

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeGroup {
	
	new() {
		group = PbxprojFactory::eINSTANCE.createGroup
		group.name = generateUUID
		group.isa = 'PBXGroup'
	}
	
	@Property SourceTree sourceTree
	
	@Property Group group
	
}