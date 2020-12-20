package com.e.eindwerk.ui.weather.current

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.e.eindwerk.R
import com.e.eindwerk.internal.glide.GlideApp
import com.e.eindwerk.ui.base.ScopedFragment
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.instance

class CurrentWeatherFragment : ScopedFragment(), KodeinAware {
    //Gebruikt kodein van de Applicationclass
    override val kodein by closestKodein()

    private val viewModelFactory: CurrentWeatherViewModelFactory by instance()

    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)
                .get(CurrentWeatherViewModel::class.java)
        bindUI()
    }


    @SuppressLint("FragmentLiveDataObserve")
    private fun bindUI()  = launch{
        val currentWeather = viewModel.weather.await()

        val weatherLocation = viewModel.weatherLocation.await()

        weatherLocation.observe(this@CurrentWeatherFragment, Observer { location ->
            if(location == null) return@Observer
            updateLocation(location.name)
        })

        currentWeather.observe(this@CurrentWeatherFragment, Observer {
            if(it == null) return@Observer
            loadingGroup.visibility = View.GONE
            updateToToday()
            updateTemperatures(it.temperature, it.feelsLikeTemperature)
            updateCondition(it.conditionText)
            updatePrecipitation(it.precipitationVolume)
            updateWind(it.windDirection, it.windSpeed)
            updateVisibility(it.visibilityDistance)
            //zorgt voor de url naar het icoon van het huidige weer
            GlideApp.with(this@CurrentWeatherFragment)
                    .load("https:${it.conditionIconUrl}")
                    .into(imgIcon)
        })
    }

    private fun updateLocation(location: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.title = location
    }

    private fun updateToToday() {
        (activity as? AppCompatActivity)?.supportActionBar?.subtitle = "Today"
    }

    @SuppressLint("SetTextI18n")
    private fun updateTemperatures(temperature: Double, feelsLikeTemp: Double) {
        txtTemperature.text = "$temperature°C"
        txtFeelsLikeTemp.text = "Feels like: $feelsLikeTemp°C"
    }

    private fun updateCondition(condition :String) {
        txtCondition.text = condition
    }

    @SuppressLint("SetTextI18n")
    private fun updatePrecipitation(volume : Double) {
        txtPrecipation.text = "Percipitation: $volume mm"
    }

    @SuppressLint("SetTextI18n")
    private fun updateWind(windDirection : String, windSpeed: Double) {
        txtWind.text = "Wind: $windDirection, $windSpeed kph"
    }

    @SuppressLint("SetTextI18n")
    private fun updateVisibility(visDistance: Double) {
        txtVisibility.text = "Visibility: $visDistance km"
    }

}