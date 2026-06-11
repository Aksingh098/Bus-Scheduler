package com.example.busschedule.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val stopName: String,
    val arrivalTimeInMillis: Int
)