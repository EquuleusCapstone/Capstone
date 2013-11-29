package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NotificationScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notification_screen, menu);
		return true;
	}

}
