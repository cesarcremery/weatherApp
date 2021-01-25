package com.e.eindwerk.data.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0003J\u0011\u0010\u000f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0019\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/e/eindwerk/data/provider/LocationProviderImpl;", "Lcom/resocoder/forecastmvvm/data/provider/PreferenceProvider;", "Lcom/e/eindwerk/data/provider/LocationProvider;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "getCustomLocationName", "", "getLastDeviceLocation", "Lkotlinx/coroutines/Deferred;", "Landroid/location/Location;", "getPreferredLocationString", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasCustomLocationChanged", "", "lastWeatherLocation", "Lcom/e/eindwerk/data/db/entity/WeatherLocation;", "hasDeviceLocationChanged", "(Lcom/e/eindwerk/data/db/entity/WeatherLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasLocationChanged", "hasLocationPermission", "isUsingDeviceLocation", "app_debug"})
public final class LocationProviderImpl extends com.resocoder.forecastmvvm.data.provider.PreferenceProvider implements com.e.eindwerk.data.provider.LocationProvider {
    private final android.content.Context appContext = null;
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object hasLocationChanged(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.entity.WeatherLocation lastWeatherLocation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPreferredLocationString(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    private final boolean hasCustomLocationChanged(com.e.eindwerk.data.db.entity.WeatherLocation lastWeatherLocation) {
        return false;
    }
    
    private final boolean isUsingDeviceLocation() {
        return false;
    }
    
    private final java.lang.String getCustomLocationName() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final kotlinx.coroutines.Deferred<android.location.Location> getLastDeviceLocation() {
        return null;
    }
    
    private final boolean hasLocationPermission() {
        return false;
    }
    
    public LocationProviderImpl(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}