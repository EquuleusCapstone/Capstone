package com.equuleus.equuleuscapstone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends Activity {
	public final static String USERNAME = "com.equuleuscapstone.USERNAME";
	private EditText usernameText;
	private EditText passwordText;
	private Button loginButton;
	private TextView errorText;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		usernameText = (EditText) findViewById(R.id.emailText);
		passwordText = (EditText) findViewById(R.id.passwordText);
		errorText = (TextView) findViewById(R.id.errorText);
		loginButton = (Button) findViewById(R.id.loginButton);
		
		loginButton.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				boolean error = true;
				String userName = usernameText.getText().toString();
				String password = passwordText.getText().toString();
				if(userName.equals("test1"))
				{
					if(password.equals("password"))
						error = false;
				}
				else if(userName.equals("test2"))
				{
					if(password.equals("password"))
						error = false;
				}
				
				if(error)
				{
					errorText.setText("Invalid Login");
				}
				else					{
					Intent intent = new Intent(Login.this, MainScreen.class);
					intent.putExtra(USERNAME, userName);
					startActivity(intent);
				}
					
				
			}
			
		});
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	

}
