package de.itemis.mobilizer.ui.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
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

import de.itemis.mobilizer.appModelDsl.Application;

public abstract class AbstractBuildStrategy {
	
	private final IBuildContext context;

	public AbstractBuildStrategy(IBuildContext context) {
		this.context = context;
	}
	
	protected IBuildContext getContext() {
		return context;
	}

	public void build(IProgressMonitor monitor) throws CoreException {
		final IFolder folder = context.getBuiltProject().getFolder(getGeneratedSourcesFolderName());
		if (!folder.exists())
			return;

		for (IResource res : folder.members()) {
			if (res instanceof IFile) {
				IFile file = (IFile) res;
				file.delete(true, monitor);
			}
		}

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

		for (Application app : Iterables.filter(objects, Application.class)) {
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
			return;
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
		XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output, null, Collections.<String, Variable>emptyMap(), null, null);
		
		ctx.registerMetaModel(new JavaBeansMetaModel());
		try {
			XpandFacade.create(ctx).evaluate(getMainTemplateName(), app);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected abstract String getMainTemplateName();
	

}
