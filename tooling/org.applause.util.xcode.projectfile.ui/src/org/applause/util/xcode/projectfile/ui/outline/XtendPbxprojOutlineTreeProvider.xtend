package org.applause.util.xcode.projectfile.ui.outline

import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.applause.util.xcode.projectfile.pbxproj.ProjectObject
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.BuildFile
import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase

class XtendPbxprojOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	def getProjectModel(ProjectObject object) {
		object.eContainer as ProjectModel
	}
	
	def getProject(ProjectObject object) {
		object.projectModel.rootObject as Project
	}

	def isMainGroup(Group group) {
		group.project.mainGroup == group
	}	
	
	
	def Object _text(Project project) {
		return "Project : " + project.name
	}
	
	def  Object _text(Group group) {
		val groupKind = if (group.mainGroup) "Main group " else "Group "
		val groupName = if (group.groupName != null) group.groupName else ''
		val name = ' (' + group.name + ')'
		
		groupKind + groupName + name
	}
	
	def _isLeaf(Group group) {
		return true;
	}
	
	def  _text(BuildFile buildFile) {
		val fileRefObject = buildFile.fileRef
		if (fileRefObject == typeof(FileReference)) {
			val fileRef = fileRefObject as FileReference
			return "Buildfile referencing " + fileRef.fileName
		}
		return buildFile.getName();
	}
	
	def Object _text(FileReference fileReference) {
		"FileRef: " + fileReference.fileName
	}
	
	def _isLeaf(FileReference file) {
		return true;
	}
	
	def boolean _isLeaf(BuildPhase phase) {
		return true;
	}
	
	
}