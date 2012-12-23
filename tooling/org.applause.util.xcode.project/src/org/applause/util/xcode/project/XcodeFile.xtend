package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

import static extension org.applause.util.xcode.project.XcodeProjectUtils.*
import org.applause.util.xcode.projectfile.pbxproj.FileReference
import org.applause.util.xcode.projectfile.pbxproj.BuildFile
import static extension org.applause.util.xcode.project.Path.*

class XcodeFile {
	
	XcodeProject project
	@Property XcodeGroup group
	@Property FileReference pbx_fileReference
	@Property BuildFile pbx_buildFile
	
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
		file.sourceTree = SourceTree::BUILT_PRODUCTS_DIR
		file.includeInIndex = false
		file.connect
		file
	}
	
	def static createOCTestFile(XcodeGroup group, Path path) {
		val file = createFile(group)		
		file.fileType = FileType::OCTEST
		file.path = path
		file.sourceTree = SourceTree::BUILT_PRODUCTS_DIR
		file.includeInIndex = false
		file.connect
		file
	}
	
	def static createPlistFile(XcodeGroup group, Path path) {
		val file = createFile(group)
		file.fileType = FileType::PLIST
		file.path = path
		file.connect
		file;
	}
	
	def static createFrameworkFile(XcodeGroup group, Path path) {
		val file = createFile(group)
		file.fileType = FileType::FRAMEWORK
		// 8888BC3115E6C80B004ED7F7 /* Foundation.framework */ = {
		// isa = PBXFileReference; 
		// lastKnownFileType = wrapper.framework; 
		// name = Foundation.framework; 
		// path = System/Library/Frameworks/Foundation.framework; 
		// sourceTree = SDKROOT; };
		file.name = path.lastSegment
		file.path = path
		file.sourceTree = SourceTree::SDKROOT
		file.connect
		file;		
	}
	
	def setIncludeInIndex(boolean include) {
		pbx_fileReference.includeInIndex = if (include)  1 else 0
	}
	
	def setName(String name) {
		pbx_fileReference.fileName = name
	}
	
	def setPath(Path path) {
		pbx_fileReference.path = path.pbx_path
	}
	
	def path() {
		pbx_fileReference.path.toPath
	}
	
	def setFileType(FileType type) {
		pbx_fileReference.lastKnownFileType = null;
		pbx_fileReference.explicitFileType = null;
		
		pbx_fileReference.lastKnownFileType = switch type {
			case FileType::C_HEADER: 
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH
			case FileType::C_MODULE:
				org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC
			case FileType::PLIST:
				org::applause::util::xcode::projectfile::pbxproj::FileType::TEXT_PLIST_XML
			case FileType::FRAMEWORK:
				org::applause::util::xcode::projectfile::pbxproj::FileType::WRAPPER_FRAMEWORK
		}
		
		pbx_fileReference.explicitFileType = switch type {
			case FileType::APP:
				org::applause::util::xcode::projectfile::pbxproj::FileType::WRAPPER_APPLICATION
			case FileType::OCTEST:
				org::applause::util::xcode::projectfile::pbxproj::FileType::WRAPPER_CF_BUNDLE
		}
	}
	
	def isBuildFile() {
		switch pbx_fileReference.lastKnownFileType {
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_CH:
				false
			case org::applause::util::xcode::projectfile::pbxproj::FileType::SOURCECODE_COBJC:
				true
			case org::applause::util::xcode::projectfile::pbxproj::FileType::WRAPPER_FRAMEWORK:
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
			pbx_buildFile = PbxprojFactory::eINSTANCE.createBuildFile
			pbx_buildFile.isa = 'PBXBuildFile'
			pbx_buildFile.name = generateUUID	
			pbx_buildFile.fileRef = pbx_fileReference
			project.pbx_projectModel.objects.add(pbx_buildFile)
		}
	}	
}