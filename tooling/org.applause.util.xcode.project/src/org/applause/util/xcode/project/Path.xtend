package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.PathString
import org.applause.util.xcode.projectfile.pbxproj.PathFragment
import org.applause.util.xcode.projectfile.pbxproj.PathVariable
import org.applause.util.xcode.projectfile.pbxproj.PathID

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
		
		val pathSegments = path.split("/")
		
		for(segment: pathSegments) {
			val fragment = if (segment.indexOf(" ") > 0) {
				val f = PbxprojFactory::eINSTANCE.createPathString
				f.value = segment
				f
			}
			else {
				val f = PbxprojFactory::eINSTANCE.createPathID
				f.value = segment
				f
			}
			result.fragments.add(fragment)
		}
		
		result
	}
	
	def lastSegment() {
		val segment = pbx_path.fragments.last
		segment.value
	}
	
	def dispatch value(PathFragment segment) {
		""
	}
	
	def dispatch value(PathString segment) {
		segment.value
	}
	
	def dispatch value(PathVariable segment) {
		segment.value.toString
	}
	
	def dispatch value(PathID segment) {
		segment.value
	}
}