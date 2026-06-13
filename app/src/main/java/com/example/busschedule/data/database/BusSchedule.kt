package com.example.busschedule.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Schedule")
data class BusSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    // Map stopName to the "stop_name" column in the SQL file
    @ColumnInfo(name = "stop_name")
    val stopName: String,

    // Map arrivalTimeInMillis to the "arrival_time" column in the SQL file
    @ColumnInfo(name = "arrival_time")
    val arrivalTimeInMillis: Int
)