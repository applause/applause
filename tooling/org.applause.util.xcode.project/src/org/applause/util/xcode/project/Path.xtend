package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

class Path {
	
	@Property org.applause.util.xcode.projectfile.pbxproj.Path pbx_path
	
	private new(String path) {
		pbx_path = create(path)
	}
	
	def static toPath(String path) {
		new Path(path)
	}
	
	def static create(String path) {
		val result = PbxprojFactory::eINSTANCE.createPath
		
		val fragment = if (path.indexOf(" ") > 0) {
			val f = PbxprojFactory::eINSTANCE.createPathString
			f.value = path
			f
		}
		else {
			val f = PbxprojFactory::eINSTANCE.createPathID
			f.value = path
			f
		}
		result.fragments.add(fragment)
		result
	}
	
}