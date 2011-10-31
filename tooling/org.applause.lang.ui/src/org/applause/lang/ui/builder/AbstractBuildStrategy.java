package org.applause.lang.ui.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.ArrayUtils;
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

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

public abstract class AbstractBuildStrategy {
	
	private IProject modelProject;
	
	private IProject platformProject;
	
	private IBuildContext context;

	protected IBuildContext getContext() {
		return context;
	}

	public void setContext(IBuildContext context) {
		this.context = context;
	}
	
	public IProject getModelProject() {
		return modelProject;
	}
	
	public void setModelProject(IProject modelProject) {
		this.modelProject = modelProject;
	}
	
	public IProject getPlatformProject() {
		return platformProject;
	}
	
	public void setPlatformProject(IProject platformProject) {
		this.platformProject = platformProject;
	}
	
	protected abstract boolean canBuildProject();

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
				Outlet outlet = createOutlet(folder);
				configureOutlet(outlet);
				output.addOutlet(outlet);

//				IFolder rootFolder = (IFolder) getPlatformProject().getAdapter(IFolder.class);
//				// IPath location = getPlatformProject().getFullPath();
//				// IFolder rootFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(location);
//				Outlet projectRootOutlet = createOutlet(rootFolder);
//				projectRootOutlet.setName("ROOT");
//				output.addOutlet(projectRootOutlet);

				generate(app, output);
				copyResources(app, getModelProject().getFolder("/Images"));
				getPlatformProject().build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
				return;
			}
		}
	}
	
	protected boolean isFileInHighResFolder(IFile file) {
		String[] segments = file.getFullPath().segments();
		return ArrayUtils.contains(segments, "highres");
	}

	protected void copyResources(Application app, IFolder sourceFolder) throws CoreException {
		Collection<IFile> allImageFiles = collectAllImageFiles(sourceFolder);
		Predicate<IFile> highresPredicate = new Predicate<IFile>() {
			@Override
			public boolean apply(IFile input) {
				if (input.getName().contains("@2x")) {
					return true;
				}
				else if (isFileInHighResFolder(input)) {
					return true;
				}
				return false;
			}
		};
		Iterable<IFile> highresImages = Iterables.filter(allImageFiles, highresPredicate);
		
		Predicate<IFile> lowresPredicate = Predicates.not(highresPredicate);
		Iterable<IFile> lowresImages = Iterables.filter(allImageFiles, lowresPredicate);
		
		copyLowResImages(lowresImages);
		copyHighResImages(highresImages);
		
		copySplash(app, sourceFolder);
	}
	
	protected abstract void copySplash(Application app, IFolder folder) throws CoreException;
	
	protected abstract IFolder getHighResImageDestinationFolder(IFile file);
	protected abstract String getHighResImageFileName(String normalizedFileName);
	protected abstract IFolder getImageDestinationFolder(IFile file);
	protected abstract String getImageFileName(String normalizedFileName);
	
	private String getNormalizedFileName(IFile file) {
		String baseName = FilenameUtils.getBaseName(file.getName());
		if (baseName.endsWith("@2x")) {
			return baseName.substring(0, baseName.lastIndexOf("@2x")) + "." + file.getFileExtension(); 
		}
		else {
			return file.getName();
		}
	}
	
	private void copyHighResImages(Iterable<IFile> highresImages) throws CoreException {
		for (IFile file : highresImages) {
			IFolder destinationFolder = getHighResImageDestinationFolder(file);
			String imageFileName = getHighResImageFileName(getNormalizedFileName(file));
			if ( (destinationFolder != null) && (imageFileName != null)) {
				IFile targetFile = destinationFolder.getFile(imageFileName);
				if (!targetFile.exists()) {
					file.copy(targetFile.getFullPath(), true, null);
				}
			}
		}
	}

	private void copyLowResImages(Iterable<IFile> lowresImages) throws CoreException {
		for (IFile file : lowresImages) {
			IFolder destinationFolder = getImageDestinationFolder(file);
			String imageFileName = getImageFileName(getNormalizedFileName(file));
			if ( (destinationFolder != null) && (imageFileName != null)) {
				IFile targetFile = destinationFolder.getFile(imageFileName);
				if (!targetFile.exists()) {
					file.copy(targetFile.getFullPath(), true, null);
				}
			}
		}
	}

	protected static final String[] IMAGE_FILE_EXTS = {"png", "jpg"};
	
	protected boolean isImageFile(IFile file) {
		return (ArrayUtils.contains(IMAGE_FILE_EXTS, file.getFileExtension()));
	}
	
	protected Collection<IFile> collectAllImageFiles(IFolder sourceFolder) throws CoreException {
		Collection<IFile> files = new ArrayList<IFile>();
		IResource[] members = sourceFolder.members();
		for (IResource resource : members) {
			if (resource instanceof IFile) {
				IFile file = (IFile)resource;
				if (isImageFile(file)) {
					files.add(file);
				}
			}
			else if (resource instanceof IFolder) {
				files.addAll(collectAllImageFiles((IFolder)resource));
			}
		}
		return files;
	}

	private Outlet createOutlet(final IFolder folder) {
		Outlet outlet = new Outlet() {
			@Override
			public FileHandle createFileHandle(String qualifiedName) throws VetoException {
				return AbstractBuildStrategy.this.createFileHandle(folder, this, qualifiedName);
			}

		};
		return outlet;
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

	protected IFile findFile(IContainer container, String fileSpec) {
		Pattern pattern = Pattern.compile(fileSpec);
		try {
			IResource[] members = container.members();
			for (IResource resource : members) {
				if (resource instanceof IFile) {
					IFile file = (IFile) resource;
					if (pattern.matcher(file.getName()).matches()) {
						return file;
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
