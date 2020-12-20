package com.e.eindwerk.ui.weather.future.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.e.eindwerk.R
import com.e.eindwerk.data.db.LocalDateConverter
import com.e.eindwerk.internal.DateNotFoundException
import com.e.eindwerk.internal.glide.GlideApp
import com.e.eindwerk.ui.base.ScopedFragment
import org.kodein.di.KodeinAware
import kotlinx.android.synthetic.main.future_detail_weather_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.factory
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle

@Suppress("DEPRECATION")
class FutureDetailWeatherFragment : ScopedFragment(), KodeinAware {
    override val kodein by closestKodein()

    private val viewModelFactoryInstanceFactory
            : ((LocalDate) -> FutureDetailWeatherViewModelFactory) by factory()

    private lateinit var viewModel: FutureDetailWeatherViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_detail_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val safeArgs = arguments?.let { FutureDetailWeatherFragmentArgs.fromBundle(it) }
        val date = LocalDateConverter.stringToDate(safeArgs?.dateString) ?: throw DateNotFoundException()

        viewModel = ViewModelProviders.of(this, viewModelFactoryInstanceFactory(date))
                .get(FutureDetailWeatherViewModel::class.java)

        bindUI()
    }

    private fun bindUI() = launch(Dispatchers.Main) {
        val futureWeather = viewModel.weather.await()
        val weatherLocation = viewModel.weatherLocation.await()

        weatherLocation.observe(viewLifecycleOwner, Observer { location ->
            if (location == null) return@Observer
            updateLocation(location.name)
        })

        futureWeather.observe(viewLifecycleOwner, Observer { weatherEntry ->
            if (weatherEntry == null) return@Observer

            updateDate(weatherEntry.date)
            updateTemperatures(weatherEntry.avgTemperature,
                    weatherEntry.minTemperature, weatherEntry.maxTemperature)
            updateCondition(weatherEntry.conditionText)
            updatePrecipitation(weatherEntry.totalPrecipitation)
            updateWindSpeed(weatherEntry.maxWindSpeed)
            updateVisibility(weatherEntry.avgVisibilityDistance)

            GlideApp.with(this@FutureDetailWeatherFragment)
                    .load("http:" + weatherEntry.conditionIconUrl)
                    .into(imgIcon)
        })
    }

    private fun updateLocation(location: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.title = location
    }

    private fun updateDate(date: LocalDate) {
        (activity as? AppCompatActivity)?.supportActionBar?.subtitle =
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
    }

    private fun updateTemperatures(temperature: Double, min: Double, max: Double) {
        txtTemperature.text = "$temperature°C"
        textView_min_max_temperature.text = "Min: $min°C, Max: $max°C"
    }

    private fun updateCondition(condition: String) {
        txtCondition.text = condition
    }

    private fun updatePrecipitation(precipitationVolume: Double) {
        val unit = "mm"
        txtPrecipation.text = "Precipitation: $precipitationVolume $unit"
    }

    private fun updateWindSpeed(windSpeed: Double) {
        val unit = "kph"
        txtWind.text = "Wind speed: $windSpeed $unit"
    }

    private fun updateVisibility(visibilityDistance: Double) {
        val unit = "km"
        txtVisibility.text = "Visibility: $visibilityDistance $unit"
    }
}