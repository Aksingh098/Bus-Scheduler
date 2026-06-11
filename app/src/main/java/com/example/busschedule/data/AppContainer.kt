package com.example.busschedule.data

import android.content.Context
import com.example.busschedule.data.database.BusScheduleDatabase
import com.example.busschedule.data.repository.OfflineScheduleRepository
import com.example.busschedule.data.repository.ScheduleRepository


interface AppContainer {
    val scheduleRepository: ScheduleRepository
}


class DefaultContainer(private val context: Context) : AppContainer {


    override val scheduleRepository: ScheduleRepository by lazy {
        OfflineScheduleRepository(BusScheduleDatabase.getDatabase(context).busScheduleDao())
    }
}