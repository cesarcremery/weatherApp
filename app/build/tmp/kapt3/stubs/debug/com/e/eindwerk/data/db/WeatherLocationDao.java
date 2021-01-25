package com.e.eindwerk.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Lcom/e/eindwerk/data/db/WeatherLocationDao;", "", "getLocation", "Landroidx/lifecycle/LiveData;", "Lcom/e/eindwerk/data/db/entity/WeatherLocation;", "getLocationNonLive", "upsert", "", "weatherLocation", "app_debug"})
public abstract interface WeatherLocationDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    com.e.eindwerk.data.db.entity.WeatherLocation weatherLocation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weather_location WHERE id = 0")
    public abstract androidx.lifecycle.LiveData<com.e.eindwerk.data.db.entity.WeatherLocation> getLocation();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from weather_location where id = 0")
    public abstract com.e.eindwerk.data.db.entity.WeatherLocation getLocationNonLive();
}