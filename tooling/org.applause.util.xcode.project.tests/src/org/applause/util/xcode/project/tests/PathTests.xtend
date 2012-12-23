package org.applause.util.xcode.project.tests

import com.google.inject.Inject

import org.applause.util.xcode.project.XcodeProjectFactory
import org.applause.util.xcode.projectfile.PbxprojInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import static extension org.applause.util.xcode.project.XcodeProjectObjectExtensions.*

@InjectWith(typeof(PbxprojInjectorProvider))
@RunWith(typeof(XtextRunner))
class PathTests {
	
	@Inject XcodeProjectFactory projectFactory
	
	@Test
	def failingTest() {
		assertTrue(true)
	}
	
	@Test
	def groupPathTest() {
		val project = projectFactory.create()
		val mainGroup = project.createMainGroup()
		
		val groupEmptyApplicationProject = mainGroup.createGroup("FooProject".toPath)
		val p = groupEmptyApplicationProject.path
		
		assertEquals("FooProject", p.lastSegment)
		assertEquals("FooProject", p.toString)
		assertEquals("FooProject", groupEmptyApplicationProject.projectRelativePath.toString)
	}
	
	@Test
	def groupedFilePathTest() {
		val project = projectFactory.create()
		val mainGroup = project.createMainGroup()
		
		val groupEmptyApplicationProject = mainGroup.createGroup("FooProject".toPath)
		val barFile = groupEmptyApplicationProject.createHeaderFile("BarFile.h".toPath)
		assertEquals("BarFile.h", barFile.path.lastSegment)
		assertEquals("BarFile.h", barFile.path.toString)
		assertEquals("FooProject/BarFile.h", barFile.projectRelativePath.toString)
	}
}