package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NewEventScreen extends Activity {

	public static String USERNAME;
	private EditText addContactField;
	private EditText durationField;
	private Button confirmButton;
	private EditText newEventText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_event_screen);
		
		USERNAME = getIntent().getExtras().toString();
		addContactField = (EditText) findViewById(R.id.addContactField);
		confirmButton = (Button) findViewById(R.id.confirmButton);
		newEventText = (EditText) findViewById(R.id.eventNameText);
		durationField = (EditText) findViewById(R.id.durationField);
		
		confirmButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				int duration = -1;
				boolean error = false;
				if(!durationField.getText().toString().equals(""))
					duration = Integer.parseInt(durationField.getText().toString());
				String eventName = newEventText.getText().toString();
				String contactName = addContactField.getText().toString();
				
				if(eventName.equals("") || contactName.equals(""))
					error = true;
				
				if(duration < 0)
					error = true;
				//Call PHP script to add a new meeting with the 2 contacts 
				//and add a new unavailable time
				//to both contacts with the meeting duration
				if(!error){
				Intent intent = new Intent(NewEventScreen.this, MainScreen.class);
				intent.putExtra(USERNAME, USERNAME);
				startActivity(intent);
				}
			}
			
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_event_screen, menu);
		return true;
	}

}
