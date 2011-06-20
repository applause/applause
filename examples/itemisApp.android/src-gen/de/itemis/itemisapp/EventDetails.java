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

		setTitle(event.getKind());

		event = getItemFromProvider();

		setHeaderTitle(event.getTitle());
		setHeaderDetails(event.getDescription());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		Iterable<String> items2 = Splitter.on(",").split(event.getSpeakers());
		for (String i : items2)
			rowAdapters.add(new Cell2(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(event.getContact());

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

	private class Cell2 extends RowAdapter.Default<String> {

		public Cell2(String item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			String s = getItem();
			setText(s);

		}

		@Override
		public void handleClick() {
			String s = getItem();

			Intent intent = new Intent(EventDetails.this, PersonDetails.class);
			Serializable contentProvider = ProviderFactory
					.getPersonByNameProvider(s);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
