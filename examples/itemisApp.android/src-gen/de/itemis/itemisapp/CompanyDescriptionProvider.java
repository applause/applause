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

public class CompanyDescriptionProvider
		extends
			GenericItemContentProvider<Company> {

	private static final long serialVersionUID = 1L;

	public CompanyDescriptionProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Data {

		@Element(required = false, name = "company")
		private Company company;

		public Company getCompany() {
			return company;
		}

	}

	protected Company extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Data root = serializer.read(Data.class, reader);
		return root.getCompany();
	}

}
