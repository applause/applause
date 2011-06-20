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

public class EventList extends GenericListActivity<Event> {

	List<Event> events;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("test");

		events = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Event> items1 = events;
		for (Event i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Event> {

		public Cell1(Event item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Event e = getItem();
			setText(e.getTitle());
			setDetails(e.getDate());

		}

		@Override
		public void handleClick() {
			Event e = getItem();

			Intent intent = new Intent(EventList.this, EventDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					e);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
