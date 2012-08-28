package org.applause.util.xcode.projectfile

import com.google.inject.Inject
import com.google.inject.Provider
import org.applause.util.xcode.projectfile.pbxproj.FileType
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.SourceTree
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer
import org.junit.Test
import org.junit.runner.RunWith
import org.applause.util.xcode.projectfile.pbxproj.Language
import org.applause.util.xcode.projectfile.pbxproj.KnownRegion

@InjectWith(typeof(PbxprojInjectorProvider))
@RunWith(typeof(XtextRunner))
class CreateTests {
	
	@Inject
	Provider<XtextResourceSet> provider
	
	@Inject 
	ISerializer serializer
	
	@Test
	def testCreateSimpleProject() {
		
	//	// !$*UTF8*$!
	//	{
	//		archiveVersion = 1;
	//		classes = {
	//		};
	//		objectVersion = 46;

		val projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		projectModel.archiveVersion = 1
		projectModel.objectVersion = 42


//	objects = {
//
///* Begin PBXFileReference section */
//		8888BC2F15E6C80B004ED7F7 /* UIKit.framework */ = {isa = PBXFileReference; lastKnownFileType = wrapper.framework; name = UIKit.framework; path = System/Library/Frameworks/UIKit.framework; sourceTree = SDKROOT; };
///* End PBXFileReference section */

		val fileReference = PbxprojFactory::eINSTANCE.createFileReference
		fileReference.name = '8888BC2F15E6C80B004ED7F7'
		fileReference.file = {
			val file = PbxprojFactory::eINSTANCE.createFile
			file.isa = 'PBXFileReference'
			file.lastKnownFileType = FileType::WRAPPER_FRAMEWORK
			file.fileName = 'UIKit.framework'
			
			file.path = {
				val path = PbxprojFactory::eINSTANCE.createPath
				val fragment1 = PbxprojFactory::eINSTANCE.createPathID
				fragment1.value = 'System'
				path.fragments.add(fragment1)
				val fragment2 = PbxprojFactory::eINSTANCE.createPathID
				fragment2.value = 'Library'
				path.fragments.add(fragment2)
				val fragment3 = PbxprojFactory::eINSTANCE.createPathID
				fragment3.value = 'Frameworks'
				path.fragments.add(fragment3)
				val fragment4 = PbxprojFactory::eINSTANCE.createPathID
				fragment4.value = 'UIKit.framework'
				path.fragments.add(fragment4)
				path
			}
			
			file.sourceTree = SourceTree::SDKROOT
			file
		} 
		projectModel.objects.add(fileReference)
		
//
///* Begin PBXBuildFile section */
//		8888BC3015E6C80B004ED7F7 /* UIKit.framework in Frameworks */ = {isa = PBXBuildFile; fileRef = 8888BC2F15E6C80B004ED7F7 /* UIKit.framework */; };
///* End PBXBuildFile section */
//
		
		val buildFile = PbxprojFactory::eINSTANCE.createBuildFile 
		buildFile.name = '8888BC3015E6C80B004ED7F7'
		buildFile.isa = 'PBXBuildFile'
		buildFile.fileRef = fileReference
		projectModel.objects.add(buildFile)
		
		
		val project = PbxprojFactory::eINSTANCE.createProject
		project.name = '8888BC2215E6C80B004ED7F7'
		project.isa = 'PBXProject'
		project.lastupgradeCheck = 440
		project.organisationName = 'John Doe'
		project.buildConfigurationList = '8888BC2515E6C80B004ED7F7'
		project.compatibilityVersion = 'Xcode 3.2'
		project.developmentRegion = Language::ENGLISH
		project.hasScannedForEncodings = 0
		project.knownRegions.add(KnownRegion::EN)
		project.mainGroup = '8888BC2015E6C80B004ED7F7'
		project.productRefGroup = '8888BC2C15E6C80B004ED7F7'
		project.projectDirPath = ''
		project.projectRoot = ''
		project.targets.add('8888BC2A15E6C80B004ED7F7')
		project.targets.add('8888BC4515E6C80B004ED7F7')
		projectModel.objects.add(project)


//
//	};
//	rootObject = 8888BC2215E6C80B004ED7F7 /* Project object */;
//}
		
		projectModel.rootObject = project
		
		
		val resourceSet = provider.get();
		val res = resourceSet.createResource(URI::createFileURI('/Users/peterfriese/Projects/peterfriese.de/Applause2/applause/tooling/org.applause.util.xcode.projectfile.sample/SampleGeneratedProject/SampleGeneratedProject.xcodeproj/project.pbxproj') );
		res.contents.add(projectModel)

		val out = serializer.serialize(projectModel, SaveOptions::newBuilder.format.noValidation.options)		
		System::out.println(out)
		res.save(null);
	}
}