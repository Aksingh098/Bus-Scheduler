package com.example.busschedule.data.repository

import com.example.busschedule.data.database.BusSchedule
import com.example.busschedule.data.database.BusScheduleDao
import kotlinx.coroutines.flow.Flow

class OfflineScheduleRepository(private val scheduleDao: BusScheduleDao): ScheduleRepository {
    override fun getAllItemsStream(): Flow<List<BusSchedule>> = scheduleDao.getAllItems()
    override fun getItemStream(stopName: String): Flow<List<BusSchedule>> = scheduleDao.getItem(stopName)



}