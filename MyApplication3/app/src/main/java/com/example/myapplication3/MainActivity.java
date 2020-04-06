package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNotificationSettings(View view) {
        Intent intent = new Intent(this, NotificationSettingsActivity.class);
        startActivity(intent);
    }

    public void displayInfoImage(View view) {
        Intent intent = new Intent(this, DisplayInfoActivity.class);
        startActivity(intent);
    }

    public void displayOnlineStats(View view) {
        Intent intent = new Intent(this, DisplayOnlineStats.class);
        startActivity(intent);
    }
}
