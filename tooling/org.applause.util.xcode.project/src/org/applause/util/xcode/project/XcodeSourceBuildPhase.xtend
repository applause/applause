package org.applause.util.xcode.project

class XcodeSourceBuildPhase extends XcodeBuildPhase {
	
	new(XcodeProject project) {
		super(project)
		pbx_buildPhase.isa = 'PBXSourcesBuildPhase'
	}
	
	override protected shouldAddFile(XcodeFile file) {
		file.sourceBuildFile
	}
	
}