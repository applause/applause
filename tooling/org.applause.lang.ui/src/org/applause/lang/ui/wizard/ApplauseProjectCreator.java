package org.applause.lang.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.applause.lang.ui.builder.MobilePlatform;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ApplauseProjectCreator extends AbstractProjectCreator {

	private static final String MODEL_ROOT = "model";
	private static final List<String> ALL_FOLDERS = ImmutableList.of();
	
	@Inject
	private Provider<PluginProjectFactory> projectFactoryProvider;

	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();	
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

	private void createPlatformProject(MobilePlatform platform,
			SubMonitor newChild) {
	}

	private IProject createModelProject(SubMonitor monitor) throws CoreException {
		ProjectFactory factory = createProjectFactory();
		configureProjectFactory(factory);
		IProject modelProject = factory.createProject(monitor, null);
		createModel(modelProject, monitor);
		return modelProject;
	}	
	
	private void createModel(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("ISO-8859-1");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::applause::lang::ui::wizard::ApplauseDslNewProject::main", getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	

}
