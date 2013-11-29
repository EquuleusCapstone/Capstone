package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainScreen extends Activity {
	public static String USERNAME;
	private Button noteButton;
	private Button createButton;
	private Button contactsButton;
	private Button timesButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		USERNAME = this.getIntent().getExtras().toString();
		
		noteButton = (Button) findViewById(R.id.notificationButton);
		createButton = (Button) findViewById(R.id.createButton);
		contactsButton = (Button) findViewById(R.id.contactsButton);
		timesButton = (Button) findViewById(R.id.timesButton);
		
		noteButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainScreen.this, NotificationScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
				
			}
			
		});
		
		createButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainScreen.this, NewEventScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
			}
			
		});

		contactsButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainScreen.this, ContactsScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
				
			}
			
		});

		timesButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainScreen.this, TimesScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
			}
			
		});


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}

}
