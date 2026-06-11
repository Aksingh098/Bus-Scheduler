package com.example.busschedule.data.repository

import com.example.busschedule.data.database.BusSchedule
import kotlinx.coroutines.flow.Flow

interface ScheduleRepository {
    fun getAllItemsStream(): Flow<List<BusSchedule>>
    fun getItemStream(stopName: String): Flow<BusSchedule?>
}