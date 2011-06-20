package org.applause.lang.ui.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.applause.lang.applauseDsl.Application;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.VetoException;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

import com.google.common.collect.Iterables;

public abstract class AbstractBuildStrategy {
	
	private IProject platformProject;
	
	private IBuildContext context;

	protected IBuildContext getContext() {
		return context;
	}

	public void setContext(IBuildContext context) {
		this.context = context;
	}
	
	public IProject getPlatformProject() {
		return platformProject;
	}
	
	public void setPlatformProject(IProject platformProject) {
		this.platformProject = platformProject;
	}
	
	protected boolean canBuildProject() {
		return true;
	}

	public void build(IProgressMonitor monitor) throws CoreException {
		if (canBuildProject()) {
			final IFolder folder = getPlatformProject().getFolder(getGeneratedSourcesFolderName());
			
			// FIXME: maybe we should just create the folder if it's missing?!
			if (!folder.exists())
				return;
	
			List<EObject> objects = new ArrayList<EObject>();
			for (Delta d : context.getDeltas()) {
				if (d.getNew() != null) {
					for (IEObjectDescription desc : d.getNew().getExportedObjects()) {
						EObject obj = context.getResourceSet().getEObject(desc.getEObjectURI(), true);
						EcoreUtil2.resolveAll(context.getResourceSet());
						objects.add(obj);
					}
				}
			}
	
			Iterable<Application> applicationObjects = Iterables.filter(objects, Application.class);
			
			if(!Iterables.isEmpty(applicationObjects)) {
				deletePreviouslyGeneratedFiles(monitor, folder);
			}
	
			for (Application app : applicationObjects) {
				OutputImpl output = new OutputImpl();
				Outlet outlet = new Outlet() {
					@Override
					public FileHandle createFileHandle(String qualifiedName) throws VetoException {
						return AbstractBuildStrategy.this.createFileHandle(folder, this, qualifiedName);
					}
	
				};
				configureOutlet(outlet);
				output.addOutlet(outlet);
				
				generate(app, output);
				
				getPlatformProject().build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
				
				return;
			}
		}
	}

	protected void deletePreviouslyGeneratedFiles(IProgressMonitor monitor, final IFolder folder) throws CoreException {
		for (IResource res : folder.members()) {
			if (res instanceof IFile) {
				IFile file = (IFile) res;
				file.delete(true, monitor);
			}
		}
	}

	protected abstract void configureOutlet(Outlet outlet);

	protected FileHandle createFileHandle(IFolder folder, Outlet outlet, String qualifiedName) {
		IFile file = folder.getFile(new Path(qualifiedName));
		try {
			file.setDerived(true, new NullProgressMonitor());
		} catch (CoreException e) {
		}
		return new EclipseBasedFileHandle(file, outlet);
	}

	protected abstract String getGeneratedSourcesFolderName();
	
	public void generate(Application app, Output output) {
		System.out.println("Generating code for platform project " + getPlatformProject().getName() + " from model in model project " + context.getBuiltProject());
		XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output, null, Collections.<String, Variable>emptyMap(), null, null);
		
		ctx.registerMetaModel(new JavaBeansMetaModel());
		try {
			XpandFacade.create(ctx).evaluate(getMainTemplateName(), app);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected abstract String getMainTemplateName();

	protected IFile findFile(IContainer container, String fileName) {
		IResource[] members;
		try {
			members = container.members();
			for (IResource resource : members) {
				if (resource.getType() == IResource.FILE) {
					if (resource.getName().matches(fileName)) {
						return (IFile) resource.getAdapter(IFile.class);
					}
				}
			}			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	public abstract String getName();
	

}
