package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static AllOfficesProvider getAllOfficesProvider() {
		String feedUrl = "https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values";
		return new AllOfficesProvider(feedUrl);
	}

	public static OfficeResolverProvider getOfficeResolverProvider(Office o) {
		String feedUrl = "https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values?sq=location%3D"
				+ urlconform(o.getLocation());
		return new OfficeResolverProvider(feedUrl);
	}

	public static CurrentTimelineProvider getCurrentTimelineProvider() {
		String feedUrl = "http://heikobehrens.net/misc/jazoon11/data.php";
		return new CurrentTimelineProvider(feedUrl);
	}

	public static EventByIdProvider getEventByIdProvider(Event e) {
		String feedUrl = "https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values?sq=id=="
				+ e.getId();
		return new EventByIdProvider(feedUrl);
	}

	public static PersonByNameProvider getPersonByNameProvider(String name) {
		String feedUrl = "https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values?sq=id%3D"
				+ urlconform(replace(name, " ", ""));
		return new PersonByNameProvider(feedUrl);
	}

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
