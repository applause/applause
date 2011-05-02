package de.itemis.mobilizer.ui.launching;
 
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import com.appa.tools.macosx.Xcode;
 
public class LaunchXcode implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection ssel = (IStructuredSelection) selection;
            Object firstElement = ssel.getFirstElement();
            if (firstElement instanceof IAdaptable) {
                IFile file = (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
                compile(file);
            }
        }
    }
 
    private void compile(IFile file) {
        String directory = file.getParent().getLocation().toString();
        String appName = file.getLocation().removeFileExtension().lastSegment();
        Xcode.launch(directory, appName);
    }
 
    public void launch(IEditorPart editor, String mode) {
        IEditorInput editorInput = editor.getEditorInput();
        if (editorInput instanceof IFileEditorInput) {
            IFileEditorInput fileEditorInput = (IFileEditorInput) editorInput;
            IFile file = fileEditorInput.getFile();
            compile(file);
        }
    }
 
}