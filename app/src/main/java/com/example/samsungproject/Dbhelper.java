package com.example.samsungproject;

import static com.example.samsungproject.DataBase.FeedEntry.TABLE_NAME;
import static com.example.samsungproject.DataBase.SQL_CREATE_ENTRIES;
import static com.example.samsungproject.DataBase.SQL_DELETE_ENTRIES;

import android.annotation.SuppressLint;
import android.content.ContentValues;
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
    public void firstFill(SQLiteDatabase db){
        ContentValues values = new ContentValues();
        String not = "NO";
        values.put(DataBase.FeedEntry.COLUMN_NAME_ASTRO, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_ENGLISH, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_BIO, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_GEO, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_INF, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_MHK, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_SPAN, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_HIS, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_ITAL, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_CHIN, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_LIT, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_MATH, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_DEU, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_OBCH, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_LOY, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_RUS, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_PHY, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_CHEM, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_ECO, not);
        values.put(DataBase.FeedEntry.COLUMN_NAME_ECON, not);

        long newRowId = db.insert(DataBase.FeedEntry.TABLE_NAME, null, values);
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
