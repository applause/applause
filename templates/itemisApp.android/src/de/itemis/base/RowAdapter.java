package de.itemis.base;

import android.app.ListActivity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import de.itemis.itemisapp.R;

public abstract class RowAdapter<T> extends AbstractRowAdapter {

	private final T item;
	private TextView textView;
	private TextView detailsView;
	private ImageView imageView;
	
	public RowAdapter(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	@Override
	protected void beforePopulateRowView() {
		super.beforePopulateRowView();
		textView = null;
		detailsView = null;
		imageView = null;
	}
	
	@Override
	protected void afterPopulateRowView() {
		applyVisibility(textView, getTextView());
		applyVisibility(detailsView, getDetailsView());
		applyVisibility(imageView, getImageView());
		super.afterPopulateRowView();
	}

	private void applyVisibility(View viewWithState, View viewToChange) {
		if(viewToChange == null)
			return;
		
		if(viewWithState != null)
			viewToChange.setVisibility(View.VISIBLE);
		else
			viewToChange.setVisibility(View.GONE);
	}

	public abstract int getViewResourceID();

	@Override
	public View createView(ListActivity activity) {
		return activity.getLayoutInflater().inflate(getViewResourceID(), null);
	}
	
	protected void setImageURL(String url) {
		Drawable drawable = Cache.getDrawable(getActivity(), url, "@drawable/loading_photo"); 
		getImageView().setImageDrawable(drawable);
	}
	
	protected ImageView getImageView() {
		if (imageView == null) {
			imageView = (ImageView) getRowView().findViewById(de.itemis.itemisapp.R.id.image);
			
		}
		return imageView;
	}
	
	public void setText(String text) {
		getTextView().setText(text);
	}
	
	public TextView getTextView() {
		if (textView == null) {
			textView = (TextView) getRowView().findViewById(de.itemis.itemisapp.R.id.text);
		}
		return textView;
	}
	
	public void setDetails(String details) {
		getDetailsView().setText(details);
	}
	
	protected TextView getDetailsView() {
		if (detailsView == null) {
			detailsView = (TextView) getRowView().findViewById(de.itemis.itemisapp.R.id.details);
		}
		return detailsView;
	}
	
	public void setQuery(String query) {
		// TODO: find a more generic way to determine dimensions of image
		int width = 120;
		int height = 120;
		if(query==null)
			query = "";
		String url = "http://maps.google.com/maps/api/staticmap?"
			+ "center=" + StringUtils.urlconform(query) + "&"
			+ "maptype=roadmap&sensor=false&"
			+ "size=" + width + "x" + height + "&zoom=15";
		setImageURL(url); 
	}

	public abstract static class Default<T> extends RowAdapter<T> {

		public Default(T item) {
			super(item);
		}

		@Override
		public int getViewResourceID() {
			return R.layout.default_item;
		}

		
	}
	
	public abstract static class DefaultWithDisclosure<T> extends Default<T> {

		public DefaultWithDisclosure(T item) {
			super(item);
		}
		
	}
	
	public abstract static class Subtitle<T> extends Default<T> {

		public Subtitle(T item) {
			super(item);
		}
		
	}

	public abstract static class Value2<T> extends RowAdapter<T> {

		public Value2(T item) {
			super(item);
		}

		@Override
		public int getViewResourceID() {
			return R.layout.value2_item;
		}
		
	}
	
	public abstract static class Map<T> extends RowAdapter<T> {
		public Map(T item) {
			super(item);
		}
		
		@Override
		public int getViewResourceID() {
			return R.layout.map_item;
		}	 
	}

	

}
