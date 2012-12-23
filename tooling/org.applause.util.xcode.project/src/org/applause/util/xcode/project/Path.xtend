package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.PathString
import org.applause.util.xcode.projectfile.pbxproj.PathFragment
import org.applause.util.xcode.projectfile.pbxproj.PathVariable
import org.applause.util.xcode.projectfile.pbxproj.PathID

class Path {
	
	@Property org.applause.util.xcode.projectfile.pbxproj.Path pbx_path
	
	new() {
	}
	
	/**
	 * Create a new path from the string provided. Segments are separated with the / sign.
	 * @param path the path.
	 */
	new(String path) {
		pbx_path = create(path)
	}
	
	/**
	 * Create a new path using a org.applause.util.xcode.projectfile.pbxproj.Path.
	 *  @param path the path to create the path from.
	 */
	new(org.applause.util.xcode.projectfile.pbxproj.Path path) {
		pbx_path = path
	}
	
	def static toPath(String path) {
		new Path(path)
	}
	
	def static toPath(org.applause.util.xcode.projectfile.pbxproj.Path path) {
		new Path(path)
	}
	
	def private static create(String path) {
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
		if (pbx_path != null) {
			val segment = pbx_path.fragments.last
			segment.value
		}
		else
			""
	}
	
	def leadingSegments() {
		if (pbx_path != null) {
			pbx_path.fragments.take(pbx_path.fragments.size - 1)
		}
		else 
			newArrayList()
	}
	
	def private dispatch value(PathFragment segment) {
		""
	}
	
	def private dispatch value(PathString segment) {
		segment.value
	}
	
	def private dispatch value(PathVariable segment) {
		segment.value.toString
	}
	
	def private dispatch value(PathID segment) {
		segment.value
	}
	
	override toString() {
		if (pbx_path != null) 
			pbx_path.fragments.join('/', [value])
		else
			""
	}
}