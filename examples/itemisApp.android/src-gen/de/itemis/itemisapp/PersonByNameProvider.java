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

public class PersonByNameProvider extends GenericItemContentProvider<Person> {

	private static final long serialVersionUID = 1L;

	public PersonByNameProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Feed {

		@Element(required = false, name = "entry")
		private Person person;

		public Person getPerson() {
			return person;
		}

	}

	protected Person extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Feed root = serializer.read(Feed.class, reader);
		return root.getPerson();
	}

}
