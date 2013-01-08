package org.applause.util.xcode.project

import org.applause.util.xcode.project.XcodeBuildPhase

class XcodeCopyBundleResourcesBuildPhase extends XcodeBuildPhase {
	
	new(XcodeProject project) {
		super(project)
		pbx_buildPhase.isa = 'PBXResourcesBuildPhase'
	}
	
	/**
	 * Any file can be added to copy bundle resources phase, even if this does not make much sense in the case of
	 * adding source code files such as module files.
	 */
	override protected shouldAddFile(XcodeFile file) {
		true
	}
	
}