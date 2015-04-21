package com.adarsh.sp;



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

	public void buttonclick(View v)
	{
		Toast.makeText(getApplicationContext(), "Submit", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,SecondActivity.class));
	}
	public void clicked(View v)
	{
		Toast.makeText(getApplicationContext(), "Submit", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,ThirdActivity.class));
	}
}
