package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.ProjectObject
import org.eclipse.xtend.lib.Property

class AbstractXcodeProjectElement {
	
	@Property XcodeProject project
	@Property ProjectObject object
	
	new(XcodeProject project) {
		this.project = project
	}
	
	def protected addToProject() {
		project.projectModel.objects.add(object)
	}
}