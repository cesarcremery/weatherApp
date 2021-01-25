package com.e.eindwerk.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.e.eindwerk.data.db.entity.WeatherLocation;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherLocationDao_Impl implements WeatherLocationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherLocation> __insertionAdapterOfWeatherLocation;

  public WeatherLocationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherLocation = new EntityInsertionAdapter<WeatherLocation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `weather_location` (`id`,`country`,`lat`,`localtime`,`localtimeEpoch`,`lon`,`name`,`region`,`tzId`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherLocation value) {
        stmt.bindLong(1, value.getId());
        if (value.getCountry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountry());
        }
        stmt.bindDouble(3, value.getLat());
        if (value.getLocaltime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLocaltime());
        }
        stmt.bindLong(5, value.getLocaltimeEpoch());
        stmt.bindDouble(6, value.getLon());
        if (value.getName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getName());
        }
        if (value.getRegion() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRegion());
        }
        if (value.getTzId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTzId());
        }
      }
    };
  }

  @Override
  public void upsert(final WeatherLocation weatherLocation) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherLocation.insert(weatherLocation);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<WeatherLocation> getLocation() {
    final String _sql = "SELECT * FROM weather_location WHERE id = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"weather_location"}, false, new Callable<WeatherLocation>() {
      @Override
      public WeatherLocation call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLocaltime = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime");
          final int _cursorIndexOfLocaltimeEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "localtimeEpoch");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
          final int _cursorIndexOfTzId = CursorUtil.getColumnIndexOrThrow(_cursor, "tzId");
          final WeatherLocation _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final double _tmpLat;
            _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            final String _tmpLocaltime;
            _tmpLocaltime = _cursor.getString(_cursorIndexOfLocaltime);
            final long _tmpLocaltimeEpoch;
            _tmpLocaltimeEpoch = _cursor.getLong(_cursorIndexOfLocaltimeEpoch);
            final double _tmpLon;
            _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpRegion;
            _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
            final String _tmpTzId;
            _tmpTzId = _cursor.getString(_cursorIndexOfTzId);
            _result = new WeatherLocation(_tmpCountry,_tmpLat,_tmpLocaltime,_tmpLocaltimeEpoch,_tmpLon,_tmpName,_tmpRegion,_tmpTzId);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public WeatherLocation getLocationNonLive() {
    final String _sql = "select * from weather_location where id = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
      final int _cursorIndexOfLocaltime = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime");
      final int _cursorIndexOfLocaltimeEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "localtimeEpoch");
      final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final int _cursorIndexOfTzId = CursorUtil.getColumnIndexOrThrow(_cursor, "tzId");
      final WeatherLocation _result;
      if(_cursor.moveToFirst()) {
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        final double _tmpLat;
        _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
        final String _tmpLocaltime;
        _tmpLocaltime = _cursor.getString(_cursorIndexOfLocaltime);
        final long _tmpLocaltimeEpoch;
        _tmpLocaltimeEpoch = _cursor.getLong(_cursorIndexOfLocaltimeEpoch);
        final double _tmpLon;
        _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        final String _tmpTzId;
        _tmpTzId = _cursor.getString(_cursorIndexOfTzId);
        _result = new WeatherLocation(_tmpCountry,_tmpLat,_tmpLocaltime,_tmpLocaltimeEpoch,_tmpLon,_tmpName,_tmpRegion,_tmpTzId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
