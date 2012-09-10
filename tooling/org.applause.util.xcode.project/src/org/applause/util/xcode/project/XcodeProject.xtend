package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.SourceTree
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.SaveOptions
import org.applause.util.xcode.projectfile.PbxprojStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer
import org.applause.util.xcode.projectfile.pbxproj.Encoding

import static org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.Language


class XcodeProject {
	String projectPath
	
	ProjectModel projectModel 
	Project project
	
	new(String path) {
		projectPath = path;
		
		project = PbxprojFactory::eINSTANCE.createProject
		project.name = generateUUID
		project.isa = 'PBXProject';
		project.lastupgradeCheck = 440
		project.organisationName = 'John Doe'
		// project.buildConfigurationList
		project.compatibilityVersion = 'Xcode 3.2'
		project.developmentRegion = Language::ENGLISH
		project.hasScannedForEncodings = 0
		project.knownRegions.add('dummy')
		project.productRefGroup = '8888BC2C15E6C80B004ED7F7'
		project.projectDirPath = ''
		project.projectRoot = ''
		project.targets.add('dummy')
		
		projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		projectModel.archiveVersion = 1
		projectModel.objectVersion = 42
		projectModel.encoding = Encoding::UTF8
		projectModel.objects.add(project)
		projectModel.rootObject = project 
		
	}
	
	def save() {
		val injector = new PbxprojStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		
		val res = resourceSet.createResource(URI::createFileURI(pbxProjectFileName) );
		res.contents.add(projectModel)
		
		val serializer = injector.getInstance(typeof(ISerializer))
		val out = serializer.serialize(projectModel, SaveOptions::newBuilder.format.noValidation.options)		
		System::out.println(out)
		res.save(null);
	}
	
	def String pbxProjectFileName() {
		projectPath + '/project.pbxproj'
	}

	
	def addMainGroup() {
		val xcodeGroup = new XcodeGroup
		xcodeGroup.sourceTree = SourceTree::GROUP
		
		project.mainGroup = xcodeGroup.group
		projectModel.objects.add(project.mainGroup)
		
		xcodeGroup
	}
	
}