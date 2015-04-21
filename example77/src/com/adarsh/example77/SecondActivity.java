package com.adarsh.example77;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pagenext);
	}

	public void GoNext(View v) {
		Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(SecondActivity.this,ThirdActivity.class));


	}
}
