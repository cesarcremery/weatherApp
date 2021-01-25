package com.e.eindwerk.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/e/eindwerk/data/network/OpenWeatherApiService;", "", "getCurrentWeather", "Lkotlinx/coroutines/Deferred;", "Lcom/e/eindwerk/data/network/response/CurrentWeatherResponse;", "locatie", "", "Companion", "app_debug"})
public abstract interface OpenWeatherApiService {
    public static final com.e.eindwerk.data.network.OpenWeatherApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "current.json")
    public abstract kotlinx.coroutines.Deferred<com.e.eindwerk.data.network.response.CurrentWeatherResponse> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String locatie);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/e/eindwerk/data/network/OpenWeatherApiService$Companion;", "", "()V", "invoke", "Lcom/e/eindwerk/data/network/OpenWeatherApiService;", "connectivityInterceptor", "Lcom/e/eindwerk/data/network/connectivityInterceptor;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.e.eindwerk.data.network.OpenWeatherApiService invoke(@org.jetbrains.annotations.NotNull()
        com.e.eindwerk.data.network.connectivityInterceptor connectivityInterceptor) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}