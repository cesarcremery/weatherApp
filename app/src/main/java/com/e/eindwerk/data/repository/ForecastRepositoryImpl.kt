package com.e.eindwerk.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.e.eindwerk.data.db.CurrentWeatherDao
import com.e.eindwerk.data.db.FutureWeatherDao
import com.e.eindwerk.data.db.WeatherLocationDao
import com.e.eindwerk.data.db.entity.WeatherLocation
import com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry
import com.e.eindwerk.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import com.e.eindwerk.data.network.FORECAST_DAYS_COUNT
import com.e.eindwerk.data.provider.LocationProvider
import com.e.eindwerk.data.network.WeatherNetworkDataSource
import com.e.eindwerk.data.network.response.CurrentWeatherResponse
import com.e.eindwerk.data.network.response.FutureWeatherResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.LocalDate
import java.time.ZonedDateTime

//Implementation van de interface
class ForecastRepositoryImpl(
        private val currentWeatherDao: CurrentWeatherDao,
        private val futureWeatherDao: FutureWeatherDao,
        private val weatherLocationDao: WeatherLocationDao,
        private val weatherNetworkDataSource: WeatherNetworkDataSource,
        private val locationProvider: LocationProvider
) : ForecastRepository {

    init {
        weatherNetworkDataSource.apply {
            downloadedCurrentWeather.observeForever { newCurrentWeather ->
                persistFetchedCurrentWeather(newCurrentWeather)
            }
            downloadedFutureWeather.observeForever { newFutureWeather ->
                persistFetchedFutureWeather(newFutureWeather)
            }
        }
    }

    override suspend fun getCurrentWeather(): LiveData<out UnitSpecificCurrentWeatherEntry> {
        return withContext(Dispatchers.IO) {
            initWeatherData()
            return@withContext  currentWeatherDao.getWeatherMetric()
        }
    }

    override suspend fun getFutureWeatherList(
            startDate: org.threeten.bp.LocalDate
    ): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>> {
        return withContext(Dispatchers.IO) {
            initWeatherData()
            return@withContext futureWeatherDao.getSimpleWeatherForecastsMetric(startDate)
        }
    }

    override suspend fun getFutureWeatherByDate(
            date: org.threeten.bp.LocalDate,
    ): LiveData<out UnitSpecificDetailFutureWeatherEntry> {
        return withContext(Dispatchers.IO) {
            initWeatherData()
            return@withContext futureWeatherDao.getDetailedWeatherByDateMetric(date)
        }
    }

    override suspend fun getWeatherLocation(): LiveData<WeatherLocation> {
        return withContext(Dispatchers.IO) {
            return@withContext weatherLocationDao.getLocation()
        }
    }

    private fun persistFetchedCurrentWeather(fetchedWeather: CurrentWeatherResponse) {
        GlobalScope.launch(Dispatchers.IO) {
            currentWeatherDao.upsert(fetchedWeather.currentWeatherEntry)
            weatherLocationDao.upsert(fetchedWeather.location)
        }
    }

    private fun persistFetchedFutureWeather(fetchedWeather: FutureWeatherResponse) {

        @RequiresApi(Build.VERSION_CODES.O)
        fun deleteOldForecastData() {
            val today = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                LocalDate.now()
            } else {
                throw Exception("Sdk exception")
            }
            futureWeatherDao.deleteOldEntries(today)
        }

        GlobalScope.launch(Dispatchers.IO) {
            deleteOldForecastData()
            val futureWeatherList = fetchedWeather.futureWeatherEntries.entries
            futureWeatherDao.insert(futureWeatherList)
            weatherLocationDao.upsert(fetchedWeather.location)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private suspend fun initWeatherData() {
        val lastWeatherLocation = weatherLocationDao.getLocationNonLive()

        if (lastWeatherLocation == null
                || locationProvider.hasLocationChanged(lastWeatherLocation)) {
            fetchCurrentWeather()
            fetchFutureWeather()
            return
        }

        if (isFetchCurrentNeeded(lastWeatherLocation.zonedDateTime))
            fetchCurrentWeather()

        if (isFetchFutureNeeded())
            fetchFutureWeather()
    }

    private suspend fun fetchCurrentWeather() {
        weatherNetworkDataSource.fetchCurrentWeather(
                locationProvider.getPreferredLocationString()
        )
    }

    private suspend fun fetchFutureWeather() {
        weatherNetworkDataSource.fetchFutureWeather(
                locationProvider.getPreferredLocationString()
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isFetchCurrentNeeded(lastFetchTime: ZonedDateTime): Boolean {
        val thirtyMinutesAgo = ZonedDateTime.now().minusMinutes(30)
        return lastFetchTime.isBefore(thirtyMinutesAgo)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isFetchFutureNeeded(): Boolean {
        val today = LocalDate.now()
        val futureWeatherCount = futureWeatherDao.countFutureWeather(today)
        return futureWeatherCount < FORECAST_DAYS_COUNT
    }
}