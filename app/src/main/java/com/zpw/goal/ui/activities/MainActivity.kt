package com.zpw.goal.ui.activities

import android.app.AlarmManager
import android.app.PendingIntent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.timepicker.MaterialTimePicker
import com.zpw.goal.R
import com.zpw.goal.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var timePicker: MaterialTimePicker
    lateinit var calendar: Calendar
    lateinit var alarmManager: AlarmManager
    lateinit var pendingIntent: PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding.setAlarm.setOnClickListener {
//            XXPermissions.with(this)
//                .permission(Permission.POST_NOTIFICATIONS)
//                .request(object : OnPermissionCallback {
//
//                    override fun onGranted(permissions: MutableList<String>, allGranted: Boolean) {
//                        if (!allGranted) {
//                            return
//                        }
//                        timePicker = MaterialTimePicker.Builder()
//                            .setTimeFormat(TimeFormat.CLOCK_24H)
//                            .setHour(23)
//                            .setMinute(0)
//                            .setTitleText("选择提示时间")
//                            .build()
//                        timePicker.show(supportFragmentManager, "goal")
//                        timePicker.addOnPositiveButtonClickListener {
//                            calendar = Calendar.getInstance()
//                            calendar.set(Calendar.HOUR_OF_DAY, timePicker.hour)
//                            calendar.set(Calendar.MINUTE, timePicker.minute)
//                            calendar.set(Calendar.SECOND, 0)
//                            calendar.set(Calendar.MILLISECOND, 0)
//
//                            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
//                            val intent = Intent(this@MainActivity, AlarmReceiver::class.java)
//                            pendingIntent = PendingIntent.getBroadcast(this@MainActivity, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE)
//                            alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent)
//                            Toast.makeText(this@MainActivity,"设置提醒闹铃成功! ", Toast.LENGTH_LONG).show();
//                        }
//                    }
//
//                    override fun onDenied(permissions: MutableList<String>, doNotAskAgain: Boolean) {
//                        if (doNotAskAgain) {
//                            // 如果是被永久拒绝就跳转到应用权限系统设置页面
//                            XXPermissions.startPermissionActivity(this@MainActivity, permissions)
//                        }
//                    }
//                })
//        }
//        binding.cancelAlarm.setOnClickListener {
//            val intent = Intent(this@MainActivity, AlarmReceiver::class.java)
//            pendingIntent = PendingIntent.getBroadcast(this@MainActivity, 0, intent, PendingIntent.FLAG_MUTABLE)
//            alarmManager.cancel(pendingIntent)
//        }
    }

}