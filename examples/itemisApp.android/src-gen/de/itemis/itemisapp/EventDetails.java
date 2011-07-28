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

public class EventDetails extends DetailsActivity<Event> {

	Event event;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Event");

		event = getItemFromProvider();

		setHeaderTitle(event.getTitle());
		setHeaderDetails(event.getDescription());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		Iterable<Contact> items2 = event.getSpeakers();
		for (Contact i : items2)
			rowAdapters.add(new Cell2(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(event.getContact());
			setDetails("Contact");

		}

		@Override
		public void handleClick() {

			Intent intent = new Intent(EventDetails.this, PersonDetails.class);
			Serializable contentProvider = ProviderFactory
					.getPersonByNameProvider(event.getContact());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Subtitle<Contact> {

		public Cell2(Contact item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Contact s = getItem();
			setText(s.getName());
			setDetails(s.getRole());

		}

		@Override
		public void handleClick() {
			Contact s = getItem();

			Intent intent = new Intent(EventDetails.this, PersonDetails.class);
			Serializable contentProvider = ProviderFactory
					.getPersonByNameProvider(s.getName());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
