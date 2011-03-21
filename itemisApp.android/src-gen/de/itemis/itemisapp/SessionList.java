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

public class SessionList extends GenericListActivity<Session> {

	List<Session> sessions;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Sessions");

		sessions = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Session> items1 = sessions;
		for (Session i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Session> {

		public Cell1(Session item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Session session = getItem();
			setText(session.getTitle());
			setDetails(session.getTimeslot());

		}

		@Override
		public void handleClick() {
			Session session = getItem();

			Intent intent = new Intent(SessionList.this, SessionDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					session);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
