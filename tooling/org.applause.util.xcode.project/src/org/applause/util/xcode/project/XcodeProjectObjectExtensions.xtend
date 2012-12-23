package org.applause.util.xcode.project

import static extension org.applause.util.xcode.project.Path.*

class XcodeProjectObjectExtensions {
	
	def static projectRelativePath(XcodeGroup group) {
		var currentGroup = group
		var pathString = ""
		while(currentGroup.parentGroup != null) {
			pathString = currentGroup.path.toString + '/' + pathString
			currentGroup = currentGroup.parentGroup
		}
		pathString.toPath
	} 
	
	def static projectRelativePath(XcodeFile file) {
		var groupPath = projectRelativePath(file.group)
		groupPath.toString + '/' + file.path.toString
 	} 
	
}