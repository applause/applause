package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.SourceTree

class XcodeFile {
	
	XcodeProject project
	XcodeGroup group
	FileReference pbx_fileReference
	
	private new(XcodeGroup group) {
		this.group = group
		this.project = group.project
		
		pbx_fileReference = PbxprojFactory::eINSTANCE.createFileReference
		pbx_fileReference.isa = 'PBXFileReference'
		pbx_fileReference.name = generateUUID
		pbx_fileReference.sourceTree = SourceTree::GROUP
	}
	
	def static createFile(XcodeGroup group) {
		val file = new XcodeFile(group)
		file
	}
	
	def static createHeaderFile(XcodeGroup group, Path path) {
		val file = createFile(group)
		file.fileType = FileType::C_HEADER
		file.path = path
		file.connect
		file
	}
	
	def static createModuleFile(XcodeGroup group, Path path) {
		val file = createFile(group)
		file.fileType = FileType::C_MODULE
		file.path = path
		file.connect
		file
	}
	
	def setPath(Path path) {
		pbx_fileReference.path = path.pbx_path
	}
	
	def setFileType(FileType type) {
		pbx_fileReference.lastKnownFileType = switch type {
			case FileType::C_HEADER: 
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH
			case FileType::C_MODULE:
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC
		}
	}
	
	def isBuildFile() {
		switch pbx_fileReference.lastKnownFileType {
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH:
				false
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC:
				true	
		}
	}
	
	def private connect() {
		// hook up the fileReference
		project.pbx_projectModel.objects.add(pbx_fileReference)
		group.pbx_group.children.add(pbx_fileReference)
		
		
		if (buildFile) {
			val buildFile = PbxprojFactory::eINSTANCE.createBuildFile
			buildFile.isa = 'PBXBuildFile'
			buildFile.name = generateUUID	
			buildFile.fileRef = pbx_fileReference
			project.pbx_projectModel.objects.add(buildFile)
		}
	}	
}