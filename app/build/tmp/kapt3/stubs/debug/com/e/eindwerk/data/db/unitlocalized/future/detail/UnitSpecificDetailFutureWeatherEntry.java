package com.e.eindwerk.data.db.unitlocalized.future.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/e/eindwerk/data/db/unitlocalized/future/detail/UnitSpecificDetailFutureWeatherEntry;", "", "avgTemperature", "", "getAvgTemperature", "()D", "avgVisibilityDistance", "getAvgVisibilityDistance", "conditionIconUrl", "", "getConditionIconUrl", "()Ljava/lang/String;", "conditionText", "getConditionText", "date", "Lorg/threeten/bp/LocalDate;", "getDate", "()Lorg/threeten/bp/LocalDate;", "maxTemperature", "getMaxTemperature", "maxWindSpeed", "getMaxWindSpeed", "minTemperature", "getMinTemperature", "totalPrecipitation", "getTotalPrecipitation", "uv", "getUv", "app_debug"})
public abstract interface UnitSpecificDetailFutureWeatherEntry {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.threeten.bp.LocalDate getDate();
    
    public abstract double getMaxTemperature();
    
    public abstract double getMinTemperature();
    
    public abstract double getAvgTemperature();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionIconUrl();
    
    public abstract double getMaxWindSpeed();
    
    public abstract double getTotalPrecipitation();
    
    public abstract double getAvgVisibilityDistance();
    
    public abstract double getUv();
}