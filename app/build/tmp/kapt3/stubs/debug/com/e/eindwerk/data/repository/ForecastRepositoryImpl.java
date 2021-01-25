package com.e.eindwerk.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\u00020\fH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/e/eindwerk/data/repository/ForecastRepositoryImpl;", "Lcom/e/eindwerk/data/repository/ForecastRepository;", "currentWeatherDao", "Lcom/e/eindwerk/data/db/CurrentWeatherDao;", "weatherLocationDao", "Lcom/e/eindwerk/data/db/WeatherLocationDao;", "weatherNetworkDataSource", "Lcom/e/eindwerk/data/network/WeatherNetworkDataSource;", "locationProvider", "Lcom/e/eindwerk/data/provider/LocationProvider;", "(Lcom/e/eindwerk/data/db/CurrentWeatherDao;Lcom/e/eindwerk/data/db/WeatherLocationDao;Lcom/e/eindwerk/data/network/WeatherNetworkDataSource;Lcom/e/eindwerk/data/provider/LocationProvider;)V", "fetchCurrentWeather", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/e/eindwerk/data/db/unitlocalized/current/UnitSpecificCurrentWeatherEntry;", "getWeatherLocation", "Lcom/e/eindwerk/data/db/entity/WeatherLocation;", "initWeatherData", "isCurrentFetchNeeded", "", "lastFetchTime", "Ljava/time/ZonedDateTime;", "persistFetchedCurrentWeather", "fetchedWeather", "Lcom/e/eindwerk/data/network/response/CurrentWeatherResponse;", "app_debug"})
public final class ForecastRepositoryImpl implements com.e.eindwerk.data.repository.ForecastRepository {
    private final com.e.eindwerk.data.db.CurrentWeatherDao currentWeatherDao = null;
    private final com.e.eindwerk.data.db.WeatherLocationDao weatherLocationDao = null;
    private final com.e.eindwerk.data.network.WeatherNetworkDataSource weatherNetworkDataSource = null;
    private final com.e.eindwerk.data.provider.LocationProvider locationProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<? extends com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.e.eindwerk.data.db.entity.WeatherLocation>> p0) {
        return null;
    }
    
    private final void persistFetchedCurrentWeather(com.e.eindwerk.data.network.response.CurrentWeatherResponse fetchedWeather) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final boolean isCurrentFetchNeeded(java.time.ZonedDateTime lastFetchTime) {
        return false;
    }
    
    public ForecastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.CurrentWeatherDao currentWeatherDao, @org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.WeatherLocationDao weatherLocationDao, @org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.network.WeatherNetworkDataSource weatherNetworkDataSource, @org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.provider.LocationProvider locationProvider) {
        super();
    }
}