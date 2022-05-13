package com.example.samsungproject;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;


public class Notification extends Service {


    @Override
    public void onCreate(){

        Toast.makeText(this, "Notification", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pending = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_baseline_access_alarm_24)
                .setContentTitle("Напоминание!")
                .setContentText("У тебя скоро олимпиада! Не забудь к ней подготовиться. Удачи!")
                .setContentIntent(pending);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(0, mBuilder.build());

    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

}