package com.e.eindwerk.ui.base

import androidx.lifecycle.ViewModel
import com.e.eindwerk.data.repository.ForecastRepository
import com.e.eindwerk.internal.lazyDeferred

abstract class WeatherViewModel(
        private val forecastRepository: ForecastRepository,
) : ViewModel() {
    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}