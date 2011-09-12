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
		tab1.setIndicator("Commits",
				getResources().getDrawable(R.drawable.calendar));

		Intent tab1Intent = new Intent(this, CommitList.class);
		allCommitsProvider tab1IntentProvider = ProviderFactory
				.getAllCommitsProvider();
		tab1Intent.putExtra("provider", tab1IntentProvider);
		tab1.setContent(tab1Intent);

		tabHost.addTab(tab1);

		TabSpec tab2 = tabHost.newTabSpec("tab2");
		// , getResources().getDrawable(R.drawable.microphone)
		tab2.setIndicator("Peter", getResources()
				.getDrawable(R.drawable.person));

		Intent tab2Intent = new Intent(this, UserDetails.class);
		userDataProvider tab2IntentProvider = ProviderFactory
				.getUserDataProvider("peterfriese");
		tab2Intent.putExtra("provider", tab2IntentProvider);
		tab2.setContent(tab2Intent);

		tabHost.addTab(tab2);

		TabSpec tab3 = tabHost.newTabSpec("tab3");
		// , getResources().getDrawable(R.drawable.microphone)
		tab3.setIndicator("Heiko", getResources()
				.getDrawable(R.drawable.person));

		Intent tab3Intent = new Intent(this, UserDetails.class);
		userDataProvider tab3IntentProvider = ProviderFactory
				.getUserDataProvider("hbehrens");
		tab3Intent.putExtra("provider", tab3IntentProvider);
		tab3.setContent(tab3Intent);

		tabHost.addTab(tab3);

	}

}
