package com.adarsh.sample1;

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

	public void ClickButton(View v) {
		Toast.makeText(getApplicationContext(), "SUBMIT", Toast.LENGTH_SHORT).show();
		Thread th =new Thread(new Runnable() {

			@Override
			public void run() {
				int j=0;
				for(;;)
					System.out.println("Running thread j"+(j++));
			}
		});th.start();
	}
	public void pushButton(View v) {
		Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
		
		Thread thh =new Thread( new Runnable() {
			public void run() {				
						
						int i=0;
						for(;;)
							System.out.println("Running thread i"+(i++));						
			}
				});
				
		});thh.start();
}
}
