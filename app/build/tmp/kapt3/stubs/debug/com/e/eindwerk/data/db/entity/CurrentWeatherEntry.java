package com.e.eindwerk.data.db.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "current_weather")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u001dJ\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\u0007H\u00c6\u0003J\t\u0010F\u001a\u00020\u0007H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u000eH\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\u0007H\u00c6\u0003J\t\u0010N\u001a\u00020\u0007H\u00c6\u0003J\t\u0010O\u001a\u00020\u0007H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u000eH\u00c6\u0003J\u00ef\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001J\t\u0010X\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u001e\u0010(\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010+R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0016\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0016\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0016\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0016\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010#\u00a8\u0006Y"}, d2 = {"Lcom/e/eindwerk/data/db/entity/CurrentWeatherEntry;", "", "cloud", "", "condition", "Lcom/e/eindwerk/data/db/entity/Condition;", "feelslikeC", "", "feelslikeF", "gustKph", "gustMph", "humidity", "isDay", "lastUpdated", "", "lastUpdatedEpoch", "precipIn", "precipMm", "pressureIn", "pressureMb", "tempC", "tempF", "uv", "visKm", "visMiles", "windDegree", "windDir", "windKph", "windMph", "(ILcom/e/eindwerk/data/db/entity/Condition;DDDDIILjava/lang/String;IDDDDDDDDDILjava/lang/String;DD)V", "getCloud", "()I", "getCondition", "()Lcom/e/eindwerk/data/db/entity/Condition;", "getFeelslikeC", "()D", "getFeelslikeF", "getGustKph", "getGustMph", "getHumidity", "id", "getId", "setId", "(I)V", "getLastUpdated", "()Ljava/lang/String;", "getLastUpdatedEpoch", "getPrecipIn", "getPrecipMm", "getPressureIn", "getPressureMb", "getTempC", "getTempF", "getUv", "getVisKm", "getVisMiles", "getWindDegree", "getWindDir", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CurrentWeatherEntry {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id = 0;
    private final int cloud = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "condition_")
    private final com.e.eindwerk.data.db.entity.Condition condition = null;
    @com.google.gson.annotations.SerializedName(value = "feelslike_c")
    private final double feelslikeC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feelslike_f")
    private final double feelslikeF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gust_kph")
    private final double gustKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gust_mph")
    private final double gustMph = 0.0;
    private final int humidity = 0;
    @com.google.gson.annotations.SerializedName(value = "is_day")
    private final int isDay = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "last_updated")
    private final java.lang.String lastUpdated = null;
    @com.google.gson.annotations.SerializedName(value = "last_updated_epoch")
    private final int lastUpdatedEpoch = 0;
    @com.google.gson.annotations.SerializedName(value = "precip_in")
    private final double precipIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "precip_mm")
    private final double precipMm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure_in")
    private final double pressureIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure_mb")
    private final double pressureMb = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_c")
    private final double tempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_f")
    private final double tempF = 0.0;
    private final double uv = 0.0;
    @com.google.gson.annotations.SerializedName(value = "vis_km")
    private final double visKm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "vis_miles")
    private final double visMiles = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_degree")
    private final int windDegree = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind_dir")
    private final java.lang.String windDir = null;
    @com.google.gson.annotations.SerializedName(value = "wind_kph")
    private final double windKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_mph")
    private final double windMph = 0.0;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getCloud() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.eindwerk.data.db.entity.Condition getCondition() {
        return null;
    }
    
    public final double getFeelslikeC() {
        return 0.0;
    }
    
    public final double getFeelslikeF() {
        return 0.0;
    }
    
    public final double getGustKph() {
        return 0.0;
    }
    
    public final double getGustMph() {
        return 0.0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int isDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final int getLastUpdatedEpoch() {
        return 0;
    }
    
    public final double getPrecipIn() {
        return 0.0;
    }
    
    public final double getPrecipMm() {
        return 0.0;
    }
    
    public final double getPressureIn() {
        return 0.0;
    }
    
    public final double getPressureMb() {
        return 0.0;
    }
    
    public final double getTempC() {
        return 0.0;
    }
    
    public final double getTempF() {
        return 0.0;
    }
    
    public final double getUv() {
        return 0.0;
    }
    
    public final double getVisKm() {
        return 0.0;
    }
    
    public final double getVisMiles() {
        return 0.0;
    }
    
    public final int getWindDegree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindDir() {
        return null;
    }
    
    public final double getWindKph() {
        return 0.0;
    }
    
    public final double getWindMph() {
        return 0.0;
    }
    
    public CurrentWeatherEntry(int cloud, @org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.entity.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdated, int lastUpdatedEpoch, double precipIn, double precipMm, double pressureIn, double pressureMb, double tempC, double tempF, double uv, double visKm, double visMiles, int windDegree, @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, double windKph, double windMph) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.eindwerk.data.db.entity.Condition component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.eindwerk.data.db.entity.CurrentWeatherEntry copy(int cloud, @org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.entity.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdated, int lastUpdatedEpoch, double precipIn, double precipMm, double pressureIn, double pressureMb, double tempC, double tempF, double uv, double visKm, double visMiles, int windDegree, @org.jetbrains.annotations.NotNull()
    java.lang.String windDir, double windKph, double windMph) {
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