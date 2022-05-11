package com.example.samsungproject;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button astro;
    Button english;
    Button bio, geogr, inf, mhk, spanish, his, ital, chin, lit, math, deu, obch, loyal, rus, phys, chem;
    Button eco, econom;
    BottomNavigationView bnv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Dbhelper dbhelper = new Dbhelper(getBaseContext());
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
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
            Toast.makeText(this, "First time here?", Toast.LENGTH_SHORT).show();


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

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }



}
