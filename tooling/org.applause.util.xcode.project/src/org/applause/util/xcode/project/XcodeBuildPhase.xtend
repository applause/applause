package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import java.util.ArrayList
import org.applause.util.xcode.projectfile.pbxproj.BuildFile

abstract class XcodeBuildPhase {
	
	XcodeProject project
	@Property BuildPhase pbx_buildPhase
	
	protected new(XcodeProject project) {
		this.project = project
		
		pbx_buildPhase = PbxprojFactory::eINSTANCE.createSourcesBuildPhase
		pbx_buildPhase.name = generateUUID
		pbx_buildPhase.buildActionMask = 2147483647
		pbx_buildPhase.runOnlyForDeploymentPostprocessing = 0

		project.pbx_projectModel.objects.add(pbx_buildPhase)		
	}
	
	def protected Boolean shouldAddFile(XcodeFile file)
	
	def add(XcodeFile file) {
		if(shouldAddFile(file)) {
			files.add(file)
			addPbxBuildFile(file)
			pbx_buildPhase.files.add(file.pbx_buildFile)
		}
	}
	
	/**
	 * Add a PBXBuildFile, but only if there isn't one yet for the given PBXFileReference!
	 */
	def addPbxBuildFile(XcodeFile file) {
		var pbx_buildFile = project.pbx_projectModel.objects.filter(typeof(BuildFile)).findFirst[fileRef == file.pbx_fileReference]
		if (pbx_buildFile == null) {
			pbx_buildFile = PbxprojFactory::eINSTANCE.createBuildFile
			pbx_buildFile.isa = 'PBXBuildFile'
			pbx_buildFile.name = generateUUID	
			pbx_buildFile.fileRef = file.pbx_fileReference
			file.pbx_buildFile = pbx_buildFile
			project.pbx_projectModel.objects.add(pbx_buildFile)
		}
	}
	
	ArrayList<XcodeFile> files = newArrayList()
	
	def files() {
		files
	}
	
}