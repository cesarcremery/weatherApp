package com.e.eindwerk.data.db.unitlocalized.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/e/eindwerk/data/db/unitlocalized/current/UnitSpecificCurrentWeatherEntry;", "", "conditionIconUrl", "", "getConditionIconUrl", "()Ljava/lang/String;", "conditionText", "getConditionText", "feelsLikeTemperature", "", "getFeelsLikeTemperature", "()D", "precipitationVolume", "getPrecipitationVolume", "temperature", "getTemperature", "visibilityDistance", "getVisibilityDistance", "windDirection", "getWindDirection", "windSpeed", "getWindSpeed", "app_debug"})
public abstract interface UnitSpecificCurrentWeatherEntry {
    
    public abstract double getTemperature();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionIconUrl();
    
    public abstract double getWindSpeed();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getWindDirection();
    
    public abstract double getPrecipitationVolume();
    
    public abstract double getFeelsLikeTemperature();
    
    public abstract double getVisibilityDistance();
}