package com.e.eindwerk.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/e/eindwerk/ui/base/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "forecastRepository", "Lcom/e/eindwerk/data/repository/ForecastRepository;", "(Lcom/e/eindwerk/data/repository/ForecastRepository;)V", "weatherLocation", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/LiveData;", "Lcom/e/eindwerk/data/db/entity/WeatherLocation;", "getWeatherLocation", "()Lkotlinx/coroutines/Deferred;", "weatherLocation$delegate", "Lkotlin/Lazy;", "app_debug"})
public abstract class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weatherLocation$delegate = null;
    private final com.e.eindwerk.data.repository.ForecastRepository forecastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<com.e.eindwerk.data.db.entity.WeatherLocation>> getWeatherLocation() {
        return null;
    }
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.repository.ForecastRepository forecastRepository) {
        super();
    }
}