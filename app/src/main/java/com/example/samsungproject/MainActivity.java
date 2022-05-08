package com.example.samsungproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
        setContentView(R.layout.activity_main);
        bnv = findViewById(R.id.navmenu);



        astro = findViewById(R.id.button2);
        astro.setOnClickListener(this);

        english = findViewById(R.id.button3);
        english.setOnClickListener(this);

        bio = findViewById(R.id.button4);
        bio.setOnClickListener(this);

        geogr = findViewById(R.id.button5);
        geogr.setOnClickListener(this);
        inf = findViewById(R.id.button6);
        inf.setOnClickListener(this);
        mhk = findViewById(R.id.button7);
        mhk.setOnClickListener(this);
        spanish = findViewById(R.id.button8);
        spanish.setOnClickListener(this);
        his = findViewById(R.id.button9);
        his.setOnClickListener(this);
        ital = findViewById(R.id.button10);
        ital.setOnClickListener(this);
        chin = findViewById(R.id.button11);
        chin.setOnClickListener(this);
        lit = findViewById(R.id.button12);
        lit.setOnClickListener(this);
        math = findViewById(R.id.button13);
        math.setOnClickListener(this);
        deu = findViewById(R.id.button14);
        deu.setOnClickListener(this);
        obch = findViewById(R.id.button15);
        obch.setOnClickListener(this);
        loyal = findViewById(R.id.button16);
        loyal.setOnClickListener(this);
        rus = findViewById(R.id.button17);
        rus.setOnClickListener(this);
        phys = findViewById(R.id.button18);
        phys.setOnClickListener(this);
        chem = findViewById(R.id.button19);
        chem.setOnClickListener(this);
        eco = findViewById(R.id.button20);
        eco.setOnClickListener(this);
        econom = findViewById(R.id.button21);
        econom.setOnClickListener(this);


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
}
