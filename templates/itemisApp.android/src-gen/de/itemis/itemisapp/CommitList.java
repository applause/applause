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

public class CommitList extends GenericListActivity<Commit> {

	List<Commit> commits;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Commits");

		commits = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Commit> items1 = commits;
		if (items1 != null)
			for (Commit i : items1)
				rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Commit> {

		public Cell1(Commit item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Commit c = getItem();
			setText(c.getCommitter().getName());
			setDetails(c.getMessage());

		}

		@Override
		public void handleClick() {
			Commit c = getItem();

			Intent intent = new Intent(CommitList.this, UserDetails.class);
			Serializable contentProvider = ProviderFactory
					.getUserDataProvider(c.getCommitter().getLogin());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
