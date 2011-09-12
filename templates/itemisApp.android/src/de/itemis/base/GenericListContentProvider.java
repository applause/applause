package de.itemis.base;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.List;

public abstract class GenericListContentProvider<T> extends GenericContentProvider<T> implements ListContentProvider<T>{

	private static final long serialVersionUID = 1L;

	public GenericListContentProvider(String feedUrl) {
		super(feedUrl);
	}

	public List<T> getAllItems() {
		try {
			BufferedReader reader = prepareReader(); 
			return extractItems(reader);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected abstract List<T> extractItems(Reader reader) throws Exception;

}
