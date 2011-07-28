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

public class CarreerView extends DetailsActivity<Carreer> {

	Carreer carreer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Carreer");

		carreer = getItemFromProvider();

		setHeaderDetails(carreer.getDescription());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Link> items1 = carreer.getLink();
		for (Link i : items1)
			rowAdapters.add(new Cell1(i));

		Iterable<JobOffer> items2 = carreer.getJob();
		for (JobOffer i : items2)
			rowAdapters.add(new Cell2(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Link> {

		public Cell1(Link item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Link l = getItem();
			setText(l.getTitle());

		}

		@Override
		public void handleClick() {
			Link l = getItem();

		}

	}

	private class Cell2 extends RowAdapter.Subtitle<JobOffer> {

		public Cell2(JobOffer item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			JobOffer j = getItem();
			setText(j.getLocation());
			setDetails(j.getTitle());

		}

		@Override
		public void handleClick() {
			JobOffer j = getItem();

			Intent intent = new Intent(CarreerView.this, JobOfferDetails.class);
			Serializable contentProvider = ProviderFactory.getJobByIdProvider(j
					.getId());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
