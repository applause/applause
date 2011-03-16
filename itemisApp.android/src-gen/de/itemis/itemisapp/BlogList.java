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

public class BlogList extends GenericListActivity<BlogItem> {

	List<BlogItem> items;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("itemis news");

		items = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<BlogItem> items1 = items;
		for (BlogItem i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<BlogItem> {

		public Cell1(BlogItem item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			BlogItem i = getItem();
			setText(i.getCreator());
			setDetails(i.getTitle());

		}

		@Override
		public void handleClick() {
			BlogItem i = getItem();

			Intent intent = new Intent(BlogList.this, BlogDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					i);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
