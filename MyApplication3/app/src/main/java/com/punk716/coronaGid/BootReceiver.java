package com.punk716.coronaGid;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

import java.util.Objects;

import static android.content.Context.ALARM_SERVICE;


public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            //only enabling one type of notifications for demo purposes
            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 1, intent, 0);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(ALARM_SERVICE);
            alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                    SystemClock.elapsedRealtime() + 1000,
                    AlarmManager.INTERVAL_HOUR * 3,
                    pendingIntent);
        }
    }

}