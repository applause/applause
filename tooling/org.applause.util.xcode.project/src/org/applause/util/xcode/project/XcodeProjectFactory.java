package org.applause.util.xcode.project;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class XcodeProjectFactory {
	
	@Inject 
	private Provider<XcodeProject> xcodeProjectProvider;
	
	public XcodeProject create() {
		XcodeProject project = xcodeProjectProvider.get();
		project.init("");
		return project;
	}
	
	public XcodeProject create(String path) {
		XcodeProject project = xcodeProjectProvider.get();
		project.init(path);
		return project;
	}

}
