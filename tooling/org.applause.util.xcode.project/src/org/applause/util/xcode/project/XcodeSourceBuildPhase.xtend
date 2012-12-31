package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeBuildPhase

class XcodeSourceBuildPhase extends XcodeBuildPhase {
	
	new(XcodeProject project) {
		super(project)
		pbx_buildPhase.isa = 'PBXSourcesBuildPhase'
	}
	
}