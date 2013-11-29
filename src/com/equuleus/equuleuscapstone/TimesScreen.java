package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;

public class TimesScreen extends Activity {

	public static String USERNAME;
	private Button addRestrictedTimeButton;
	private Button importButton;
	private Spinner ampmSpinnerStart;
	private Spinner hourSpinnerStart;
	private Spinner minutesSpinnerStart;
	private Spinner ampmSpinnerEnd;
	private Spinner hourSpinnerEnd;
	private Spinner minutesSpinnerEnd;
	private String ampmStart;
	private String ampmEnd;
	private int startHour;
	private int startMin;
	private int endHour;
	private int endMin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_times_screen);
		USERNAME = getIntent().getExtras().toString();
		
		addRestrictedTimeButton = (Button) findViewById(R.id.addTimeButton);
		importButton = (Button) findViewById(R.id.importButton);
		ampmSpinnerStart = (Spinner)findViewById(R.id.ampmSpinner);
		hourSpinnerStart = (Spinner)findViewById(R.id.hourSpinner);
		minutesSpinnerStart = (Spinner)findViewById(R.id.minutesSpinner);
		
		ampmSpinnerEnd = (Spinner)findViewById(R.id.ampmSpinner2);
		hourSpinnerEnd = (Spinner)findViewById(R.id.hourSpinner2);
		minutesSpinnerEnd = (Spinner)findViewById(R.id.minutesSpinner2);
		
		ampmSpinnerStart.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				ampmStart = ampmSpinnerStart.getSelectedItem().toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		ampmSpinnerEnd.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				ampmEnd = ampmSpinnerEnd.getSelectedItem().toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		minutesSpinnerStart.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				startMin = Integer.parseInt(minutesSpinnerStart.getSelectedItem().toString());
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		minutesSpinnerEnd.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				endMin = Integer.parseInt(minutesSpinnerEnd.getSelectedItem().toString());
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		hourSpinnerEnd.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				endHour = Integer.parseInt(hourSpinnerEnd.getSelectedItem().toString());
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		hourSpinnerStart.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				startHour = Integer.parseInt(hourSpinnerStart.getSelectedItem().toString());
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		addRestrictedTimeButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//call PHP script to add a restricted time to USERNAME
				
			}
			
		});
		
		

		importButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//import times from google accounts calender
				
			}
			
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.times_screen, menu);
		return true;
	}

}
