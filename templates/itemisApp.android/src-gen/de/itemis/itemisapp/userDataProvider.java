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

public class userDataProvider extends GenericItemContentProvider<User> {

	private static final long serialVersionUID = 1L;

	public userDataProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Users {

		@Element(required = false, name = "user")
		private User user;

		public User getUser() {
			return user;
		}

	}

	protected User extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Users root = serializer.read(Users.class, reader);
		return root.getUser();
	}

}
