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
		val appDelegeateHeaderFile = groupEmptyApplicationProject.createHeaderFile("AppDelegate.h".toPath)
		val appDelegateModuleFile = groupEmptyApplicationProject.createModuleFile("AppDelegate.m".toPath)
		
		val groupEmptyApplicationProjectTests = mainGroup.createGroup("EmptyApplicationProjectTests".toPath)
		groupEmptyApplicationProjectTests.createHeaderFile("EmptyApplicationProjectTests.h".toPath)
		groupEmptyApplicationProjectTests.createModuleFile("EmptyApplicationProjectTests.m".toPath)
		
		val groupProducts = mainGroup.createGroup("Products")
		groupProducts.productsGroup = true
		val applicationFile = groupProducts.createAppFile("EmptyApplicationProject.app".toPath)
		
		val applicationTarget = project.createApplicationTarget("EmptyApplicationProject", applicationFile)
		applicationTarget.productName = "EmptyApplicationProject" 
		applicationTarget.add(appDelegateModuleFile)
		val buildConfiguration = applicationTarget.getBuildConfiguration("Release")
		buildConfiguration.setSetting("GCC_PRECOMPILE_PREFIX_HEADER", "YES")
		buildConfiguration.setSetting("GCC_PREFIX_HEADER", '"EmptyApplicationProject/EmptyApplicationProject-Prefix.pch"')
		buildConfiguration.setSetting("INFOPLIST_FILE", '"EmptyApplicationProject/EmptyApplicationProject-Info.plist"')
		buildConfiguration.setSetting("PRODUCT_NAME", '"$(TARGET_NAME)"')
		buildConfiguration.setSetting("WRAPPER_EXTENSION", "app")
		
		project.save()
	}
	
}