package com.example.listvw1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv=(ListView)findViewById(R.id.listView1);
		Useradapter ua=new Useradapter(getApplicationContext(),createDummyUserModels());
		lv.setAdapter(ua);
		
		
		
		
	}
public Usermodel[] createDummyUserModels() {
	String Name[]={"abi","binu","cini","deepa23","deepa4","deepa5","deepa7","deepa8","deepa87","deepa66"};
	String Email[]={"abi@gmail.com","binu@gmail.com","cini@gmail.com","deepa66@gmail.com","deepa44@gmail.com","deepa567@gmail.com","deepa87@gmail.com","deepa654@gmail.com","deepa543@gmail.com","deepa44@gmail.com"};
	
	Usermodel[] userlist=new Usermodel[Name.length];
	for (int i = 0; i < Email.length; i++) {
		userlist[i]=new Usermodel(Name[i],Email[i]);
}
	return userlist;
	
}
}
