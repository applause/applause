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

public class OfficeList extends GenericListActivity<Office> {

	List<Office> offices;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Offices");

		offices = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Office> items1 = offices;
		for (Office i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Office> {

		public Cell1(Office item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Office o = getItem();
			setText(o.getLocation());

		}

		@Override
		public void handleClick() {
			Office o = getItem();

			Intent intent = new Intent(OfficeList.this, OfficeDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					o);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
