package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ContactsScreen extends Activity {

	public static String USERNAME;
	private Button notificationButton;
	private Button newContactButton;
	private EditText newContactEmail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts_screen);
		USERNAME = getIntent().getExtras().toString();
		notificationButton = (Button) findViewById(R.id.notificationButton);
		newContactButton = (Button) findViewById(R.id.newContactButton);
		newContactEmail = (EditText) findViewById(R.id.newContactEmail);
		
		notificationButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ContactsScreen.this, NotificationScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
				
			}
			
		});
		
		newContactButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//call PHP script to add contact to USERNAMES contact
				
			}
			
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contacts_screen, menu);
		return true;
	}

}
