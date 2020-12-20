package com.e.eindwerk.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.e.eindwerk.data.db.entity.CURRENT_WEATHER_ID
import com.e.eindwerk.data.db.entity.CurrentWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.current.MetricCurrentWeatherEntry


@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("SELECT * FROM current_weather WHERE id=$CURRENT_WEATHER_ID")
    fun getWeatherMetric() : LiveData<MetricCurrentWeatherEntry>
}