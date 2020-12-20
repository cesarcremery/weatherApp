package com.e.eindwerk.ui.weather.future.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.e.eindwerk.data.repository.ForecastRepository

class FutureDetailWeatherViewModelFactory(
        private val detailDate: org.threeten.bp.LocalDate,
        private val forecastRepository: ForecastRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FutureDetailWeatherViewModel(detailDate, forecastRepository) as T
    }

}