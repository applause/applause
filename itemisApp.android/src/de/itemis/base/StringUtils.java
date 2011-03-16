package de.itemis.base;

public class StringUtils {
	
	public static String urlconform(String s) {
		return java.net.URLEncoder.encode(s).replaceAll("\\+", "%20");
	}
	
	public static String replace(String source, String match,
			String replacement) {
		return source.replaceAll(match, replacement);
	}


}
