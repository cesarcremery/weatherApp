package com.e.eindwerk.data.network

import androidx.lifecycle.LiveData
import com.e.eindwerk.data.network.response.CurrentWeatherResponse
import com.e.eindwerk.data.network.response.FutureWeatherResponse

//interface voor de database
interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>


    suspend fun fetchCurrentWeather(
        location: String
    )

    suspend fun fetchFutureWeather(
            location: String,
    )
}