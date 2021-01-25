package com.e.eindwerk.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/e/eindwerk/ui/LifecycleBoundLocationManager;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/google/android/gms/location/FusedLocationProviderClient;Lcom/google/android/gms/location/LocationCallback;)V", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "removeLocationUpdates", "", "startLocationUpdates", "app_debug"})
public final class LifecycleBoundLocationManager implements androidx.lifecycle.LifecycleObserver {
    private final com.google.android.gms.location.LocationRequest locationRequest = null;
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = null;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void startLocationUpdates() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void removeLocationUpdates() {
    }
    
    public LifecycleBoundLocationManager(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationCallback locationCallback) {
        super();
    }
}