package com.e.eindwerk.ui.weather.current

import androidx.lifecycle.ViewModel
import com.e.eindwerk.data.repository.ForecastRepository
import com.e.eindwerk.internal.lazyDeferred

class CurrentWeatherViewModel(
        private val forecastRepository: ForecastRepository
) : ViewModel() {
    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather()
}

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}