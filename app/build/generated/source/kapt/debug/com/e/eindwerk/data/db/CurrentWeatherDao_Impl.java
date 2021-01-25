package com.e.eindwerk.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.e.eindwerk.data.db.entity.Condition;
import com.e.eindwerk.data.db.entity.CurrentWeatherEntry;
import com.e.eindwerk.data.db.unitlocalized.current.MetricCurrentWeatherEntry;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl implements CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentWeatherEntry> __insertionAdapterOfCurrentWeatherEntry;

  public CurrentWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentWeatherEntry = new EntityInsertionAdapter<CurrentWeatherEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `current_weather` (`id`,`cloud`,`feelslikeC`,`feelslikeF`,`gustKph`,`gustMph`,`humidity`,`isDay`,`lastUpdated`,`lastUpdatedEpoch`,`precipIn`,`precipMm`,`pressureIn`,`pressureMb`,`tempC`,`tempF`,`uv`,`visKm`,`visMiles`,`windDegree`,`windDir`,`windKph`,`windMph`,`condition_code`,`condition_icon`,`condition_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeatherEntry value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCloud());
        stmt.bindDouble(3, value.getFeelslikeC());
        stmt.bindDouble(4, value.getFeelslikeF());
        stmt.bindDouble(5, value.getGustKph());
        stmt.bindDouble(6, value.getGustMph());
        stmt.bindLong(7, value.getHumidity());
        stmt.bindLong(8, value.isDay());
        if (value.getLastUpdated() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLastUpdated());
        }
        stmt.bindLong(10, value.getLastUpdatedEpoch());
        stmt.bindDouble(11, value.getPrecipIn());
        stmt.bindDouble(12, value.getPrecipMm());
        stmt.bindDouble(13, value.getPressureIn());
        stmt.bindDouble(14, value.getPressureMb());
        stmt.bindDouble(15, value.getTempC());
        stmt.bindDouble(16, value.getTempF());
        stmt.bindDouble(17, value.getUv());
        stmt.bindDouble(18, value.getVisKm());
        stmt.bindDouble(19, value.getVisMiles());
        stmt.bindLong(20, value.getWindDegree());
        if (value.getWindDir() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getWindDir());
        }
        stmt.bindDouble(22, value.getWindKph());
        stmt.bindDouble(23, value.getWindMph());
        final Condition _tmpCondition = value.getCondition();
        if(_tmpCondition != null) {
          stmt.bindLong(24, _tmpCondition.getCode());
          if (_tmpCondition.getIcon() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindString(25, _tmpCondition.getIcon());
          }
          if (_tmpCondition.getText() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpCondition.getText());
          }
        } else {
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
        }
      }
    };
  }

  @Override
  public void upsert(final CurrentWeatherEntry weatherEntry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrentWeatherEntry.insert(weatherEntry);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<MetricCurrentWeatherEntry> getWeatherMetric() {
    final String _sql = "SELECT * FROM current_weather WHERE id=0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"current_weather"}, false, new Callable<MetricCurrentWeatherEntry>() {
      @Override
      public MetricCurrentWeatherEntry call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFeelsLikeTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslikeC");
          final int _cursorIndexOfPrecipitationVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "precipMm");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "tempC");
          final int _cursorIndexOfVisibilityDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "visKm");
          final int _cursorIndexOfWindDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "windDir");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windKph");
          final int _cursorIndexOfConditionIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_icon");
          final int _cursorIndexOfConditionText = CursorUtil.getColumnIndexOrThrow(_cursor, "condition_text");
          final MetricCurrentWeatherEntry _result;
          if(_cursor.moveToFirst()) {
            final double _tmpFeelsLikeTemperature;
            _tmpFeelsLikeTemperature = _cursor.getDouble(_cursorIndexOfFeelsLikeTemperature);
            final double _tmpPrecipitationVolume;
            _tmpPrecipitationVolume = _cursor.getDouble(_cursorIndexOfPrecipitationVolume);
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final double _tmpVisibilityDistance;
            _tmpVisibilityDistance = _cursor.getDouble(_cursorIndexOfVisibilityDistance);
            final String _tmpWindDirection;
            _tmpWindDirection = _cursor.getString(_cursorIndexOfWindDirection);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpConditionIconUrl;
            _tmpConditionIconUrl = _cursor.getString(_cursorIndexOfConditionIconUrl);
            final String _tmpConditionText;
            _tmpConditionText = _cursor.getString(_cursorIndexOfConditionText);
            _result = new MetricCurrentWeatherEntry(_tmpTemperature,_tmpConditionText,_tmpConditionIconUrl,_tmpWindSpeed,_tmpWindDirection,_tmpPrecipitationVolume,_tmpFeelsLikeTemperature,_tmpVisibilityDistance);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
