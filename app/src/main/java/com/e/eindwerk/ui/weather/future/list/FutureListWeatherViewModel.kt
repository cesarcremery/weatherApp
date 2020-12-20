package com.e.eindwerk.ui.weather.future.list

import com.e.eindwerk.data.repository.ForecastRepository
import com.e.eindwerk.internal.lazyDeferred
import com.e.eindwerk.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
        private val forecastRepository: ForecastRepository,
) : WeatherViewModel(forecastRepository) {
    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now())
    }
}
