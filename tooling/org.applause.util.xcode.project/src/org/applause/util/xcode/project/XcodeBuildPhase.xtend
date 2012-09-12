package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeProject

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.BuildPhase

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeBuildPhase {
	
	XcodeProject project
	@Property BuildPhase pbx_buildPhase
	
	private new(XcodeProject project) {
		this.project = project
		
		pbx_buildPhase = PbxprojFactory::eINSTANCE.createSourcesBuildPhase
		pbx_buildPhase.name = generateUUID
		pbx_buildPhase.buildActionMask = 2147483647
		pbx_buildPhase.runOnlyForDeploymentPostprocessing = 0

		project.pbx_projectModel.objects.add(pbx_buildPhase)		
	}
	
	def private setIsa(String isa) {
		pbx_buildPhase.isa = isa
	}
	
	def static createSourceBuildPhase(XcodeProject project) {
		val buildPhase = new XcodeBuildPhase(project)
		buildPhase.isa = 'PBXSourcesBuildPhase'
		buildPhase
	}
	
	def add(XcodeFile file) {
		if(file.buildFile) {
			pbx_buildPhase.files.add(file.pbx_buildFile)
		}
	}
	
}