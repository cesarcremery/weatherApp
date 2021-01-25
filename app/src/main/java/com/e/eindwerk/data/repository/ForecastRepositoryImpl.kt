package com.e.eindwerk.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.e.eindwerk.data.db.CurrentWeatherDao
import com.e.eindwerk.data.db.WeatherLocationDao
import com.e.eindwerk.data.db.entity.WeatherLocation
import com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.e.eindwerk.data.network.WeatherNetworkDataSource
import com.e.eindwerk.data.network.response.CurrentWeatherResponse
import com.e.eindwerk.data.provider.LocationProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.ZonedDateTime

class ForecastRepositoryImpl(
        private val currentWeatherDao: CurrentWeatherDao,
        private val weatherLocationDao: WeatherLocationDao,
        private val weatherNetworkDataSource: WeatherNetworkDataSource,
        private val locationProvider: LocationProvider
) : ForecastRepository {
    init{
        weatherNetworkDataSource.apply {
            downloadedCurrentWeather.observeForever { newCurrentWeather ->
                persistFetchedCurrentWeather(newCurrentWeather)
            }
        }
    }
    override suspend fun getCurrentWeather(): LiveData<out UnitSpecificCurrentWeatherEntry> {
        return withContext(Dispatchers.IO) {
            initWeatherData()
            return@withContext currentWeatherDao.getWeatherMetric()
        }
    }

    override suspend fun getWeatherLocation(): LiveData<WeatherLocation> {
        return withContext(Dispatchers.IO) {
            return@withContext weatherLocationDao.getLocation();
        }
    }

    private fun persistFetchedCurrentWeather(fetchedWeather: CurrentWeatherResponse) {
        GlobalScope.launch(Dispatchers.IO) {
            currentWeatherDao.upsert(fetchedWeather.currentWeatherEntry)
            weatherLocationDao.upsert(fetchedWeather.location)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private suspend fun initWeatherData() {
        val lastWeatherLocation = weatherLocationDao.getLocationNonLive()
        if(lastWeatherLocation == null || locationProvider.hasLocationChanged(lastWeatherLocation)) {
            fetchCurrentWeather()
            return
        }
        if(isCurrentFetchNeeded(lastWeatherLocation.zonedDateTime))
            fetchCurrentWeather()
    }

    private suspend fun fetchCurrentWeather() {
        weatherNetworkDataSource.fetchCurrentWeather(
                locationProvider.getPreferredLocationString()
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isCurrentFetchNeeded(lastFetchTime: ZonedDateTime): Boolean {
        val minback = ZonedDateTime.now().minusMinutes(30);
        return lastFetchTime.isBefore(minback);
    }
}