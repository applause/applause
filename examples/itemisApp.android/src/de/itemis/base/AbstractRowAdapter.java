package de.itemis.base;

import android.app.ListActivity;
import android.view.View;

public abstract class AbstractRowAdapter {
	private View row;
	private ListActivity activity;
	
	public abstract void populateRowView();
	public abstract View createView(ListActivity activity);
	public abstract void handleClick();

	public View getRowView() {
		return row;
	}

	public ListActivity getActivity() {
		return activity;
	}
	
	public void setRowViewAndActivty(View rowView, ListActivity listActivity) {
		row = rowView;
		activity = listActivity;
	}
	
	public void populateRowView(View rowView, ListActivity listActivity) {
		setRowViewAndActivty(rowView, listActivity);
		beforePopulateRowView();
		populateRowView();
		afterPopulateRowView();
		setRowViewAndActivty(null, null);
	}
	
	protected void afterPopulateRowView() {
	}
	
	protected void beforePopulateRowView() {
	}

}