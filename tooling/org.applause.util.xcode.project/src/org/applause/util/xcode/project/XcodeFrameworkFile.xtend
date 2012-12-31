package org.applause.util.xcode.project

import org.applause.util.xcode.projectfile.pbxproj.BuildFileSettingWithCollection
import org.applause.util.xcode.projectfile.pbxproj.BuildFileSettingWithString
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

class XcodeFrameworkFile extends XcodeFile {
	
	new(XcodeGroup group, Path path) {
		super(group)
		this.fileType = FileType::FRAMEWORK
		this.name = path.lastSegment
		this.path = path
		this.sourceTree = SourceTree::SDKROOT
		connect
	}
	
	def setRequired(Boolean required) {
		var attributes = pbx_buildFile.settings.findFirst[name == 'ATTRIBUTES']
		if (attributes == null) {
			attributes = PbxprojFactory::eINSTANCE.createBuildFileSettingWithCollection
			attributes.name = 'ATTRIBUTES'
			pbx_buildFile.settings.add(attributes)
		}
		if (required) {
			setSetting(attributes, 'Required', true)
			setSetting(attributes, 'Weak', false)
		}
		else {
			setSetting(attributes, 'Weak', true)
			setSetting(attributes, 'Required', false)
		}
	}
	
	def required() {
		val attributes = pbx_buildFile.settings.findFirst[name == 'ATTRIBUTES']
		if (attributes != null) {
			return getSetting(attributes, 'Required')
		}
		true // framework files are required by default
	}
	
	def dispatch getSetting(BuildFileSettingWithCollection setting, String name) {
		val currentValue = setting.values.findFirst[it == name]
		currentValue != null
	}
	
	/**
	 * Should not be called.
	 */
	def dispatch getSetting(BuildFileSettingWithString setting, String name) {
		false
	}
	
	def dispatch setSetting(BuildFileSettingWithCollection setting, String name, Boolean value) {
		val currentValue = setting.values.findFirst[it == name]
		
		if ( (currentValue != null) && (value == false) ) {
			setting.values.remove(currentValue)
		}
		
		if ( (currentValue == null) && (value == true) ) {
			setting.values.add(name)
		}
	}
	
	/** 
	 * Should not be called.
	 */
	def dispatch setSetting(BuildFileSettingWithString setting, String name, Boolean value) {
		false
	}
	
}