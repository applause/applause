package de.itemis.itemisapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class ApplicationActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final TabHost tabHost = getTabHost();

		TabSpec tab1 = tabHost.newTabSpec("tab1");
		// , getResources().getDrawable(R.drawable.microphone)
		tab1.setIndicator("News",
				getResources().getDrawable(R.drawable.calendar));

		Intent tab1Intent = new Intent(this, EventList.class);
		CurrentTimelineProvider tab1IntentProvider = ProviderFactory
				.getCurrentTimelineProvider();
		tab1Intent.putExtra("provider", tab1IntentProvider);
		tab1.setContent(tab1Intent);

		tabHost.addTab(tab1);

		TabSpec tab2 = tabHost.newTabSpec("tab2");
		// , getResources().getDrawable(R.drawable.microphone)
		tab2.setIndicator("Blog", getResources().getDrawable(R.drawable.chat));

		Intent tab2Intent = new Intent(this, BlogList.class);
		BlogpostsProvider tab2IntentProvider = ProviderFactory
				.getBlogpostsProvider();
		tab2Intent.putExtra("provider", tab2IntentProvider);
		tab2.setContent(tab2Intent);

		tabHost.addTab(tab2);

		TabSpec tab3 = tabHost.newTabSpec("tab3");
		// , getResources().getDrawable(R.drawable.microphone)
		tab3.setIndicator("itemis",
				getResources().getDrawable(R.drawable.itemis));

		Intent tab3Intent = new Intent(this, OfficeList.class);
		CompanyDescriptionProvider tab3IntentProvider = ProviderFactory
				.getCompanyDescriptionProvider();
		tab3Intent.putExtra("provider", tab3IntentProvider);
		tab3.setContent(tab3Intent);

		tabHost.addTab(tab3);

		TabSpec tab4 = tabHost.newTabSpec("tab4");
		// , getResources().getDrawable(R.drawable.microphone)
		tab4.setIndicator("Carreer",
				getResources().getDrawable(R.drawable.trophy));

		Intent tab4Intent = new Intent(this, CareerView.class);
		CareerDataProvider tab4IntentProvider = ProviderFactory
				.getCareerDataProvider();
		tab4Intent.putExtra("provider", tab4IntentProvider);
		tab4.setContent(tab4Intent);

		tabHost.addTab(tab4);

	}

}
