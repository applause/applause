package org.applause.util.xcode.project.tests

import org.applause.util.xcode.project.XcodeProject
import static extension org.applause.util.xcode.project.XcodeFile.*
import org.junit.Test

import static org.junit.Assert.*

class ProjectTests {
	
	@Test
	def failingTest() {
		assertTrue(true)
	}
	
	@Test
	def createNewProject() {
		val path = "/Users/peterfriese/Projects/peterfriese.de/Applause2/applause/tooling/org.applause.util.xcode.projectfile.sample/Test/MyTestProject.xcodeproj"
		
		val project = new XcodeProject(path)
		
		val mainGroup = project.addMainGroup()
		
		val productsGroup = mainGroup.addGroup
		productsGroup.refGroup = true
		productsGroup.name = "Products"
		
		val frameworksGroup = mainGroup.addGroup("Frameworks")
		
		val applicationGroup = mainGroup.addGroup
		applicationGroup.path = "EmptyApplicationProject"
		
		val appDelegateHeaderFile = project.createHeaderFile("AppDelegate.h")
		applicationGroup.addFile(appDelegateHeaderFile);
		
		val appDelegateModuleFile = project.createModuleFile("AppDelegate.m")
		applicationGroup.addFile(appDelegateModuleFile);
		
		project.save()
	}
	
}