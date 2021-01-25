package com.e.eindwerk.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDatabase_Impl extends ForecastDatabase {
  private volatile CurrentWeatherDao _currentWeatherDao;

  private volatile WeatherLocationDao _weatherLocationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `current_weather` (`id` INTEGER NOT NULL, `cloud` INTEGER NOT NULL, `feelslikeC` REAL NOT NULL, `feelslikeF` REAL NOT NULL, `gustKph` REAL NOT NULL, `gustMph` REAL NOT NULL, `humidity` INTEGER NOT NULL, `isDay` INTEGER NOT NULL, `lastUpdated` TEXT NOT NULL, `lastUpdatedEpoch` INTEGER NOT NULL, `precipIn` REAL NOT NULL, `precipMm` REAL NOT NULL, `pressureIn` REAL NOT NULL, `pressureMb` REAL NOT NULL, `tempC` REAL NOT NULL, `tempF` REAL NOT NULL, `uv` REAL NOT NULL, `visKm` REAL NOT NULL, `visMiles` REAL NOT NULL, `windDegree` INTEGER NOT NULL, `windDir` TEXT NOT NULL, `windKph` REAL NOT NULL, `windMph` REAL NOT NULL, `condition_code` INTEGER NOT NULL, `condition_icon` TEXT NOT NULL, `condition_text` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `weather_location` (`id` INTEGER NOT NULL, `country` TEXT NOT NULL, `lat` REAL NOT NULL, `localtime` TEXT NOT NULL, `localtimeEpoch` INTEGER NOT NULL, `lon` REAL NOT NULL, `name` TEXT NOT NULL, `region` TEXT NOT NULL, `tzId` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4ba0c1923b2e37630a49db918c2f9e27')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `current_weather`");
        _db.execSQL("DROP TABLE IF EXISTS `weather_location`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(26);
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("cloud", new TableInfo.Column("cloud", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("feelslikeC", new TableInfo.Column("feelslikeC", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("feelslikeF", new TableInfo.Column("feelslikeF", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("gustKph", new TableInfo.Column("gustKph", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("gustMph", new TableInfo.Column("gustMph", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("isDay", new TableInfo.Column("isDay", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("lastUpdated", new TableInfo.Column("lastUpdated", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("lastUpdatedEpoch", new TableInfo.Column("lastUpdatedEpoch", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("precipIn", new TableInfo.Column("precipIn", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("precipMm", new TableInfo.Column("precipMm", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pressureIn", new TableInfo.Column("pressureIn", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pressureMb", new TableInfo.Column("pressureMb", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempC", new TableInfo.Column("tempC", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempF", new TableInfo.Column("tempF", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("uv", new TableInfo.Column("uv", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("visKm", new TableInfo.Column("visKm", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("visMiles", new TableInfo.Column("visMiles", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("windDegree", new TableInfo.Column("windDegree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("windDir", new TableInfo.Column("windDir", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("windKph", new TableInfo.Column("windKph", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("windMph", new TableInfo.Column("windMph", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("condition_code", new TableInfo.Column("condition_code", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("condition_icon", new TableInfo.Column("condition_icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("condition_text", new TableInfo.Column("condition_text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("current_weather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(_db, "current_weather");
        if (! _infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "current_weather(com.e.eindwerk.data.db.entity.CurrentWeatherEntry).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        final HashMap<String, TableInfo.Column> _columnsWeatherLocation = new HashMap<String, TableInfo.Column>(9);
        _columnsWeatherLocation.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("lat", new TableInfo.Column("lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("localtime", new TableInfo.Column("localtime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("localtimeEpoch", new TableInfo.Column("localtimeEpoch", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("lon", new TableInfo.Column("lon", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("region", new TableInfo.Column("region", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherLocation.put("tzId", new TableInfo.Column("tzId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherLocation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherLocation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherLocation = new TableInfo("weather_location", _columnsWeatherLocation, _foreignKeysWeatherLocation, _indicesWeatherLocation);
        final TableInfo _existingWeatherLocation = TableInfo.read(_db, "weather_location");
        if (! _infoWeatherLocation.equals(_existingWeatherLocation)) {
          return new RoomOpenHelper.ValidationResult(false, "weather_location(com.e.eindwerk.data.db.entity.WeatherLocation).\n"
                  + " Expected:\n" + _infoWeatherLocation + "\n"
                  + " Found:\n" + _existingWeatherLocation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4ba0c1923b2e37630a49db918c2f9e27", "fbbe40ec6aa4f96a7d755e0ee6a871ac");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "current_weather","weather_location");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `current_weather`");
      _db.execSQL("DELETE FROM `weather_location`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentWeatherDao.class, CurrentWeatherDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WeatherLocationDao.class, WeatherLocationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CurrentWeatherDao currentWeatherDao() {
    if (_currentWeatherDao != null) {
      return _currentWeatherDao;
    } else {
      synchronized(this) {
        if(_currentWeatherDao == null) {
          _currentWeatherDao = new CurrentWeatherDao_Impl(this);
        }
        return _currentWeatherDao;
      }
    }
  }

  @Override
  public WeatherLocationDao weatherLocationDao() {
    if (_weatherLocationDao != null) {
      return _weatherLocationDao;
    } else {
      synchronized(this) {
        if(_weatherLocationDao == null) {
          _weatherLocationDao = new WeatherLocationDao_Impl(this);
        }
        return _weatherLocationDao;
      }
    }
  }
}
