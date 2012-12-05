package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.Encoding
import org.applause.util.xcode.projectfile.pbxproj.Language
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer

import static org.applause.util.xcode.project.XcodeBuildPhase.*
import static org.applause.util.xcode.project.XcodeGroup.*
import static org.applause.util.xcode.project.XcodeProjectUtils.*
import static org.applause.util.xcode.project.XcodeTarget.*

import static extension org.applause.util.xcode.project.XcodeBuildConfigurationList.*

class XcodeProject extends XcodeProjectBase {
	@Property ProjectModel pbx_projectModel
	@Property Project pbx_project
	XcodeBuildConfigurationList buildConfigurationList
	String projectPath
	
	new() {	
	}
	
	def init(String path) {
		projectPath = path
		
		pbx_project = PbxprojFactory::eINSTANCE.createProject
		pbx_project.name = generateUUID
		pbx_project.isa = 'PBXProject';
		pbx_project.lastupgradeCheck = 440
		pbx_project.organisationName = 'John Doe'
		// project.buildConfigurationList
		pbx_project.compatibilityVersion = 'Xcode 3.2'
		pbx_project.developmentRegion = Language::ENGLISH
		pbx_project.hasScannedForEncodings = 0
		pbx_project.knownRegions.add('en')
		pbx_project.projectDirPath = ''
		pbx_project.projectRoot = ''
		
		pbx_projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		pbx_projectModel.archiveVersion = 1
		pbx_projectModel.objectVersion = 42
		pbx_projectModel.encoding = Encoding::UTF8
		pbx_projectModel.objects.add(pbx_project)
		pbx_projectModel.rootObject = pbx_project	
		resource()		
		
		buildConfigurationList = this.createBuildConfigurationList()
//		buildConfigurationList.createBuildConfiguration('Release')
//		buildConfigurationList.createBuildConfiguration('Debug')
		buildConfigurationList.defaultConfigurationName = 'Release'
		pbx_project.buildConfigurationList = buildConfigurationList.pbx_BuildConfigurationList
	}
	
	def resourceSet() {
		reg.getResourceServiceProvider(URI::createFileURI(pbxProjectFileName)).get(typeof(XtextResourceSet))
	}
	
	Resource resource
	def private resource() {
		if (resource == null) {
			resource = resourceSet.createResource(URI::createFileURI(pbxProjectFileName) );
			resource.contents.add(pbx_projectModel)
		}
		resource		
	}

	def serializer() {
		reg.getResourceServiceProvider(URI::createFileURI(pbxProjectFileName)).get(typeof(ISerializer))
	}
	
	override toString() {
		resource()
		val out = serializer.serialize(pbx_projectModel, SaveOptions::newBuilder.format.noValidation.options)
		out
	}
	
	def save() {
		resource().save(null);
	}
	
	def String pbxProjectFileName() {
		projectPath + '/project.pbxproj'
	}
	
	def createMainGroup() {
		createMainGroup(this)
	}
	
	def createTarget(String name) {
		createTarget(this, name)
	}
	
	def createApplicationTarget(String name) {
		createApplicationTarget(this, name)
	}
	
	def createApplicationTarget(String name, XcodeFile applicationFile) {
		createApplicationTarget(this, name, applicationFile)
	}		
	
	def createSourceBuildPhase() {
		createSourceBuildPhase(this)
	}
	
	def createBuildConfiguration(String name) {
		buildConfigurationList.createBuildConfiguration(name)
	}
	
	def getBuildConfiguration(String name) {
		buildConfigurationList.getBuildConfiguration(name)
	}
	
	
}