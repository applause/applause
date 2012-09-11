package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Project

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.Language
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.Encoding
import org.applause.util.xcode.projectfile.PbxprojStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.resource.SaveOptions

import static extension org.applause.util.xcode.project.XcodeGroup.*
import static extension org.applause.util.xcode.project.XcodeTarget.*

class XcodeProject {
	@Property ProjectModel pbx_projectModel
	@Property Project pbx_project
	
	String projectPath
	
	def static createProject(String path) {
		new XcodeProject(path)
	}
	
	private new(String path) {
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
		pbx_project.knownRegions.add('dummy')
		pbx_project.projectDirPath = ''
		pbx_project.projectRoot = ''
		
		pbx_projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		pbx_projectModel.archiveVersion = 1
		pbx_projectModel.objectVersion = 42
		pbx_projectModel.encoding = Encoding::UTF8
		pbx_projectModel.objects.add(pbx_project)
		pbx_projectModel.rootObject = pbx_project	
	}
	
	def save() {
		val injector = new PbxprojStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		
		val res = resourceSet.createResource(URI::createFileURI(pbxProjectFileName) );
		res.contents.add(pbx_projectModel)
		
		val serializer = injector.getInstance(typeof(ISerializer))
		val out = serializer.serialize(pbx_projectModel, SaveOptions::newBuilder.format.noValidation.options)		
		System::out.println(out)
		res.save(null);
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
	
}