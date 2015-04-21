package com.adarsh.arayadapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView myListView = (ListView) findViewById(R.id.my_main_listview);


    UserAdapter myUserAdapter=new UserAdapter(getApplicationContext(), createDummyUserModels());


    myListView.setAdapter(myUserAdapter);

}
    public UserModel[] createDummyUserModels(){

        String[] names={"anand","senthil","vipin","praveen","kiran","anoop","vipin","praveen","kiran","anoop"};
        String[] emails={"anandab@gmail.com","senthiljs@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com"};
    }