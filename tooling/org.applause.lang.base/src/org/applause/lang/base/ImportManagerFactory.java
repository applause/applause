package org.applause.lang.base;

import org.applause.lang.applauseDsl.Type;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ImportManagerFactory {
	
	@Inject
	private Provider<ImportManager> importManagerProvider; 
	
	public ImportManager create() {
		return importManagerProvider.get();
	}
	
	public ImportManager create(Type type) {
		ImportManager manager = create();
		manager.setThisType(type);
		return manager;
	}

}
