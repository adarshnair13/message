package com.adarsh.v8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void ButtonClick(View v) {
		Toast.makeText(getApplicationContext(), "submit",Toast.LENGTH_SHORT).show();	
		startActivity(new Intent(this,SecondMainActivity.class));

	}
}
