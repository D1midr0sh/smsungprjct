package com.example.samsungproject;

import android.app.AlarmManager;
import android.app.PendingIntent;
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
    EditText editText;
    Button commit;
    public int before;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        editText = findViewById(R.id.editTextNumber);
        commit = findViewById(R.id.commit);

    }

    public void onClickAlarm(View v){
        String bef = editText.getText().toString();
        try{
            before = Integer.parseInt(bef);
        } catch (Exception e){
            Toast.makeText(this, "Что-то не так. Возможно вы ввели не число.", Toast.LENGTH_SHORT).show();
        }
        Calendar olymp = Calendar.getInstance();
        olymp.set(Calendar.MONTH, Calendar.MAY);
        olymp.set(Calendar.DAY_OF_MONTH, 20);
        notifyAtTime(olymp, before);

    }



    public void notifyAtTime(Calendar olymp_date, int before) {
        Intent myIntent = new Intent(AlarmActivity.this , Notification.class);

        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getService(AlarmActivity.this, 0, myIntent, 0);
        Log.d("notific", "Olymp date: "+String.valueOf(olymp_date.get(Calendar.DAY_OF_YEAR)));
        Log.d("notific", "Notif date: "+String.valueOf(olymp_date.get(Calendar.DAY_OF_YEAR) - before));
        Calendar h = Calendar.getInstance();
        h.set(Calendar.DAY_OF_YEAR, olymp_date.get(Calendar.DAY_OF_YEAR) - before);

        Log.d("notific", "Another notif date: Month:"+String.valueOf(h.get(Calendar.MONTH))+"Day: "+String.valueOf(h.get(Calendar.DAY_OF_MONTH)));


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, olymp_date.get(Calendar.DAY_OF_YEAR)-before);
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 35);
        calendar.set(Calendar.SECOND, 00);
        Toast.makeText(this, "Notif send", Toast.LENGTH_SHORT).show();

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }
}