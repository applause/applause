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

public class OfficeByIdProvider extends GenericItemContentProvider<Office> {

	private static final long serialVersionUID = 1L;

	public OfficeByIdProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Offices {

		@Element(required = false, name = "office")
		private Office office;

		public Office getOffice() {
			return office;
		}

	}

	protected Office extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Offices root = serializer.read(Offices.class, reader);
		return root.getOffice();
	}

}
