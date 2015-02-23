package com.adarsh.rad;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class secondactivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void ClickButton(View v) {
		Toast.makeText(getApplicationContext(), "Submit", Toast.LENGTH_SHORT).show();
	}
}
