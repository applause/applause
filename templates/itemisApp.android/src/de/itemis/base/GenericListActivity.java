package de.itemis.base;

import java.io.Serializable;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class GenericListActivity<T> extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> getItemsFromProvider() {
		Serializable serializable = getIntent().getSerializableExtra("provider");
		ListContentProvider<T> provider = (ListContentProvider<T>) serializable; 
		return provider.getAllItems();
	}

	@SuppressWarnings("unchecked")
	protected T getItemFromProvider() {
		Serializable serializable = getIntent().getSerializableExtra("provider");
		Serializable serializableExtra = serializable;
		ItemContentProvider<T> provider = (ItemContentProvider<T>) serializableExtra; 
		return provider.getItem();
	}

	protected void finishCreation() {
		
		getListView().setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Object item = getListView().getItemAtPosition(position);
				if (item instanceof AbstractRowAdapter) {
					AbstractRowAdapter adapter = (AbstractRowAdapter) item;
					adapter.handleClick();
				}
			}
		
		});
	}
}
