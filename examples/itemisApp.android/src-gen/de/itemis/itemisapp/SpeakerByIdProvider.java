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

public class SpeakerByIdProvider extends GenericItemContentProvider<Speaker> {

	private static final long serialVersionUID = 1L;

	public SpeakerByIdProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Result {

		@Element(required = false, name = "speaker")
		private Speaker speaker;

		public Speaker getSpeaker() {
			return speaker;
		}

	}

	protected Speaker extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Result root = serializer.read(Result.class, reader);
		return root.getSpeaker();
	}

}
