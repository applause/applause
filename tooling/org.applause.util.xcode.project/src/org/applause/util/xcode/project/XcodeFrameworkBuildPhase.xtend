package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeBuildPhase

class XcodeFrameworkBuildPhase extends XcodeBuildPhase {
	
	new(XcodeProject project) {
		super(project)
		pbx_buildPhase.isa = 'PBXFrameworksBuildPhase'
	}
	
	override protected shouldAddFile(XcodeFile file) {
		file.frameworkFile
	}
	
}