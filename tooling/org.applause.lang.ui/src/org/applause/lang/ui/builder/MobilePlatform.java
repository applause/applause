package org.applause.lang.ui.builder;

import org.eclipse.emf.common.util.URI;

public class MobilePlatform {

	private final String name;
	private String projectNameSuffix;
	private URI templateProjectURI;

	public MobilePlatform(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getProjectNameSuffix() {
		return projectNameSuffix;
	}

	public void setProjectNameSuffix(String projectNameSuffix) {
		this.projectNameSuffix = projectNameSuffix;
	}

	public void setTemplateProjectURI(URI templateProjectURI) {
		this.templateProjectURI = templateProjectURI;
	}

	public URI getTemplateProjectURI() {
		return templateProjectURI;
	}

}