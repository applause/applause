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

public class JobByIdProvider extends GenericItemContentProvider<JobOffer> {

	private static final long serialVersionUID = 1L;

	public JobByIdProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Jobs {

		@Element(required = false, name = "job")
		private JobOffer jobOffer;

		public JobOffer getJobOffer() {
			return jobOffer;
		}

	}

	protected JobOffer extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Jobs root = serializer.read(Jobs.class, reader);
		return root.getJobOffer();
	}

}
