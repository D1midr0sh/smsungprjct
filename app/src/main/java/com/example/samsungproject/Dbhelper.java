package com.example.samsungproject;

import static com.example.samsungproject.DataBase.FeedEntry.TABLE_NAME;
import static com.example.samsungproject.DataBase.SQL_CREATE_ENTRIES;
import static com.example.samsungproject.DataBase.SQL_DELETE_ENTRIES;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Olymp.db";

    public Dbhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void del(SQLiteDatabase db){
        db.execSQL(SQL_DELETE_ENTRIES);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    @SuppressLint("Range")
    public String getData(String name){
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        Cursor cursor      = db.rawQuery(selectQuery, null);
        String data = null;

        if (cursor.moveToFirst()) {
            do {
                data = cursor.getString(cursor.getColumnIndex(name));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return data;
    }
}
