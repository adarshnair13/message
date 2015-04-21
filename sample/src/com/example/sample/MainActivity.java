package com.example.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void ClickButton(View v) {		
		Thread Th=new Thread(new Runnable() {			
			@Override
			public void run() {
//								int j=0;
//								for(;;)
//								{
//									System.out.println("Running thread j"+(j++));
//				
//								}	
				runOnUiThread(new Runnable() {
					public void run() {
						Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
					}
				});
			}

		});Th.start();
	}
	public void PressButton(View v) {
		//		int j=0;
		//		for(;;)
		//		{
		//			System.out.println("Running thread j"+(j++));
		//
		//		}	
		Thread Thh=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++){	


					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					final int j=i;				
					runOnUiThread(new Runnable() {					
						@Override
						public void run() {
							Toast.makeText(getApplicationContext(), "SUBMIT", Toast.LENGTH_SHORT).show();						
							ProgressBar bt=(ProgressBar)findViewById(R.id.progressBar1);
							bt.setProgress(j*10);
						}
					});	

				}
			}
		});Thh.start();
	}
}

