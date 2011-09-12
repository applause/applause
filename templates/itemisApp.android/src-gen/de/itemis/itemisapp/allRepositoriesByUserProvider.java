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

public class allRepositoriesByUserProvider
		extends
			GenericListContentProvider<Repository> {

	private static final long serialVersionUID = 1L;

	public allRepositoriesByUserProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Repositories {

		@ElementList(inline = true, entry = "repository")
		private List<Repository> repositorys = new ArrayList<Repository>();

		public List<Repository> getRepositorys() {
			return repositorys;
		}

	}

	@Override
	protected List<Repository> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Repositories root = serializer.read(Repositories.class, reader);
		return root.getRepositorys();
	}

}
