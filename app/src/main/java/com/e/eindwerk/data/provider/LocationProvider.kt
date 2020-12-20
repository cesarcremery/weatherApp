package com.e.eindwerk.data.provider

import com.e.eindwerk.data.db.entity.WeatherLocation

interface LocationProvider {
    suspend fun hasLocationChanged(lastWeahterLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}