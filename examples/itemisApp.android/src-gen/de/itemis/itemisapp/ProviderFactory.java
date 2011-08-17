package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static CompanyDescriptionProvider getCompanyDescriptionProvider() {
		String feedUrl = "http://www.itemis.de/language=de/~xml.company/37606";
		return new CompanyDescriptionProvider(feedUrl);
	}

	public static OfficeByIdProvider getOfficeByIdProvider(String id) {
		String feedUrl = "http://www.itemis.de/language=de/~xml.applause/" + id;
		return new OfficeByIdProvider(feedUrl);
	}

	public static CarreerDataProvider getCarreerDataProvider() {
		String feedUrl = "http://dl.dropbox.com/u/232067/applause-sampledata/"
				+ "carreer.xml";
		return new CarreerDataProvider(feedUrl);
	}

	public static JobByIdProvider getJobByIdProvider(String id) {
		String feedUrl = "http://dl.dropbox.com/u/232067/applause-sampledata/"
				+ "jobs/" + urlconform(id) + ".xml";
		return new JobByIdProvider(feedUrl);
	}

	public static CurrentTimelineProvider getCurrentTimelineProvider() {
		String feedUrl = "http://www.itemis.de/language=de/~xml.timeline/37606";
		return new CurrentTimelineProvider(feedUrl);
	}

	public static EventByIdProvider getEventByIdProvider(Event e) {
		String feedUrl = "http://dl.dropbox.com/u/232067/applause-sampledata/"
				+ "events/" + urlconform(e.getId()) + ".xml";
		return new EventByIdProvider(feedUrl);
	}

	public static PersonByNameProvider getPersonByNameProvider(String name) {
		String feedUrl = "http://www.itemis.de/applause/people/language=de/~xml.applause/1538/"
				+ urlconform(name) + ".xml";
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
