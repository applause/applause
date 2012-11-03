package org.applause.util.xcode.projectfile.ui.outline

import org.applause.util.xcode.projectfile.pbxproj.BuildConfiguration
import org.applause.util.xcode.projectfile.pbxproj.BuildFile
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase
import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.ProjectObject
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.applause.util.xcode.projectfile.pbxproj.NativeTarget
import org.applause.util.xcode.projectfile.pbxproj.PathVariable
import org.applause.util.xcode.projectfile.pbxproj.PathID
import org.applause.util.xcode.projectfile.pbxproj.PathString

class XtendPbxprojOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	// -- Project
	def getProjectModel(ProjectObject object) {
		object.eContainer as ProjectModel
	}
	
	def getProject(ProjectObject object) {
		object.projectModel.rootObject as Project
	}

	def Object _text(Project project) {
		return "Project: " + project.name
	}
	

	// -- Group
	def isMainGroup(Group group) {
		group.project.mainGroup == group
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
	
	def path(FileReference fileref) {
		var result = ''
		for (fragment: fileref.path.fragments) {
			result = result + fragment.fragment.toString
		}
		result
	}
	
	def dispatch fragment(PathVariable pathVariable) {
		pathVariable.value
	}
	def dispatch fragment(PathID pathID) {
		pathID.value
	}
	def dispatch fragment(PathString pathString) {
		pathString.value
	}
	
	// -- BuildFile
	def  _text(BuildFile buildFile) {
		val fileRefObject = buildFile.fileRef
		switch (fileRefObject) {
			FileReference: {
				val fileRef = fileRefObject as FileReference
				return "Buildfile referencing " + fileRef.path()
			}
		}
//		if (fileRefObject == typeof(FileReference)) {
//			val fileRef = fileRefObject as FileReference
//			return "Buildfile referencing " + fileRef.fileName
//		}
		return buildFile.getName();
	}
	
	
	// -- FileReference
	def Object _text(FileReference fileReference) {
		"FileRef: " + fileReference.path()
	}
	
	def _isLeaf(FileReference file) {
		return true;
	}
	
	// -- BuildPhase
	def boolean _isLeaf(BuildPhase phase) {
		return true;
	}
	
	
	// -- BuildConfiguration
	def Object _text(BuildConfiguration configuration) {
		"BuildConfiguration: " + configuration.configurationName
	}
	
	// -- Native Target
	def Object _text(NativeTarget target) {
		"Native target: " + target.targetName
	}
	
}