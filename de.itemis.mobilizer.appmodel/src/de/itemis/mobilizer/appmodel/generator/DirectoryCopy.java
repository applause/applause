package de.itemis.mobilizer.appmodel.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCopy extends AbstractWorkflowComponent {
	private String sourceDir = null;
	private String targetDir = null;

	public void setSourceDir(String sourceDir) {
		this.sourceDir = sourceDir;
	}

	public void setTargetDir(String targetDir) {
		this.targetDir = targetDir;
	}

	public void checkConfiguration(Issues issues) {
		if (sourceDir == null) {
			issues.addError("No sourceDir set.");
		}
		if (targetDir == null) {
			issues.addError("No targetDir set.");
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		File sourceLocation = new File(sourceDir);
		File targetLocation = new File(targetDir);
		try {
			copyFile(sourceLocation, targetLocation);
		} catch (IOException e) {
			issues.addError(this, "Cannot perform I/O.", e);
		}
	}
	
	protected void copyFile(File sourceLocation, File targetLocation) throws IOException {
		if(sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}
			File[] children = sourceLocation.listFiles();
			if (children != null) {
				for (File child : children) {
					File sourceElement = new File(sourceLocation, child.getName());
					File targetElement = new File(targetLocation, child.getName());
					copyFile(sourceElement, targetElement);
				}
			}
		}
		else {
			FileChannel sourceChannel = null;
			FileChannel destinationChannel = null;
			try {
				sourceChannel = new FileInputStream(sourceLocation).getChannel();
				destinationChannel = new FileOutputStream(targetLocation).getChannel();
				destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			} finally {
				if (sourceChannel != null) {
					sourceChannel.close();
				}
				if (destinationChannel != null) {
					destinationChannel.close();
				}
			}
		}
	}

}
