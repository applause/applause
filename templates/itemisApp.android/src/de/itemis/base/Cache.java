package de.itemis.base;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class Cache {

	private static Map<String, Drawable> items = new HashMap<String, Drawable>();
	
	public static Drawable getDrawable(Context ctx, String url, String saveFilename) {
		Drawable result = items.get(url);
		if(result == null) {
			result = doGetDrawable(ctx, url, saveFilename);
			items.put(url, result);
		}
			
		return result;
	}
	
	protected static Drawable doGetDrawable(Context ctx, String url, String saveFilename) {
		try {
			InputStream is = (InputStream) fetch(url);
			Drawable d = Drawable.createFromStream(is, "src");
			return d;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	protected static Object fetch(String address) throws MalformedURLException,IOException {
		URL url = new URL(address);
		Object content = url.getContent();
		return content;
	}

}
