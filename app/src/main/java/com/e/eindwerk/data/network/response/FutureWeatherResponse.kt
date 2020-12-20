package com.e.eindwerk.data.network.response

import com.e.eindwerk.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
        @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
        val location: WeatherLocation
)