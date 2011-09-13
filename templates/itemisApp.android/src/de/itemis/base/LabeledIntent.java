package de.itemis.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class LabeledIntent extends Intent {
	

	public LabeledIntent() {
		super();
	}

	public LabeledIntent(Context packageContext, Class<?> cls) {
		super(packageContext, cls);
	}

	public LabeledIntent(Intent o) {
		super(o);
	}

	public LabeledIntent(String action, Uri uri, Context packageContext,
			Class<?> cls) {
		super(action, uri, packageContext, cls);
	}

	public LabeledIntent(String action, Uri uri) {
		super(action, uri);
	}

	public LabeledIntent(String action) {
		super(action);
	}

	@Override
	public String toString() {
		String label = getStringExtra("label");
		if (label != null) {
			return label;
		}
		else {
			return super.toString();
		}
	}

}
