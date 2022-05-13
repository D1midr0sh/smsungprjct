package com.example.samsungproject;

import static android.content.ContentValues.TAG;
import static com.example.samsungproject.DataBase.FeedEntry.TABLE_NAME;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {
    protected OlympApp mMyApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        mMyApp = (OlympApp) this.getApplicationContext();

    }

    @SuppressLint("NonConstantResourceId")
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox h;
        String title;

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                title = DataBase.FeedEntry.COLUMN_NAME_ASTRO;
                break;
            case R.id.checkBox2:
                title = DataBase.FeedEntry.COLUMN_NAME_ENGLISH;
                break;
            case R.id.checkBox3:
                title = DataBase.FeedEntry.COLUMN_NAME_BIO;
                break;
            case R.id.checkBox4:
                title = DataBase.FeedEntry.COLUMN_NAME_GEO;
                break;
            case R.id.checkBox5:
                h = findViewById(R.id.checkBox5);
                title = DataBase.FeedEntry.COLUMN_NAME_INF;
                break;
            case R.id.checkBox6:
                h = findViewById(R.id.checkBox6);
                title = DataBase.FeedEntry.COLUMN_NAME_MHK;
                break;
            case R.id.checkBox7:
                h = findViewById(R.id.checkBox7);
                title = DataBase.FeedEntry.COLUMN_NAME_SPAN;
                break;
            case R.id.checkBox8:
                h = findViewById(R.id.checkBox8);
                title = DataBase.FeedEntry.COLUMN_NAME_HIS;
                break;
            case R.id.checkBox9:
                h = findViewById(R.id.checkBox9);
                title = DataBase.FeedEntry.COLUMN_NAME_ITAL;
                break;
            case R.id.checkBox10:
                h = findViewById(R.id.checkBox10);
                title = DataBase.FeedEntry.COLUMN_NAME_CHIN;
                break;
            case R.id.checkBox11:
                h = findViewById(R.id.checkBox11);
                title = DataBase.FeedEntry.COLUMN_NAME_LIT;
                break;
            case R.id.checkBox12:
                h = findViewById(R.id.checkBox12);
                title = DataBase.FeedEntry.COLUMN_NAME_MATH;
                break;
            case R.id.checkBox13:
                h = findViewById(R.id.checkBox13);
                title = DataBase.FeedEntry.COLUMN_NAME_DEU;
                break;
            case R.id.checkBox14:
                h = findViewById(R.id.checkBox14);
                title = DataBase.FeedEntry.COLUMN_NAME_OBCH;
                break;
            case R.id.checkBox15:
                h = findViewById(R.id.checkBox15);
                title = DataBase.FeedEntry.COLUMN_NAME_LOY;
                break;
            case R.id.checkBox16:
                h = findViewById(R.id.checkBox16);
                title = DataBase.FeedEntry.COLUMN_NAME_RUS;
                break;
            case R.id.checkBox17:
                h = findViewById(R.id.checkBox17);
                title = DataBase.FeedEntry.COLUMN_NAME_PHY;
                break;
            case R.id.checkBox18:
                h = findViewById(R.id.checkBox18);
                title = DataBase.FeedEntry.COLUMN_NAME_CHEM;
                break;
            case R.id.checkBox19:
                h = findViewById(R.id.checkBox19);
                title = DataBase.FeedEntry.COLUMN_NAME_ECO;
                break;
            case R.id.checkBox20:
                h = findViewById(R.id.checkBox20);
                title = DataBase.FeedEntry.COLUMN_NAME_ECON;
                break;
            default:
                title = " ";

        }
        Dbhelper dbhelper = new Dbhelper(getBaseContext());
        SQLiteDatabase db = dbhelper.getWritableDatabase(); //Getting writable db
        String yes = "YES"; //input data
        Log.d(TAG, "Data before update - "+dbhelper.getData(title));
        ContentValues values = new ContentValues();
        values.put(title, yes); //creating and fulling contentvalues variable with input data
        db.update(TABLE_NAME, values, title+"=?", new String[]{"NO"}); //changing NO value to value YES in a specific column
        Log.d(TAG, "Data after update - "+dbhelper.getData(title));
        db.close(); //closing db

    }
    
    public void onClickBack(View view){
        Intent intent = new Intent(ChooseActivity.this, MainActivity.class);
        startActivity(intent);
    }
    protected void onResume() {
        super.onResume();
        mMyApp.setCurrentActivity(this);
    }
    protected void onPause() {
        clearReferences();
        super.onPause();
    }
    protected void onDestroy() {
        clearReferences();
        super.onDestroy();
    }

    private void clearReferences(){
        Activity currActivity = mMyApp.getCurrentActivity();
        if (this.equals(currActivity))
            mMyApp.setCurrentActivity(null);
    }
}