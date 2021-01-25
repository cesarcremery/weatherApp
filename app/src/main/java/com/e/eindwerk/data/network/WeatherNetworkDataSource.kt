package com.e.eindwerk.data.network

import androidx.lifecycle.LiveData
import com.e.eindwerk.data.network.response.CurrentWeatherResponse

//interface voor de database
interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    suspend fun fetchCurrentWeather(
        location: String
    )
}