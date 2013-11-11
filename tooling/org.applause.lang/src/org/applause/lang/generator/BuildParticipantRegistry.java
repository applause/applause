package org.applause.lang.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Lists;

public class BuildParticipantRegistry {
	
	private ArrayList<IBuildParticipant>buildParticipants;
	
	public List<IBuildParticipant>getBuildParticipants() {
		if (buildParticipants == null) {
			buildParticipants = Lists.newArrayList();
			IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor("org.applause.lang.platformbuildparticipant");
			for (IConfigurationElement config : configs) {
				try {
					IBuildParticipant participant = (IBuildParticipant)config.createExecutableExtension("class");
					buildParticipants.add(participant);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return buildParticipants;
	}

}
