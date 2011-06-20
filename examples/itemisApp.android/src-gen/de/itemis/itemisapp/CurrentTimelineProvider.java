package de.itemis.itemisapp;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import de.itemis.base.GenericListContentProvider;

public class CurrentTimelineProvider extends GenericListContentProvider<Event> {

	private static final long serialVersionUID = 1L;

	public CurrentTimelineProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Content {

		@ElementList(inline = true, entry = "news")
		private List<Event> events = new ArrayList<Event>();

		public List<Event> getEvents() {
			return events;
		}

	}

	@Override
	protected List<Event> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Content root = serializer.read(Content.class, reader);
		return root.getEvents();
	}

}
