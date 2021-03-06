package arayadapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.adarsh.arayadapters.R;

public class UserAdapter extends ArrayAdapter<UserModel> {

    UserModel[] usersList;
    Context myContext;

    public UserAdapter(Context context, UserModel[] usersList) {
        super(context, R.layout.list_item, usersList);
        this.usersList=usersList;
        this.myContext=context;
    }

    // It gets a View that displays in the drop down popup the data at the specified position
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    // It gets a View that displays the data at the specified position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);

}
    private View getCustomView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater mLayoutInflater = LayoutInflater.from(myContext);
            convertView = mLayoutInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView nameTextView = (TextView) convertView.findViewById(R.id.txtview_name);
        TextView emailTextView = (TextView) convertView.findViewById(R.id.txtview_email);