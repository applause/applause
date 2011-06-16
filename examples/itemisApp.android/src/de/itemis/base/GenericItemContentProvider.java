package de.itemis.base;

import java.io.BufferedReader;
import java.io.Reader;

public abstract class GenericItemContentProvider<T> extends GenericContentProvider<T> implements ItemContentProvider<T>{

	private static final long serialVersionUID = 1L;

	public GenericItemContentProvider(String feedUrl) {
		super(feedUrl);
	}

	public T getItem() {
		try {
			BufferedReader reader = prepareReader();
			return extractItem(reader);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	protected abstract T extractItem(Reader reader) throws Exception;

}


