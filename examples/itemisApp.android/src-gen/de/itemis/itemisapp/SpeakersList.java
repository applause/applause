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

public class SpeakersList extends GenericListActivity<Speaker> {

	List<Speaker> speakers;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Speakers");

		speakers = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Speaker> items1 = speakers;
		for (Speaker i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Speaker> {

		public Cell1(Speaker item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Speaker s = getItem();
			setText(s.getName());

			setImageURL("http://eclipsecon2011-data.webbyapp.com"
					+ s.getPictureurl());
		}

		@Override
		public void handleClick() {
			Speaker s = getItem();

			Intent intent = new Intent(SpeakersList.this, SpeakerDetails.class);
			Serializable contentProvider = ProviderFactory
					.getSpeakerByNameProvider(s.getName());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
