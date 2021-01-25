package com.e.eindwerk.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/e/eindwerk/data/db/CurrentWeatherDao;", "", "getWeatherMetric", "Landroidx/lifecycle/LiveData;", "Lcom/e/eindwerk/data/db/unitlocalized/current/MetricCurrentWeatherEntry;", "upsert", "", "weatherEntry", "Lcom/e/eindwerk/data/db/entity/CurrentWeatherEntry;", "app_debug"})
public abstract interface CurrentWeatherDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.entity.CurrentWeatherEntry weatherEntry);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM current_weather WHERE id=0")
    public abstract androidx.lifecycle.LiveData<com.e.eindwerk.data.db.unitlocalized.current.MetricCurrentWeatherEntry> getWeatherMetric();
}