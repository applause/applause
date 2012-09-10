package org.applause.util.xcode.project.tests

import org.junit.Test

import static org.junit.Assert.*
import org.applause.util.xcode.project.XcodeProject
import static extension org.applause.util.xcode.project.Path.*

class ProjectTests {
	
	@Test
	def failingTest() {
		assertTrue(true)
	}
	
	@Test
	def createNewProject() {
		val path = "/Users/peterfriese/Projects/peterfriese.de/Applause2/applause/tooling/org.applause.util.xcode.projectfile.sample/Test/MyTestProject.xcodeproj"
		
		val project = XcodeProject::createProject(path)
		val mainGroup = project.createMainGroup()
		
		val groupEmptyApplicationProject = mainGroup.createGroup("EmptyApplicationProject".toPath)
		val fileHeaderAppDelegate = groupEmptyApplicationProject.createHeaderFile("AppDelegate.h".toPath)
		val fileModuleAppDelegate = groupEmptyApplicationProject.createModuleFile("AppDelegate.m".toPath)
//
//		
		project.save()
	}
	
}