package com.example.busschedule.data.database

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {

    @Query("SELECT * from BusSchedule WHERE  stopName = :stopName")
    fun getItem(stopName: String): Flow<BusSchedule>

    @Query("SELECT * from BusSchedule ORDER BY stopName ASC")
    fun getAllItems(): Flow<List<BusSchedule>>
}