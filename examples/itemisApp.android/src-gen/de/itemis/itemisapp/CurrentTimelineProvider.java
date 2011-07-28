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

public class CurrentTimelineProvider
		extends
			GenericItemContentProvider<AllEvents> {

	private static final long serialVersionUID = 1L;

	public CurrentTimelineProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Data {

		@Element(required = false, name = "events")
		private AllEvents allEvents;

		public AllEvents getAllEvents() {
			return allEvents;
		}

	}

	protected AllEvents extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Data root = serializer.read(Data.class, reader);
		return root.getAllEvents();
	}

}
