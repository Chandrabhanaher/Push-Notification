package com.ugc.pushnotification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("Message", "Message data payload: " + remoteMessage.getData());

        Intent i  = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent intent = PendingIntent.getActivity(this, 0, i,PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder noBuilder = new NotificationCompat.Builder(this);

        noBuilder.setContentTitle("FCM Notification");
        noBuilder.setContentText(remoteMessage.getNotification().getBody());
        Log.d("Notification", "Message Notification Body: " + remoteMessage.getNotification().getBody());
        noBuilder.setAutoCancel(true);
        noBuilder.setSmallIcon(R.mipmap.ic_launcher);
        noBuilder.setContentIntent(intent);

        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,noBuilder.build());
    }
}
