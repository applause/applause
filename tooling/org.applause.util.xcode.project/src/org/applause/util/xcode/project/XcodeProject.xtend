package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.PbxprojStandaloneSetup
import org.applause.util.xcode.projectfile.pbxproj.Encoding
import org.applause.util.xcode.projectfile.pbxproj.Language
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer

import static org.applause.util.xcode.project.XcodeProjectUtils.*


class XcodeProject extends AbstractXcodeProjectElement {

	String projectPath
	
	new(String path) {
		super(null)
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
		project.projectDirPath = ''
		project.projectRoot = ''
		
		projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		projectModel.archiveVersion = 1
		projectModel.objectVersion = 42
		projectModel.encoding = Encoding::UTF8
		projectModel.objects.add(project)
		projectModel.rootObject = project 
	}
	
	@Property ProjectModel projectModel 
	
	def project() {
		object as Project
	}
	
	def setProject(Project project) {
		object = project
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
		val xcodeGroup = new XcodeGroup(this)
		this.project.mainGroup = xcodeGroup.group
		xcodeGroup
	}
	
	def getMainGroup() {
		project.mainGroup
	}
	
}