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

public class PersonDetails extends DetailsActivity<Contact> {

	Contact person;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Person");

		person = getItemFromProvider();

		setHeaderTitle(person.getName());
		setHeaderDetails(person.getBio());
		setHeaderImageURL(person.getPictureurl());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		rowAdapters.add(new Cell1(null));

		rowAdapters.add(new Cell2(null));

		Iterable<WebAddress> items3 = person.getWebaddresses();
		if (items3 != null)
			for (WebAddress i : items3)
				rowAdapters.add(new Cell3(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Value2<Void> {

		public Cell1(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("mail");
			setDetails(person.getMail());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("mailto:" + person.getMail()));
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Value2<Void> {

		public Cell2(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("phone");
			setDetails(person.getPhone());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("tel:" + person.getPhone()));
			startActivity(intent);

		}

	}

	private class Cell3 extends RowAdapter.Default<WebAddress> {

		public Cell3(WebAddress item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			WebAddress w = getItem();
			setText(w.getTitle());

		}

		@Override
		public void handleClick() {
			WebAddress w = getItem();

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW, Uri.parse(w
					.getUrl()));
			startActivity(intent);

		}

	}

}
