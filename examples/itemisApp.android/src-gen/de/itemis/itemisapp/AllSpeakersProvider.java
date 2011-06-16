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

public class AllSpeakersProvider extends GenericListContentProvider<Speaker> {

	private static final long serialVersionUID = 1L;

	public AllSpeakersProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Speakers {

		@ElementList(inline = true, entry = "speaker")
		private List<Speaker> speakers = new ArrayList<Speaker>();

		public List<Speaker> getSpeakers() {
			return speakers;
		}

	}

	@Override
	protected List<Speaker> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Speakers root = serializer.read(Speakers.class, reader);
		return root.getSpeakers();
	}

}
