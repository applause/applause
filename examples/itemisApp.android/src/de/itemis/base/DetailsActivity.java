package de.itemis.base;

import java.io.Serializable;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import de.itemis.itemisapp.R;

public class DetailsActivity<T> extends GenericListActivity<T> {
	
	private View detailsView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		detailsView = getLayoutInflater().inflate(R.layout.details_header, null);
		detailsView.findViewById(R.id.photo).setVisibility(View.GONE);
		getListView().addHeaderView(detailsView);
		finishCreation();
	}
	
	@SuppressWarnings("unchecked")
	protected T getItemFromProvider() {
		Serializable serializable = getIntent().getSerializableExtra("provider");
		Serializable serializableExtra = serializable;
		ItemContentProvider<T> provider = (ItemContentProvider<T>) serializableExtra; 
		return provider.getItem();
	}
	
	protected void setHeaderTitle(String title) {
		TextView view = (TextView) detailsView.findViewById(R.id.headlineText);
		view.setText(title);
	}
	
	protected void setHeaderDetails(String details) {
		TextView view = (TextView) detailsView.findViewById(R.id.bodyText);
		view.setText(details);
	}

	protected void setHeaderImageURL(String url) {
		ImageView view = (ImageView) detailsView.findViewById(R.id.photo);
		view.setVisibility(View.VISIBLE);
		Drawable drawable = Cache.getDrawable(this, url, "@drawable/loading_photo"); 
		view.setImageDrawable(drawable);
	}
}
