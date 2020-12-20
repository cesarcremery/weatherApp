package com.e.eindwerk.data.repository

import androidx.lifecycle.LiveData
import com.e.eindwerk.data.db.entity.WeatherLocation
import com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry

//interface voor de repository met 1 functie
interface ForecastRepository {
    //functie voor het opvragen van het weer in metric of imperial
    suspend fun getCurrentWeather() : LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getFutureWeatherList(startDate: org.threeten.bp.LocalDate): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>
    suspend fun getFutureWeatherByDate(date: org.threeten.bp.LocalDate): LiveData<out UnitSpecificDetailFutureWeatherEntry>
    suspend fun getWeatherLocation() : LiveData<WeatherLocation>
}