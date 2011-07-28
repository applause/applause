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

public class EventList extends GenericListActivity<AllEvents> {

	AllEvents allEvents;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("News");

		allEvents = getItemFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Event> items1 = allEvents.getNews();
		for (Event i : items1)
			rowAdapters.add(new Cell1(i));

		Iterable<Event> items2 = allEvents.getActivity();
		for (Event i : items2)
			rowAdapters.add(new Cell2(i));

		Iterable<Event> items3 = allEvents.getWorkshop();
		for (Event i : items3)
			rowAdapters.add(new Cell3(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Event> {

		public Cell1(Event item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Event n = getItem();
			setText(n.getTitle());
			setDetails(n.getDate());

		}

		@Override
		public void handleClick() {
			Event n = getItem();

			Intent intent = new Intent(EventList.this, EventDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					n);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Subtitle<Event> {

		public Cell2(Event item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Event a = getItem();
			setText(a.getTitle());
			setDetails(a.getDate());

		}

		@Override
		public void handleClick() {
			Event a = getItem();

			Intent intent = new Intent(EventList.this, EventDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					a);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell3 extends RowAdapter.Subtitle<Event> {

		public Cell3(Event item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Event w = getItem();
			setText(w.getTitle());
			setDetails(w.getDate());

		}

		@Override
		public void handleClick() {
			Event w = getItem();

			Intent intent = new Intent(EventList.this, EventDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					w);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
