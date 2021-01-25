package com.e.eindwerk.data.db.unitlocalized.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/e/eindwerk/data/db/unitlocalized/current/MetricCurrentWeatherEntry;", "Lcom/e/eindwerk/data/db/unitlocalized/current/UnitSpecificCurrentWeatherEntry;", "temperature", "", "conditionText", "", "conditionIconUrl", "windSpeed", "windDirection", "precipitationVolume", "feelsLikeTemperature", "visibilityDistance", "(DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;DDD)V", "getConditionIconUrl", "()Ljava/lang/String;", "getConditionText", "getFeelsLikeTemperature", "()D", "getPrecipitationVolume", "getTemperature", "getVisibilityDistance", "getWindDirection", "getWindSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class MetricCurrentWeatherEntry implements com.e.eindwerk.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry {
    @androidx.room.ColumnInfo(name = "tempC")
    private final double temperature = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "condition_text")
    private final java.lang.String conditionText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "condition_icon")
    private final java.lang.String conditionIconUrl = null;
    @androidx.room.ColumnInfo(name = "windKph")
    private final double windSpeed = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "windDir")
    private final java.lang.String windDirection = null;
    @androidx.room.ColumnInfo(name = "precipMm")
    private final double precipitationVolume = 0.0;
    @androidx.room.ColumnInfo(name = "feelslikeC")
    private final double feelsLikeTemperature = 0.0;
    @androidx.room.ColumnInfo(name = "visKm")
    private final double visibilityDistance = 0.0;
    
    @java.lang.Override()
    public double getTemperature() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConditionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConditionIconUrl() {
        return null;
    }
    
    @java.lang.Override()
    public double getWindSpeed() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getWindDirection() {
        return null;
    }
    
    @java.lang.Override()
    public double getPrecipitationVolume() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getFeelsLikeTemperature() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getVisibilityDistance() {
        return 0.0;
    }
    
    public MetricCurrentWeatherEntry(double temperature, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionText, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionIconUrl, double windSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String windDirection, double precipitationVolume, double feelsLikeTemperature, double visibilityDistance) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.eindwerk.data.db.unitlocalized.current.MetricCurrentWeatherEntry copy(double temperature, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionText, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionIconUrl, double windSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String windDirection, double precipitationVolume, double feelsLikeTemperature, double visibilityDistance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}