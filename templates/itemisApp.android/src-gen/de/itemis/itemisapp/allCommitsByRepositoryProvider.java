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

public class allCommitsByRepositoryProvider
		extends
			GenericListContentProvider<Commit> {

	private static final long serialVersionUID = 1L;

	public allCommitsByRepositoryProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Commits {

		@ElementList(inline = true, entry = "commit")
		private List<Commit> commits = new ArrayList<Commit>();

		public List<Commit> getCommits() {
			return commits;
		}

	}

	@Override
	protected List<Commit> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Commits root = serializer.read(Commits.class, reader);
		return root.getCommits();
	}

}
