package com.e.eindwerk.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/e/eindwerk/data/db/LocalDateConverter;", "", "()V", "dateToString", "", "dateTime", "Lorg/threeten/bp/LocalDate;", "stringToDate", "str", "app_debug"})
public final class LocalDateConverter {
    public static final com.e.eindwerk.data.db.LocalDateConverter INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final org.threeten.bp.LocalDate stringToDate(@org.jetbrains.annotations.Nullable()
    java.lang.String str) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.lang.String dateToString(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.LocalDate dateTime) {
        return null;
    }
    
    private LocalDateConverter() {
        super();
    }
}