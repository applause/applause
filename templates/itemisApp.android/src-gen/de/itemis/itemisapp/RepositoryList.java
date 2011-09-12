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

public class RepositoryList extends GenericListActivity<Repository> {

	List<Repository> repositories;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		repositories = getItemsFromProvider();

		setTitle("Repositories");

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Repository> items1 = repositories;
		if (items1 != null)
			for (Repository i : items1)
				rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Repository> {

		public Cell1(Repository item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Repository r = getItem();
			setText(r.getName());
			setDetails(r.getDescription());

		}

		@Override
		public void handleClick() {
			Repository r = getItem();

			Intent intent = new Intent(RepositoryList.this, CommitList.class);
			Serializable contentProvider = ProviderFactory
					.getAllCommitsByRepositoryProvider(r.getOwner() + "/"
							+ r.getName());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
