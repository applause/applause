package de.itemis.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public abstract class GenericContentProvider<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String feedUrl;

	public GenericContentProvider(String feedUrl) {
		this.feedUrl = feedUrl;
	}
	
	protected String getFeedURL() {
		return feedUrl;
	}
	
	protected BufferedReader prepareReader() throws MalformedURLException,
	IOException {
		URL url = new URL(getFeedURL());
		URLConnection uc = url.openConnection();
		
		InputStreamReader input = new InputStreamReader(uc.getInputStream());
		BufferedReader reader = new BufferedReader(input);
		return reader;
	}
	
}
