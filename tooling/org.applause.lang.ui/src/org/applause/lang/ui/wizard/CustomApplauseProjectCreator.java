package org.applause.lang.ui.wizard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.applause.lang.ui.builder.MobilePlatform;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class CustomApplauseProjectCreator extends AbstractProjectCreator {

	private static final String MODEL_ROOT = "model";
	private static final List<String> ALL_FOLDERS = ImmutableList.of();
	
	@Inject
	private Provider<PluginProjectFactory> projectFactoryProvider;
	
	@Inject
	private Provider<ProjectFactory> platformProjectFactoryProvider;

	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();	
	}
	
	protected ProjectFactory createPlatformProjectFactory() {
		return platformProjectFactoryProvider.get();
	}

	@Override
	protected String getModelFolderName() {
		return MODEL_ROOT;
	}

	@Override
	protected List<String> getAllFolders() {
		return ALL_FOLDERS;
	}
	
	protected ApplauseDslProjectInfo getApplauseProjectInfo() {
		return (ApplauseDslProjectInfo)getProjectInfo();
	}
	
	@Override
	protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException,
			InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(
				monitor, 
				getCreateModelProjectMessage(),
				getApplauseProjectInfo().numberOfPlatforms() + 1);

		IProject project = createModelProject(subMonitor.newChild(1));
		for(MobilePlatform platform : getApplauseProjectInfo().getSelectedPlatforms()) {
			createPlatformProject(platform, subMonitor.newChild(1));
		}

		IFile modelFile = getModelFile(project);
		setResult(modelFile);
	}

	private IProject createModelProject(SubMonitor monitor) throws CoreException {
		ProjectFactory factory = createProjectFactory();
		configureProjectFactory(factory);
		IProject modelProject = factory.createProject(monitor, null);
		createModel(modelProject, monitor);
		return modelProject;
	}	
	
	private void createModel(final IProject project, final IProgressMonitor monitor) throws CoreException {
		try {
			InputStream contents = this.getClass().getClassLoader().getResourceAsStream("/templates/template.applause");
			String content = replaceTemplate(IOUtils.toString(contents));

			project.getFolder("/model").create(true, true, monitor);
			IFile file = project.getFile("/model/" + getProjectInfo().getProjectName() + ".applause");
			file.create(IOUtils.toInputStream(content), true, monitor);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected ProjectFactory configureProjectFactoryForPlatformProject(ProjectFactory factory, MobilePlatform platform) {
		factory.setProjectName(getProjectInfo().getProjectName() + platform.getProjectNameSuffix());
		factory.addReferencedProjects(getReferencedProjects());
		factory.addProjectNatures(getProjectNatures());
		factory.addBuilderIds(getBuilders());
		return factory;
	}
	
	
	private IProject createPlatformProject(MobilePlatform platform, SubMonitor monitor) {
		ProjectFactory factory = createPlatformProjectFactory();
		configureProjectFactoryForPlatformProject(factory, platform);
		IProject platformProject = factory.createProject(monitor, null);
		enhancePlatformProject(platformProject, platform, monitor);
		return platformProject;
	}
	
	private void enhancePlatformProject(IProject project, MobilePlatform platform, SubMonitor monitor) {
		InputStream stream = null;
		try {
			ExtensibleURIConverterImpl uriConverter = new ExtensibleURIConverterImpl();
			stream = uriConverter.createInputStream(platform.getTemplateProjectURI());
			
			// stream = getClass().getResourceAsStream("newproject/project.zip"); 
			ZipInputStream zipStream = new ZipInputStream(stream);
			ZipEntry entry;
			while ((entry = zipStream.getNextEntry()) != null) {
				String name = entry.getName();
				name = replaceTemplate(name);
//				name = name.substring(name.indexOf(File.separator));
				if (entry.isDirectory()) {
					IFolder folder = project.getFolder(name);
					if (!folder.exists()) {
						folder.create(true, true, monitor);
					}
				} else {
					IFile file = project.getFile(name);
					// PFR: PNGs, GIfs and ZIPs will not be filtered. Poor man's binary detection :-/
					if (entry.getName().endsWith(".png") || entry.getName().endsWith(".gif") || entry.getName().endsWith(".jar")) {
						File destFile = file.getLocation().toFile();
						FileOutputStream output = FileUtils.openOutputStream(destFile);
						IOUtils.copy(zipStream, output);
					}
					else {
						String content;
						content = replaceTemplate(IOUtils.toString(zipStream, "UTF-8"));
						if (file.exists()) {
							file.delete(true, monitor);
						}
						file.create(new StringInputStream(content), true, monitor);
					}
				}
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(stream);
		}
	}
	
	private String replaceTemplate(String str) {
		String projectName = getProjectInfo().getProjectName();
		String capitalizedProjectName = projectName.equals("_template_") ? "_Template_" : StringUtils.capitalize(projectName);
		str = str.replace("itemisApp", projectName);
		str = str.replace("ItemisApp", capitalizedProjectName);
		str = str.replace("de.itemis.itemisapp.R", "de.itemis." + projectName.toLowerCase() + ".R");
		return str;
	}

}
