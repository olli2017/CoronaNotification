package com.example.myapplication3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class NotificationSettingsActivity extends AppCompatActivity {

    public static final String FIFTEEN_MINUTES = "15 минут";
    public static final String THIRTY_MINUTES = "30 минут";
    public static final String ONE_HOUR = "1 час";
    public static final String THREE_HOURS = "3 часа";
    public static final String SIX_HOURS = "6 часов";
    public static final String ONE_DAY = "1 день";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_settings);
        Button button = (Button) findViewById(R.id.notify_button2);
        Button buttonOff = findViewById(R.id.button_off);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlarm();
                NotificationHelper.enableBootReceiver(NotificationSettingsActivity.this);
            }
        });

        buttonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endAlarm();
                NotificationHelper.enableBootReceiver(NotificationSettingsActivity.this);
            }
        });


        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{FIFTEEN_MINUTES, THIRTY_MINUTES, ONE_HOUR, THREE_HOURS, SIX_HOURS, ONE_DAY};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    public void startAlarm() {
        Intent intent = new Intent(NotificationSettingsActivity.this, AlarmBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(NotificationSettingsActivity.this, 1, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        HashMap<String, Long> str2time = new HashMap<String, Long>() {
            {
                put(FIFTEEN_MINUTES, AlarmManager.INTERVAL_FIFTEEN_MINUTES);
                put(THIRTY_MINUTES, AlarmManager.INTERVAL_HALF_HOUR);
                put(ONE_HOUR, AlarmManager.INTERVAL_HOUR);
                put(THREE_HOURS, AlarmManager.INTERVAL_HOUR * 3);
                put(SIX_HOURS, AlarmManager.INTERVAL_HOUR * 6);
                put(ONE_DAY, AlarmManager.INTERVAL_DAY);
            }
        };
        Spinner dropdown = findViewById(R.id.spinner1);
        String time_name = dropdown.getSelectedItem().toString();
        Long time = str2time.getOrDefault(time_name, AlarmManager.INTERVAL_DAY);
        alarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() + 1000,
                time,
                pendingIntent);

        Toast.makeText(NotificationSettingsActivity.this, "Alarm set", Toast.LENGTH_LONG).show();
    }

    public void endAlarm() {
        Intent intent = new Intent(NotificationSettingsActivity.this, AlarmBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(NotificationSettingsActivity.this, 1, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.cancel(pendingIntent);
        Toast.makeText(NotificationSettingsActivity.this, "Alarm turn off", Toast.LENGTH_LONG).show();
    }
}
