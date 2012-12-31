package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import java.util.ArrayList

class XcodeBuildPhase {
	
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
	
	def protected shouldAddFile(XcodeFile file) {
		file.sourceBuildFile
	}
	
	def add(XcodeFile file) {
		if(shouldAddFile(file)) {
			files.add(file)
			pbx_buildPhase.files.add(file.pbx_buildFile)
		}
	}
	
	ArrayList<XcodeFile> files = newArrayList()
	
	def files() {
		files
	}
	
}