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

public class SessionsByDayProvider extends GenericListContentProvider<Session> {

	private static final long serialVersionUID = 1L;

	public SessionsByDayProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Sessions {

		@ElementList(inline = true, entry = "session")
		private List<Session> sessions = new ArrayList<Session>();

		public List<Session> getSessions() {
			return sessions;
		}

	}

	@Override
	protected List<Session> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Sessions root = serializer.read(Sessions.class, reader);
		return root.getSessions();
	}

}
