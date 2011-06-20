package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import de.itemis.base.AbstractRowAdapter;
import de.itemis.base.GenericItemAdapter;
import de.itemis.base.GenericListActivity;
import de.itemis.base.DetailsActivity;
import de.itemis.base.RowAdapter;
import de.itemis.base.SimpleItemContentProvider;
import de.itemis.base.LabeledIntent;

import com.google.common.base.Splitter;
import static de.itemis.base.StringUtils.*;

public class PersonDetails extends DetailsActivity<Person> {

	Person person;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Person");

		person = getItemFromProvider();

		setHeaderTitle(person.getName());
		setHeaderDetails(person.getBio());
		setHeaderImageURL(person.getPictureurl());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		rowAdapters.add(new Cell2(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Value2<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("mail");
			setDetails("some address");

		}

		@Override
		public void handleClick() {

		}

	}

	private class Cell2 extends RowAdapter.Value2<Void> {

		public Cell2(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("blog");
			setDetails("blog's url");

		}

		@Override
		public void handleClick() {

		}

	}

}
