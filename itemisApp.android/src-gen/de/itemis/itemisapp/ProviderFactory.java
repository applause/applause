package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static BlogpostsProvider getBlogpostsProvider() {
		String feedUrl = "http://feedsanitizer.appspot.com/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss";
		return new BlogpostsProvider(feedUrl);
	}

	public static SessionsByDayProvider getSessionsByDayProvider(String day) {
		String feedUrl = "http://eclipsesummit2010.appspot.com/sessions/day/"
				+ day + "/?format=xml";
		return new SessionsByDayProvider(feedUrl);
	}

	public static SessionByIdProvider getSessionByIdProvider(Session s) {
		String feedUrl = "dfsdfsdfsdfs" + s.getRoom();
		return new SessionByIdProvider(feedUrl);
	}

	public static AllSpeakersProvider getAllSpeakersProvider() {
		String feedUrl = "http://eclipsesummit2010.appspot.com/speakers/?format=xml";
		return new AllSpeakersProvider(feedUrl);
	}

	public static SpeakerByNameProvider getSpeakerByNameProvider(String name) {
		String feedUrl = "http://eclipsesummit2010.appspot.com/speakers/name/"
				+ urlconform(name) + "/?format=xml";
		return new SpeakerByNameProvider(feedUrl);
	}

}
