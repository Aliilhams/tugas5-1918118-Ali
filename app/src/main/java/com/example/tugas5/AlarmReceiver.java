package com.example.tugas5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;

import androidx.core.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            long[] pattern = {500,500, 500,500, 500,500, 500,500};
            Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(pattern , 0);
            NotificationHelper notificationHelper = new
                    NotificationHelper(context);
            NotificationCompat.Builder nb =
                    notificationHelper.getChannelNotification();
            notificationHelper.getManager().notify(1, nb.build());
        }
    }
