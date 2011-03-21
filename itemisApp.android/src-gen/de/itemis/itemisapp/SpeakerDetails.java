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

public class SpeakerDetails extends DetailsActivity<Speaker> {

	Speaker speaker;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Speaker");

		speaker = getItemFromProvider();

		setHeaderTitle(speaker.getName());
		setHeaderDetails(speaker.getBio());
		setHeaderImageURL("http://10.211.55.2:3000" + speaker.getPictureurl());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Session> items1 = speaker.getSessions();
		for (Session i : items1)
			rowAdapters.add(new Cell1(i));

		rowAdapters.add(new Cell2(null));

		rowAdapters.add(new Cell3(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Session> {

		public Cell1(Session item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Session session = getItem();
			setText(session.getTitle());

		}

		@Override
		public void handleClick() {
			Session session = getItem();

			Intent intent = new Intent(SpeakerDetails.this,
					SessionDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					session);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Value2<Void> {

		public Cell2(Void item) {
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

	private class Cell3 extends RowAdapter.Value2<Void> {

		public Cell3(Void item) {
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
