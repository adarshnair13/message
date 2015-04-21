package com.adarsh.lifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {


		String msg = "Android : ";

		/** Called when the activity is first created. */
		@Override
		public void onCreate(Bundle savedInstanceState1) {
			super.onCreate(savedInstanceState1);
			setContentView(R.layout.activity_main);
			Toast.makeText(getApplicationContext(), "oncreate", Toast.LENGTH_SHORT).show();
			Log.d(msg, "The onCreate() event");
		}

		/** Called when the activity is about to become visible. */
		@Override
		protected void onStart() {
			super.onStart();
			Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

			Log.d(msg, "The onStart() event");
		}

		/** Called when the activity has become visible. */
		@Override
		protected void onResume() {
			super.onResume();
			Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();

			Log.d(msg, "The onResume() event");
		}

		/** Called when another activity is taking focus. */
		@Override
		protected void onPause() {
			super.onPause();
			Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();

			Log.d(msg, "The onPause() event");
		}
		@Override
		protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();

		}

		/** Called when the activity is no longer visible. */
		@Override
		protected void onStop() {
			super.onStop();
			Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();

			Log.d(msg, "The onStop() event");
		}

		/** Called just before the activity is destroyed. */
		@Override
		public void onDestroy() {
			super.onDestroy();
			Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();

			Log.d(msg, "The onDestroy() event");
		}
	
}
