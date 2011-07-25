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

public class OfficeDetails extends DetailsActivity<Office> {

	Office office;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Office");

		office = getItemFromProvider();

		setHeaderTitle(office.getLocation());
		setHeaderDetails(office.getSummary());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		rowAdapters.add(new Cell2(null));

		rowAdapters.add(new Cell3(null));

		rowAdapters.add(new Cell4(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(office.getContact());

		}

		@Override
		public void handleClick() {

			Intent intent = new Intent(OfficeDetails.this, PersonDetails.class);
			Serializable contentProvider = ProviderFactory
					.getPersonByNameProvider(office.getContact());
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Map<Void> {

		public Cell2(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText(office.getAddress());

			setQuery(office.getAddress());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("http://maps.google.de/maps?q="
							+ urlconform(office.getAddress())));
			startActivity(intent);

		}

	}

	private class Cell3 extends RowAdapter.Value2<Void> {

		public Cell3(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("phone");
			setDetails(office.getPhone());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("tel:" + office.getPhone()));
			startActivity(intent);

		}

	}

	private class Cell4 extends RowAdapter.Value2<Void> {

		public Cell4(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("mail");
			setDetails(office.getMail());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("mailto:" + office.getMail()));
			startActivity(intent);

		}

	}

}
