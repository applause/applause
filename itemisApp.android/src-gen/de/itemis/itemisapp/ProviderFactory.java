package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static BlogpostsProvider getBlogpostsProvider() {
		String feedUrl = "http://feedsanitizer.appspot.com"
				+ "/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss";
		return new BlogpostsProvider(feedUrl);
	}

	public static SessionsByDayProvider getSessionsByDayProvider(String day) {
		String feedUrl = "http://eclipsecon2011-data.webbyapp.com"
				+ "/sessions/day/" + day + ".xml";
		return new SessionsByDayProvider(feedUrl);
	}

	public static SessionByIdProvider getSessionByIdProvider(Session s) {
		String feedUrl = "http://eclipsecon2011-data.webbyapp.com"
				+ "/sessions/id/" + s.getId() + ".xml";
		return new SessionByIdProvider(feedUrl);
	}

	public static SpeakerByIdProvider getSpeakerByIdProvider(Speaker s) {
		String feedUrl = "http://eclipsecon2011-data.webbyapp.com"
				+ "/speakers/id/" + s.getId() + ".xml";
		return new SpeakerByIdProvider(feedUrl);
	}

	public static BlogItemByIdProvider getBlogItemByIdProvider(BlogItem b) {
		String feedUrl = "http://feedsanitizer.appspot.com"
				+ "/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id="
				+ urlconform(b.getGuid());
		return new BlogItemByIdProvider(feedUrl);
	}

	public static AllSpeakersProvider getAllSpeakersProvider() {
		String feedUrl = "http://eclipsecon2011-data.webbyapp.com"
				+ "/speakers.xml";
		return new AllSpeakersProvider(feedUrl);
	}

	public static SpeakerByNameProvider getSpeakerByNameProvider(String name) {
		String feedUrl = "http://eclipsecon2011-data.webbyapp.com"
				+ "/speakers/name/" + urlconform(name) + ".xml";
		return new SpeakerByNameProvider(feedUrl);
	}

}
