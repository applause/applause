package org.applause.util.xcode.projectfile.ui.outline

import com.google.inject.Inject
import org.applause.util.xcode.projectfile.pbxproj.BuildConfiguration
import org.applause.util.xcode.projectfile.pbxproj.BuildFile
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase
import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.NativeTarget
import org.applause.util.xcode.projectfile.pbxproj.PathID
import org.applause.util.xcode.projectfile.pbxproj.PathString
import org.applause.util.xcode.projectfile.pbxproj.PathVariable
import org.applause.util.xcode.projectfile.pbxproj.PbxprojPackage
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.ProjectObject
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.applause.util.xcode.projectfile.pbxproj.FileType

class XtendPbxprojOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	IImageHelper imageHelper;
	
	def _createChildren(DocumentRootNode rootNode, ProjectModel projectModel) {
		createFileStructureNode(rootNode, projectModel)
	}
	
	def createFileStructureNode(IOutlineNode parentNode, ProjectModel projectModel) {
		val fileStructureNode = createEStructuralFeatureNode(parentNode, projectModel, 
			PbxprojPackage::eINSTANCE.projectModel_Objects, 
			imageHelper.getImage("xcodeproject.gif"), "File structure", false);
		
		val project = projectModel.objects.filter(typeof(Project)).head
		val projectNode = createEObjectNode(fileStructureNode, project);
		projectNode.createGroupNodes(project);
	}
	
	def createGroupNodes(IOutlineNode projectNode, Project project) { 
		if (project.mainGroup != null) {
			val groups = project.mainGroup.children.filter(typeof(Group))
			for (group: groups) {
				val groupNode = createEObjectNode(projectNode, group);
				groupNode.createGroupChildren(group);
			}
		}
	}
	
	def createGroupChildren(IOutlineNode parentNode, Group group) { 
		val files = group.children.filter(typeof(FileReference))
		for (file: files) {
			val fileNode = createEObjectNode(parentNode, file);
		}
		
		val groups = group.children.filter(typeof(Group))
		for (childGroup: groups) {
			val groupNode = createEObjectNode(parentNode, childGroup);
			groupNode.createGroupChildren(childGroup);
		}
	}

	
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
	
	def Object _image(Project project) {
		imageHelper.getImage("xcodeproject.gif");
	}

	// -- Group
	def isMainGroup(Group group) {
		group.project.mainGroup == group
	}	
	
	def  Object _text(Group group) {
		val groupKind = if (group.mainGroup) "Main group " else "Group "
		val groupName = 
			if (group.groupName != null) 
				group.groupName 
			else
				if (group.path() != null)
					group.path()
				else
					''
		val name = ' (' + group.name + ')'
		
		// groupKind + groupName + name
		groupName
	}
	
	def Object _image(Group group) {
		imageHelper.getImage("folder.gif");
	}
	
	
	def _isLeaf(Group group) {
		return true;
	}
	
	def path(Group group) {
		var result = ''
		for (fragment: group.path.fragments) {
			result = result + fragment.fragment.toString
		}
		result
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
		return buildFile.getName();
	}
	
	
	// -- FileReference
	def Object _text(FileReference fileReference) {
		if (fileReference.lastKnownFileType == FileType::WRAPPER_FRAMEWORK) {
			fileReference.fileName
		}
		else {
			fileReference.path()
		}
	}
	
	def Object _image(FileReference fileReference) {
		if (fileReference.path().endsWith(".h") || fileReference.path().endsWith(".pch")) {
			imageHelper.getImage("headerfile.gif")
		}
		else if (fileReference.path().endsWith(".m")) {
			imageHelper.getImage("modulefile.gif")
		}
		else if (fileReference.path().endsWith(".plist")) {
			imageHelper.getImage("plist.gif")
		}
		else if (fileReference.path().endsWith(".framework")) {
			imageHelper.getImage("framework.gif")
		}
		else if (fileReference.path().endsWith(".octest")) {
			imageHelper.getImage("octest.gif")
		}
		else if (fileReference.path().endsWith(".app")) {
			imageHelper.getImage("application.gif")
		}
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