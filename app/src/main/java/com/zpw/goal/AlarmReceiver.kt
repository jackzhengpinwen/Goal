package com.zpw.goal

import android.Manifest
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.zpw.goal.ui.activities.MainActivity

class AlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "收到提醒", Toast.LENGTH_SHORT).show();
        val nextActivity = Intent(context, MainActivity::class.java)
        intent?.apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(context, 0, nextActivity, PendingIntent.FLAG_MUTABLE)
        context?.let {
            val builder = NotificationCompat.Builder(it, "Goal")
                .setSmallIcon(androidx.core.R.drawable.notification_action_background)
                .setContentTitle("提醒")
                .setContentText("还未完成今日目标")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
            if (ActivityCompat.checkSelfPermission(it, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                return
            }
            NotificationManagerCompat.from(it).notify(911 , builder.build())
            Toast.makeText(context, "发送提醒", Toast.LENGTH_SHORT).show();
        }
    }
}