package com.adarsh.newproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
public void ClickButton(View v){
        Toast.makeText (getApplicationContext(),"Submit",Toast.LENGTH_SHORT).show();
    startActivity(new Intent(this,SecondActivity.class));

}


}
