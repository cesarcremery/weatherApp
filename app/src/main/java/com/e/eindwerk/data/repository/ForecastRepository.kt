package com.e.eindwerk.data.repository

import androidx.lifecycle.LiveData
import com.e.eindwerk.data.db.entity.WeatherLocation
import com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather() : LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherLocation() : LiveData<WeatherLocation>
}