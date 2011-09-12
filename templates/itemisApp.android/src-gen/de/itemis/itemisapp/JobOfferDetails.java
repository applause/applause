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

public class JobOfferDetails extends DetailsActivity<JobOffer> {

	JobOffer job;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Job Offer");

		job = getItemFromProvider();

		setHeaderTitle(job.getTitle());
		setHeaderDetails(job.getDescription());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(job.getContact());
			setDetails("Contact");

		}

		@Override
		public void handleClick() {

			Intent intent = new Intent(JobOfferDetails.this,
					PersonDetails.class);
			Serializable contentProvider = ProviderFactory
					.getPersonByNameProvider(job.getContact());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
