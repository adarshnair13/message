package com.adarsh.project2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class Secondactivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
	}

	public void ClickButton(View v) {
		Toast.makeText(getApplicationContext(),"submit", Toast.LENGTH_SHORT).show();
		
	}
}
