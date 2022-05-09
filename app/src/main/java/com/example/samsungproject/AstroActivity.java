package com.example.samsungproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AstroActivity extends AppCompatActivity implements View.OnClickListener {
    Button olbutton;
    Button srbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astro);
        TextView title = findViewById(R.id.textView2);
        TextView part = findViewById(R.id.part);
        String message = getIntent().getStringExtra("title");
        title.setText(message);
        
        olbutton = findViewById(R.id.olbutton);
        olbutton.setOnClickListener(this);
        srbutton = findViewById(R.id.ecr);
        srbutton.setOnClickListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent h;
        TextView title = findViewById(R.id.textView2);
        switch (v.getId()){
            case R.id.olbutton:
                if (title.getText().toString().equals("Английский язык")) {
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/engl/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Астрономия")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/astr/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Биология")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/biol/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("География")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/geog/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Информатика")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.olympiads.ru/moscow/index.shtml"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Искусство(МХК)")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/amxk/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Испанский язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/span/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Итальянский язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/ital/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("История")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/hist/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Китайский язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/chin/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Литература")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/litr/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Математика")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://olympiads.mccme.ru/vmo/"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Немецкий язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/germ/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Обществознание")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/soci/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Право")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/law/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Русский язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/russ/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Физика")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/phys/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Французкий язык")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/fren/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Химия")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/chem/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Экология")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/ekol/2021_2022"));
                    startActivity(h);
                    break;
                }
                if (title.getText().toString().equals("Экономика")){
                    h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vos.olimpiada.ru/econ/2021_2022"));
                    startActivity(h);
                    break;
                }




            case R.id.ecr:
                h = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.olimpiada.ru/"));
                startActivity(h);
                break;
            default:
                Toast.makeText(this, "ERROR 404: Page not found.", Toast.LENGTH_SHORT).show();

        }
    }
}