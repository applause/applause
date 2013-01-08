package org.applause.util.xcode.project

class XcodeFrameworkBuildPhase extends XcodeBuildPhase {
	
	new(XcodeProject project) {
		super(project)
		pbx_buildPhase.isa = 'PBXFrameworksBuildPhase'
	}
	
	override protected shouldAddFile(XcodeFile file) {
		file.frameworkFile
	}
	
}