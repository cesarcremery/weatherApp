package com.e.eindwerk.ui.weather.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/e/eindwerk/ui/weather/current/CurrentWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "forecastRepository", "Lcom/e/eindwerk/data/repository/ForecastRepository;", "(Lcom/e/eindwerk/data/repository/ForecastRepository;)V", "weather", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/LiveData;", "Lcom/e/eindwerk/data/db/unitlocalized/current/UnitSpecificCurrentWeatherEntry;", "getWeather", "()Lkotlinx/coroutines/Deferred;", "weather$delegate", "Lkotlin/Lazy;", "weatherLocation", "Lcom/e/eindwerk/data/db/entity/WeatherLocation;", "getWeatherLocation", "weatherLocation$delegate", "app_debug"})
public final class CurrentWeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weather$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weatherLocation$delegate = null;
    private final com.e.eindwerk.data.repository.ForecastRepository forecastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<? extends com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry>> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<com.e.eindwerk.data.db.entity.WeatherLocation>> getWeatherLocation() {
        return null;
    }
    
    public CurrentWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.repository.ForecastRepository forecastRepository) {
        super();
    }
}