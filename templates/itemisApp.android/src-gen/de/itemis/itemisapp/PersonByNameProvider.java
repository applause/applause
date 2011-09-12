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

public class PersonByNameProvider extends GenericItemContentProvider<Contact> {

	private static final long serialVersionUID = 1L;

	public PersonByNameProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Contacts {

		@Element(required = false, name = "contact")
		private Contact contact;

		public Contact getContact() {
			return contact;
		}

	}

	protected Contact extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Contacts root = serializer.read(Contacts.class, reader);
		return root.getContact();
	}

}
