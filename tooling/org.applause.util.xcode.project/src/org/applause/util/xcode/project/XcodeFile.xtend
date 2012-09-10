package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.SourceTree
import org.applause.util.xcode.project.XcodeProject

import static org.applause.util.xcode.project.XcodeProjectUtils.*

class XcodeFile extends AbstractXcodeProjectElement  {
	
	new(XcodeProject project) {
		super(project)
		
		fileReference = PbxprojFactory::eINSTANCE.createFileReference
		fileReference.isa = 'PBXFileReference'
		fileReference.name = generateUUID
		fileReference.sourceTree = SourceTree::GROUP
		fileReference.addToProject
		
		val buildFile = PbxprojFactory::eINSTANCE.createBuildFile
		buildFile.isa = 'PBXBuildFile'
		buildFile.name = generateUUID
		buildFile.fileRef = fileReference
		buildFile.addToProject
	}

	def static createHeaderFile(XcodeProject project, String path) {
		val result = new XcodeFile(project)
		result.fileType = FileType::C_HEADER
		result.path = path
		result
	}
	
	def static createModuleFile(XcodeProject project, String path) {
		val result = new XcodeFile(project)
		result.fileType = FileType::C_MODULE
		result.path = path
		result
	}
	
	def setFileReference(FileReference ref) {
		object = ref
	}
	
	def getFileReference() {
		return object as FileReference
	}
	
	
	def setFileType(FileType type) {
		fileReference.lastKnownFileType = switch type {
			case FileType::C_HEADER: 
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH
			case FileType::C_MODULE:
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC
		}
	}
	
	def setPath(String path) {
		fileReference.path = makePath(path) 
	}
	
}