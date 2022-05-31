package com.example.samsungproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SubjectActivity extends AppCompatActivity implements View.OnClickListener {
    protected OlympApp mMyApp;
    Button olbutton;
    Button srbutton;
    DatabaseReference mData;
    TextView titlee;

    public String TAG = "MyApp";
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMyApp = (OlympApp) this.getApplicationContext();
        setContentView(R.layout.activity_astro);
        mData = FirebaseDatabase.getInstance().getReference();
        titlee = findViewById(R.id.textView2);
        TextView part = findViewById(R.id.part);
        String message = getIntent().getStringExtra("title");
        titlee.setText(message);
        getdata();
        String title;
        switch(message) {
            case "Астрономия":
                title = DataBase.FeedEntry.COLUMN_NAME_ASTRO;
                break;
            case "Английский язык":
                title = DataBase.FeedEntry.COLUMN_NAME_ENGLISH;
                break;
            case "Биология":
                title = DataBase.FeedEntry.COLUMN_NAME_BIO;
                break;
            case "География":
                title = DataBase.FeedEntry.COLUMN_NAME_GEO;
                break;
            case "Информатика":

                title = DataBase.FeedEntry.COLUMN_NAME_INF;
                break;
            case "Искусство(МХК)":

                title = DataBase.FeedEntry.COLUMN_NAME_MHK;
                break;
            case "Испанский язык":

                title = DataBase.FeedEntry.COLUMN_NAME_SPAN;
                break;
            case "История":

                title = DataBase.FeedEntry.COLUMN_NAME_HIS;
                break;
            case "Итальянский язык":

                title = DataBase.FeedEntry.COLUMN_NAME_ITAL;
                break;
            case "Китайский язык":
                title = DataBase.FeedEntry.COLUMN_NAME_CHIN;
                break;
            case "Литература":
                title = DataBase.FeedEntry.COLUMN_NAME_LIT;
                break;
            case "Математика":
                title = DataBase.FeedEntry.COLUMN_NAME_MATH;
                break;
            case "Немецкий язык":
                title = DataBase.FeedEntry.COLUMN_NAME_DEU;
                break;
            case "Обществознание":
                title = DataBase.FeedEntry.COLUMN_NAME_OBCH;
                break;
            case "Право":
                title = DataBase.FeedEntry.COLUMN_NAME_LOY;
                break;
            case "Русский язык":
                title = DataBase.FeedEntry.COLUMN_NAME_RUS;
                break;
            case "Физика":
                title = DataBase.FeedEntry.COLUMN_NAME_PHY;
                break;
            case "Химия":
                title = DataBase.FeedEntry.COLUMN_NAME_CHEM;
                break;
            case "Экология":
                title = DataBase.FeedEntry.COLUMN_NAME_ECO;
                break;
            case "Экономика":
                title = DataBase.FeedEntry.COLUMN_NAME_ECON;
                break;
            default:
                title = " ";
        }
        Dbhelper dbhelper = new Dbhelper(getBaseContext());
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        String iff = dbhelper.getData(title);
        Log.d("Check", "Here is your db: "+ iff);

        if(iff.equals("YES"))
            part.setText("Вы участвуете в данном предмете.");
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

    private void getdata() {

        // calling add value event listener method
        // for getting the values from database.
        mData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // this method is call to get the realtime
                // updates in the data.
                // this method is called when the data is
                // changed in our Firebase console.
                // below line is for getting the data from
                // snapshot of our database.
                String value = snapshot.getValue(String.class);

                // after getting the value we are setting
                // our value to our text view in below line.
                titlee.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // calling on cancelled method when we receive
                // any error or we are not able to get the data.
                Toast.makeText(SubjectActivity.this, "Fail to get data.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}