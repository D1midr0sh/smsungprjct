package com.example.samsungproject;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected OlympApp mMyApp;
    public String[] columns = {"astro", "english", "bio", "geo", "inf", "mhk", "span", "his", "ital", "chin", "lit", "math", "deu", "obch", "loy", "rus", "phy", "chem", "eco", "econ"};
    Button astro;
    Button english;
    Button bio, geogr, inf, mhk, spanish, his, ital, chin, lit, math, deu, obch, loyal, rus, phys, chem;
    Button eco, econom;
    BottomNavigationView bnv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMyApp = (OlympApp) this.getApplicationContext();
        Dbhelper dbhelper = new Dbhelper(getBaseContext());
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);
        Date currentTime = Calendar.getInstance().getTime();
        int time = currentTime.getHours();
        int min = currentTime.getMinutes();
        Log.d(TAG, "Time: "+String.valueOf(time)+":"+String.valueOf(min));

        if (isFirstRun) {
            dbhelper.firstFill(db);
            Intent i = new Intent(MainActivity.this, StartActivity.class);
            startActivity(i);


        }


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();







        setContentView(R.layout.activity_main);
        bnv = findViewById(R.id.navmenu);
        bnv.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @SuppressLint("NonConstantResourceId")
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Intent intent;
                        switch (item.getItemId()) {
                            case R.id.nav_tochoose:
                                intent = new Intent(MainActivity.this, ChooseActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.alarms:
                                intent = new Intent(MainActivity.this, AlarmActivity.class);
                                startActivity(intent);
                                break;

                        }
                        return false;
                    }
                });



        astro = findViewById(R.id.button2);
        astro.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_ASTRO).equals("YES"))
            astro.setTextColor(getResources().getColor(R.color.enable));

        english = findViewById(R.id.button3);
        english.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_ENGLISH).equals("YES"))
            english.setTextColor(getResources().getColor(R.color.enable));

        bio = findViewById(R.id.button4);
        bio.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_BIO).equals("YES"))
            bio.setTextColor(getResources().getColor(R.color.enable));
        geogr = findViewById(R.id.button5);
        geogr.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_GEO).equals("YES"))
            geogr.setTextColor(getResources().getColor(R.color.enable));
        inf = findViewById(R.id.button6);
        inf.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_INF).equals("YES"))
            inf.setTextColor(getResources().getColor(R.color.enable));
        mhk = findViewById(R.id.button7);
        mhk.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_MHK).equals("YES"))
            mhk.setTextColor(getResources().getColor(R.color.enable));
        spanish = findViewById(R.id.button8);
        spanish.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_SPAN).equals("YES"))
            spanish.setTextColor(getResources().getColor(R.color.enable));
        his = findViewById(R.id.button9);
        his.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_HIS).equals("YES"))
            his.setTextColor(getResources().getColor(R.color.enable));
        ital = findViewById(R.id.button10);
        ital.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_ITAL).equals("YES"))
            ital.setTextColor(getResources().getColor(R.color.enable));
        chin = findViewById(R.id.button11);
        chin.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_CHIN).equals("YES"))
            chin.setTextColor(getResources().getColor(R.color.enable));
        lit = findViewById(R.id.button12);
        lit.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_LIT).equals("YES"))
            lit.setTextColor(getResources().getColor(R.color.enable));
        math = findViewById(R.id.button13);
        math.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_MATH).equals("YES"))
            math.setTextColor(getResources().getColor(R.color.enable));
        deu = findViewById(R.id.button14);
        deu.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_DEU).equals("YES"))
            deu.setTextColor(getResources().getColor(R.color.enable));
        obch = findViewById(R.id.button15);
        obch.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_OBCH).equals("YES"))
            obch.setTextColor(getResources().getColor(R.color.enable));
        loyal = findViewById(R.id.button16);
        loyal.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_LOY).equals("YES"))
            loyal.setTextColor(getResources().getColor(R.color.enable));
        rus = findViewById(R.id.button17);
        rus.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_RUS).equals("YES"))
            rus.setTextColor(getResources().getColor(R.color.enable));
        phys = findViewById(R.id.button18);
        phys.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_PHY).equals("YES"))
            phys.setTextColor(getResources().getColor(R.color.enable));
        chem = findViewById(R.id.button19);
        chem.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_CHEM).equals("YES"))
            chem.setTextColor(getResources().getColor(R.color.enable));
        eco = findViewById(R.id.button20);
        eco.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_ECO).equals("YES"))
            eco.setTextColor(getResources().getColor(R.color.enable));
        econom = findViewById(R.id.button21);
        econom.setOnClickListener(this);
        if(dbhelper.getData(DataBase.FeedEntry.COLUMN_NAME_ECON).equals("YES"))
            econom.setTextColor(getResources().getColor(R.color.enable));



    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent i;
        String title;
        Button j = findViewById(v.getId());
        title = j.getText().toString();
        i = new Intent(MainActivity.this, AstroActivity.class);
        i.putExtra("title", title);
        startActivity(i);

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

    public void notifyAtTime(Context c) {
        Intent myIntent = new Intent(c, Notification.class);
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getService(c, 0, myIntent, PendingIntent.FLAG_IMMUTABLE);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 16);
        calendar.set(Calendar.MINUTE, 04);
        calendar.set(Calendar.SECOND, 00);

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        Toast.makeText(this, "Notif should be sent", Toast.LENGTH_SHORT).show();
    }



}
