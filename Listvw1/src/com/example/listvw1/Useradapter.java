package com.example.listvw1;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Useradapter extends ArrayAdapter<Usermodel>{
	Usermodel[] userlist;
	Context mycontext;


	public Useradapter(Context context,Usermodel[] userlist)
	{
		super(context,R.layout.activity_main,userlist);
		this.userlist=userlist;
		this.mycontext=context;
	}

	public View getdropView(int position,View convertView,ViewGroup parent) {
		return getCustomView(position,convertView,parent);
	}
	public View getView(int position,View convertView,ViewGroup parent) {
		return getCustomView(position,convertView,parent);
	}
	private View getCustomView(final int position,View convertView,ViewGroup parent) {
		if(convertView==null)
		{
			LayoutInflater li=LayoutInflater.from(mycontext);
			convertView=li.inflate(R.layout.act_main,parent,false);
		}
		TextView NameTextView = (TextView) convertView.findViewById(R.id.textView1);
		TextView EmailTextView = (TextView) convertView.findViewById(R.id.textView2);
		ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);

		NameTextView.setText(userlist[position].getName());
		EmailTextView.setText(userlist[position].getEmail());


		convertView.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getContext(), "Clicked"+(position+1), Toast.LENGTH_SHORT).show(); 
			}
		});
		return convertView;
	}
}





