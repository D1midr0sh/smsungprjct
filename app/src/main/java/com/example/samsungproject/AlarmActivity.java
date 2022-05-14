package com.example.samsungproject;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {
    EditText editText, edTxt, edT;
    Button commit;
    public int before, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        editText = findViewById(R.id.editTextNumber);
        edTxt = findViewById(R.id.editTextNumber2);
        edT = findViewById(R.id.editTextNumber3);
        commit = findViewById(R.id.commit);

    }

    public void onClickAlarm(View v){
        String bef = editText.getText().toString();
        String h = edTxt.getText().toString();
        String m = edT.getText().toString();
        try{
            before = Integer.parseInt(bef);
            hour = Integer.parseInt(h);
            minute = Integer.parseInt(m);
            Calendar olymp = Calendar.getInstance();
            olymp.set(Calendar.MONTH, Calendar.MAY);
            olymp.set(Calendar.DAY_OF_MONTH, 20);
            notifyAtTime2(this, hour, minute);
        } catch (Exception e){
            Toast.makeText(this, "Что-то не так. Возможно вы ввели не число.", Toast.LENGTH_SHORT).show();
        }


    }



    public void notifyAtTime(Calendar olymp_date, int before, Context c) {
        Intent myIntent = new Intent(c, Notification.class);
        Toast.makeText(this, "Notification has been send", Toast.LENGTH_SHORT).show();
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getService(c, 0, myIntent, 0);
        Log.d("notific", "Olymp date: "+String.valueOf(olymp_date.get(Calendar.DAY_OF_YEAR)));
        Log.d("notific", "Notif date: "+String.valueOf(olymp_date.get(Calendar.DAY_OF_YEAR) - before));
        Calendar h = Calendar.getInstance();
        h.set(Calendar.DAY_OF_YEAR, olymp_date.get(Calendar.DAY_OF_YEAR) - before);

        Log.d("notific", "Another notif date: Month:"+String.valueOf(h.get(Calendar.MONTH))+"Day: "+String.valueOf(h.get(Calendar.DAY_OF_MONTH)));


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, olymp_date.get(Calendar.DAY_OF_YEAR)-before);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 00);

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }

    public void notifyAtTime2(Context c, int hour, int minute) {
        Intent myIntent = new Intent(c, Notification.class);
        Toast.makeText(this, "Notification has been send", Toast.LENGTH_SHORT).show();
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getService(c, 0, myIntent, PendingIntent.FLAG_IMMUTABLE);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 00);

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }
}