package com.adarsh.program1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void ClickButton(View v) {
		
		Thread th =new Thread(new Runnable() {					
			@Override
			public void run() {	
				runOnUiThread(new Runnable() {					
					@Override
					public void run() {
						Toast.makeText(getApplicationContext(), "SUBMIT", Toast.LENGTH_SHORT).show();						
					}
				});
								}
		});
		th.start();	
		TextView ss =(TextView)findViewById(R.id.textView1);
		ss.setText("yes");
		
	}
	public void PressButton(View v) {
		int j=0;
		for(;;)
		{
	System.out.println("running thread j"+(j++));	
	}
		
	}
}