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
		groupEmptyApplicationProject.createHeaderFile("AppDelegate.h".toPath)
		groupEmptyApplicationProject.createModuleFile("AppDelegate.m".toPath)
		
		val groupEmptyApplicationProjectTests = mainGroup.createGroup("EmptyApplicationProjectTests".toPath)
		groupEmptyApplicationProjectTests.createHeaderFile("EmptyApplicationProjectTests.h".toPath)
		groupEmptyApplicationProjectTests.createModuleFile("EmptyApplicationProjectTests.m".toPath)
		
		val groupProducts = mainGroup.createGroup("Products")
		groupProducts.productsGroup = true
		val applicationFile = groupProducts.createAppFile("EmptyApplicationProject.app".toPath)
		
		val applicationTarget = project.createApplicationTarget("EmptyApplicationProject", applicationFile)
		applicationTarget.productName = "EmptyApplicationProject" 
		
		project.save()
	}
	
}