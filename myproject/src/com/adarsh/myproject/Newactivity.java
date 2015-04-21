package com.adarsh.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by imrokraft on 12/3/15.
 */
public class Newactivity extends SQLiteOpenHelper {
    public static final String DB_NAME = "mydb.db";
    public static final String TABLE_NAME = "mytb";

    public Newactivity(Context context) {
        super(context, DB_NAME, null, 2);        
    }
    
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, place TEXT, email TEXT)");
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    
    public long insertdata(String nm, String pl,String em) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME", nm);
        cv.put("PLACE", pl);
        cv.put("EMAIL", em);
        return db.insert(TABLE_NAME, null, cv);       
    }
    
    public Cursor viewdata() {
    	
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
//      db.close();
        return c;
    }
}
