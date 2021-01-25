package com.e.eindwerk.data.db.unitlocalized.future.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/e/eindwerk/data/db/unitlocalized/future/list/UnitSpecificSimpleFutureWeatherEntry;", "", "avgTemperature", "", "getAvgTemperature", "()D", "conditionIconUrl", "", "getConditionIconUrl", "()Ljava/lang/String;", "conditionText", "getConditionText", "date", "Lorg/threeten/bp/LocalDate;", "getDate", "()Lorg/threeten/bp/LocalDate;", "app_debug"})
public abstract interface UnitSpecificSimpleFutureWeatherEntry {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.threeten.bp.LocalDate getDate();
    
    public abstract double getAvgTemperature();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConditionIconUrl();
}