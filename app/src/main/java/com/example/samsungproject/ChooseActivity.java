package com.example.samsungproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

    }

    @SuppressLint("NonConstantResourceId")
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox h;
        String title;

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                h = findViewById(R.id.checkBox);
                title = h.getText().toString();
                break;
            case R.id.checkBox2:
                h = findViewById(R.id.checkBox2);
                title = h.getText().toString();
                break;
            case R.id.checkBox3:
                h = findViewById(R.id.checkBox3);
                title = h.getText().toString();
                break;
            case R.id.checkBox4:
                h = findViewById(R.id.checkBox4);
                title = h.getText().toString();
                break;
            case R.id.checkBox5:
                h = findViewById(R.id.checkBox5);
                title = h.getText().toString();
                break;
            case R.id.checkBox6:
                h = findViewById(R.id.checkBox6);
                title = h.getText().toString();
                break;
            case R.id.checkBox7:
                h = findViewById(R.id.checkBox7);
                title = h.getText().toString();
                break;
            case R.id.checkBox8:
                h = findViewById(R.id.checkBox8);
                title = h.getText().toString();
                break;
            case R.id.checkBox9:
                h = findViewById(R.id.checkBox9);
                title = h.getText().toString();
                break;
            case R.id.checkBox10:
                h = findViewById(R.id.checkBox10);
                title = h.getText().toString();
                break;
            case R.id.checkBox11:
                h = findViewById(R.id.checkBox11);
                title = h.getText().toString();
                break;
            case R.id.checkBox12:
                h = findViewById(R.id.checkBox12);
                title = h.getText().toString();
                break;
            case R.id.checkBox13:
                h = findViewById(R.id.checkBox13);
                title = h.getText().toString();
                break;
            case R.id.checkBox14:
                h = findViewById(R.id.checkBox14);
                title = h.getText().toString();
                break;
            case R.id.checkBox15:
                h = findViewById(R.id.checkBox15);
                title = h.getText().toString();
                break;
            case R.id.checkBox16:
                h = findViewById(R.id.checkBox16);
                title = h.getText().toString();
                break;
            case R.id.checkBox17:
                h = findViewById(R.id.checkBox17);
                title = h.getText().toString();
                break;
            case R.id.checkBox18:
                h = findViewById(R.id.checkBox18);
                title = h.getText().toString();
                break;
            case R.id.checkBox19:
                h = findViewById(R.id.checkBox19);
                title = h.getText().toString();
                break;
            case R.id.checkBox20:
                h = findViewById(R.id.checkBox20);
                title = h.getText().toString();
                break;
            default:
                title = " ";

        }

    }
    public void onClickBack(View view){
        Intent intent = new Intent(ChooseActivity.this, MainActivity.class);
        startActivity(intent);
    }
}