package de.itemis.base;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class IntentExecutor implements OnItemClickListener {
	private final ListView listView;
	private final Context context;

	public IntentExecutor(Context context, ListView listView) {
		this.context = context;
		this.listView = listView;
	}

	public void onItemClick(AdapterView<?> parent, View view,
			int position, long id) {
		Object itemAtPosition = listView.getItemAtPosition(position);
		if (itemAtPosition instanceof Intent) {
			Intent intent = (Intent) itemAtPosition;
			context.startActivity(intent);
		}
	}
}