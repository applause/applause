package de.itemis.mobilizer.ui.generator;

import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.builder.JavaProjectBasedBuilderParticipant;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;
import com.google.inject.Provider;

// TODO: inheritance and extensive overriding/hiding looks ugly here, is C&P better?
public class BuilderParticipant extends JavaProjectBasedBuilderParticipant {

	private Map<URI, Set<String>> sourceTargetMap = newHashMap();

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {

		for (IResourceDescription.Delta delta : context.getDeltas()) {
			final Set<String> oldFiles = newHashSet();
			if (sourceTargetMap.containsKey(delta.getUri())) {
				oldFiles.addAll(sourceTargetMap.get(delta.getUri()));
			}
			final Set<String> newFiles = newHashSet();
			// TODO: should be a better way to obtain the path...
			String path = "/" + context.getBuiltProject().getName();
			IFileSystemAccess fileSystemAccess = getConfiguredFileSystemAccess(path, new IAcceptor<String>() {
				public void accept(String fileName) {
					oldFiles.remove(fileName);
					newFiles.add(fileName);
				}
			});
			if (delta.getNew() == null) {
				handleDeletion(delta, context, fileSystemAccess);
			} else {
				handleChangedContents(delta, context, fileSystemAccess);
			}
			for (String removeFile : oldFiles) {
				fileSystemAccess.deleteFile(removeFile);
			}
			if (!newFiles.isEmpty()) {
				sourceTargetMap.put(delta.getUri(), newFiles);
			}
		}
	}	
	
	@Inject
	private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;
	
	protected IFileSystemAccess getConfiguredFileSystemAccess(String path, IAcceptor<String> newFileAcceptor) {
		EclipseResourceFileSystemAccess access = fileAccessProvider.get();
		access.setOutputPath(path);
		access.setNewFileAcceptor(newFileAcceptor);
		return access;
	}
	
}
