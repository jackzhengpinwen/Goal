package com.zpw.goal.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "alarm_table")
data class Alarm(@PrimaryKey
                 private var alarmId: Int = 0,
                 private var hour: Int = 0,
                 private var minute: Int = 0,
                 private var started: Boolean = false,
                 private var recurring: Boolean = false,
                 private var monday: Boolean = false,
                 private var tuesday: Boolean = false,
                 private var wednesday: Boolean = false,
                 private var thursday: Boolean = false,
                 private var friday: Boolean = false,
                 private var saturday: Boolean = false,
                 private var sunday: Boolean = false,
                 private var title: String = "",
                 private var tone: String = "",
                 private var vibrate: Boolean = false): Serializable {

}