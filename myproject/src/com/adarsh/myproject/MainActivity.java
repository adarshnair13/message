package com.adarsh.myproject;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
Newactivity dbh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adarsh);

	}
	public void ClickButton(View v){
		EditText username,password;
		String user,pass;
		String use="";
		String pas="";	
		username=(EditText)findViewById(R.id.editText1);
		password=(EditText)findViewById(R.id.editText2);
		user=username.getText().toString();
		pass=password.getText().toString();
		dbh=new Newactivity(getApplicationContext());
		
		
		if(user.contains("@")&&user.contains(".")){
			startActivity(new Intent(this,Secondactivity.class));
			Toast.makeText(getApplicationContext(), "please inserted values", Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT).show();

			
		}
	}

	public void PressButton(View v){
		Toast.makeText(getApplicationContext(),"Connecting",Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,Thirdactivity.class));
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}




	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),Fourthactivity.class));
			break;		
		case R.id.action_settings1:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();	
			startActivity(new Intent(getApplicationContext(),Fifthactivity.class));
			break;
		case R.id.action_settings2:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),Sixthactivity.class));
			break;
		case R.id.action_settings3:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
			finish();
			break;	
		case R.id.action_settings4:
			Toast.makeText(getApplicationContext(), "Please Wait", Toast.LENGTH_SHORT).show();
			break;	
		case R.id.action_settings5:
			Toast.makeText(getApplicationContext(), "Refreshing", Toast.LENGTH_SHORT).show();
			break;	


		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}


}