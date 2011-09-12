package de.itemis.itemisapp;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import de.itemis.base.GenericItemContentProvider;

public class EventByIdProvider extends GenericItemContentProvider<Event> {

	private static final long serialVersionUID = 1L;

	public EventByIdProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Events {

		@Element(required = false, name = "event")
		private Event event;

		public Event getEvent() {
			return event;
		}

	}

	protected Event extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Events root = serializer.read(Events.class, reader);
		return root.getEvent();
	}

}
