package com.e.eindwerk.data.db.unitlocalized.future.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/e/eindwerk/data/db/unitlocalized/future/list/MetricSimpleFutureWeatherEntry;", "Lcom/e/eindwerk/data/db/unitlocalized/future/list/UnitSpecificSimpleFutureWeatherEntry;", "date", "Lorg/threeten/bp/LocalDate;", "avgTemperature", "", "conditionText", "", "conditionIconUrl", "(Lorg/threeten/bp/LocalDate;DLjava/lang/String;Ljava/lang/String;)V", "getAvgTemperature", "()D", "getConditionIconUrl", "()Ljava/lang/String;", "getConditionText", "getDate", "()Lorg/threeten/bp/LocalDate;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class MetricSimpleFutureWeatherEntry implements com.e.eindwerk.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "date")
    private final org.threeten.bp.LocalDate date = null;
    @androidx.room.ColumnInfo(name = "avgtempC")
    private final double avgTemperature = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "condition_text")
    private final java.lang.String conditionText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "condition_icon")
    private final java.lang.String conditionIconUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.threeten.bp.LocalDate getDate() {
        return null;
    }
    
    @java.lang.Override()
    public double getAvgTemperature() {
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
    
    public MetricSimpleFutureWeatherEntry(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.LocalDate date, double avgTemperature, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionText, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionIconUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.LocalDate component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.eindwerk.data.db.unitlocalized.future.list.MetricSimpleFutureWeatherEntry copy(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.LocalDate date, double avgTemperature, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionText, @org.jetbrains.annotations.NotNull()
    java.lang.String conditionIconUrl) {
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