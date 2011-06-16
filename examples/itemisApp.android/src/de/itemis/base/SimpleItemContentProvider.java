package de.itemis.base;

import java.io.Serializable;

public class SimpleItemContentProvider<T> implements Serializable, ItemContentProvider<T> {

	private static final long serialVersionUID = 6405104595298433536L;
	
	private final T item;
	
	public SimpleItemContentProvider(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}

}
