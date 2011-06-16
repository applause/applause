package de.itemis.base;

import java.util.List;

import de.itemis.itemisapp.R;
import android.app.ListActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class GenericItemAdapter extends ArrayAdapter<AbstractRowAdapter>{

	private final ListActivity listActivity;

	@SuppressWarnings("unchecked")
	public GenericItemAdapter(ListActivity listActivity, List<? extends AbstractRowAdapter> items) {
		// can given layout and widget id be omitted? won't be used anyway
		super(listActivity, R.layout.list_item_image, R.id.text, (List<AbstractRowAdapter>) items);
		this.listActivity = listActivity;   
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		AbstractRowAdapter item = getItem(position);
		if (convertView == null) {
			convertView = item.createView(listActivity);
			convertView.setTag(item);
		}
		item.populateRowView(convertView, listActivity);
		return convertView;
	}
		
}
