package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.FileReference

class XcodeFile {
	
	XcodeProject project
	XcodeGroup group
	@Property FileReference pbx_fileReference
	
	private new(XcodeGroup group) {
		this.group = group
		this.project = group.project
		
		pbx_fileReference = PbxprojFactory::eINSTANCE.createFileReference
		pbx_fileReference.isa = 'PBXFileReference'
		pbx_fileReference.name = generateUUID
		sourceTree = SourceTree::GROUP
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
	
	def static createAppFile(XcodeGroup group, Path path) {
		val file = createFile(group)
		file.fileType = FileType::APP
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
		
		pbx_fileReference.explicitFileType = switch type {
			case FileType::APP:
				org::applause::util::xcode::projectfile::pbxproj::FileType::WRAPPER_APPLICATION
		}
	}
	
	def isBuildFile() {
		switch pbx_fileReference.lastKnownFileType {
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH:
				false
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC:
				true
			default:
				false
		}
	}
	
	def setSourceTree(SourceTree tree) {
		pbx_fileReference.sourceTree = switch (tree) {
			case SourceTree::BUILT_PRODUCTS_DIR:
				org::applause::util::xcode::projectfile::pbxproj::SourceTree::BUILT_PRODUCTS_DIR
			case SourceTree::SDKROOT:
				org::applause::util::xcode::projectfile::pbxproj::SourceTree::SDKROOT
			case SourceTree::GROUP:
				org::applause::util::xcode::projectfile::pbxproj::SourceTree::GROUP
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