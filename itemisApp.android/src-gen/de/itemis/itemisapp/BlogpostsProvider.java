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

public class BlogpostsProvider extends GenericListContentProvider<BlogItem> {

	private static final long serialVersionUID = 1L;

	public BlogpostsProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Rss {

		@ElementList(inline = true, entry = "channel")
		private List<Channel> channels = new ArrayList<Channel>();

		public List<Channel> getChannels() {
			return channels;
		}

	}

	@Root(strict = false)
	public static class Channel {

		@ElementList(inline = true, entry = "item")
		private List<BlogItem> blogItems = new ArrayList<BlogItem>();

		public List<BlogItem> getBlogItems() {
			return blogItems;
		}

	}

	@Override
	protected List<BlogItem> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Rss root = serializer.read(Rss.class, reader);
		return root.getChannels().get(0).getBlogItems();
	}

}
