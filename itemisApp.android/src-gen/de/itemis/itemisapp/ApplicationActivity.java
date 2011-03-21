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
		tab1.setIndicator("News", getResources().getDrawable(R.drawable.chat));

		Intent tab1Intent = new Intent(this, BlogList.class);
		BlogpostsProvider tab1IntentProvider = ProviderFactory
				.getBlogpostsProvider();
		tab1Intent.putExtra("provider", tab1IntentProvider);
		tab1.setContent(tab1Intent);

		tabHost.addTab(tab1);

		TabSpec tab2 = tabHost.newTabSpec("tab2");
		// , getResources().getDrawable(R.drawable.microphone)
		tab2.setIndicator("Tue", getResources()
				.getDrawable(R.drawable.calendar));

		Intent tab2Intent = new Intent(this, SessionList.class);
		SessionsByDayProvider tab2IntentProvider = ProviderFactory
				.getSessionsByDayProvider("2011-03-22");
		tab2Intent.putExtra("provider", tab2IntentProvider);
		tab2.setContent(tab2Intent);

		tabHost.addTab(tab2);

		TabSpec tab3 = tabHost.newTabSpec("tab3");
		// , getResources().getDrawable(R.drawable.microphone)
		tab3.setIndicator("Wed", getResources()
				.getDrawable(R.drawable.calendar));

		Intent tab3Intent = new Intent(this, SessionList.class);
		SessionsByDayProvider tab3IntentProvider = ProviderFactory
				.getSessionsByDayProvider("2011-03-23");
		tab3Intent.putExtra("provider", tab3IntentProvider);
		tab3.setContent(tab3Intent);

		tabHost.addTab(tab3);

		TabSpec tab4 = tabHost.newTabSpec("tab4");
		// , getResources().getDrawable(R.drawable.microphone)
		tab4.setIndicator("Thu", getResources()
				.getDrawable(R.drawable.calendar));

		Intent tab4Intent = new Intent(this, SessionList.class);
		SessionsByDayProvider tab4IntentProvider = ProviderFactory
				.getSessionsByDayProvider("2011-03-24");
		tab4Intent.putExtra("provider", tab4IntentProvider);
		tab4.setContent(tab4Intent);

		tabHost.addTab(tab4);

		TabSpec tab5 = tabHost.newTabSpec("tab5");
		// , getResources().getDrawable(R.drawable.microphone)
		tab5.setIndicator("Speakers",
				getResources().getDrawable(R.drawable.person));

		Intent tab5Intent = new Intent(this, SpeakersList.class);
		AllSpeakersProvider tab5IntentProvider = ProviderFactory
				.getAllSpeakersProvider();
		tab5Intent.putExtra("provider", tab5IntentProvider);
		tab5.setContent(tab5Intent);

		tabHost.addTab(tab5);

	}

}
