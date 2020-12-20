package com.e.eindwerk.ui.weather.future.detail

import com.e.eindwerk.data.repository.ForecastRepository
import com.e.eindwerk.internal.lazyDeferred
import com.e.eindwerk.ui.base.WeatherViewModel

class FutureDetailWeatherViewModel(
        private val detailDate: org.threeten.bp.LocalDate,
        private val forecastRepository: ForecastRepository
) : WeatherViewModel(forecastRepository) {
    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate)
    }
}