package com.e.eindwerk.data.network.response


import com.e.eindwerk.data.db.entity.CurrentWeatherEntry
import com.e.eindwerk.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: WeatherLocation
)