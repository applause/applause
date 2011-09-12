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

public class UserDetails extends DetailsActivity<User> {

	User user;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		user = getItemFromProvider();

		setTitle(user.getName());

		setHeaderTitle(user.getName());
		setHeaderDetails(user.getFollowers() + " followers");

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.DefaultWithDisclosure<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(user.getRepos() + " public repositories");

		}

		@Override
		public void handleClick() {

			Intent intent = new Intent(UserDetails.this, RepositoryList.class);
			Serializable contentProvider = ProviderFactory
					.getAllRepositoriesByUserProvider(user.getLogin());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
