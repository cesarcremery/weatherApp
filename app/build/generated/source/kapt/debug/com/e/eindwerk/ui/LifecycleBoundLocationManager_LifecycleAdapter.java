package com.e.eindwerk.ui;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class LifecycleBoundLocationManager_LifecycleAdapter implements GeneratedAdapter {
  final LifecycleBoundLocationManager mReceiver;

  LifecycleBoundLocationManager_LifecycleAdapter(LifecycleBoundLocationManager receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_RESUME) {
      if (!hasLogger || logger.approveCall("startLocationUpdates", 1)) {
        mReceiver.startLocationUpdates();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_PAUSE) {
      if (!hasLogger || logger.approveCall("removeLocationUpdates", 1)) {
        mReceiver.removeLocationUpdates();
      }
      return;
    }
  }
}
