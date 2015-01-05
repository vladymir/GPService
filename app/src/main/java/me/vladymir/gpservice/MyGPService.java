package me.vladymir.gpservice;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by ufc25.bezerra on 05/01/15.
 */
public class MyGPService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("VLAD","MY SERVICE STARTED");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("VLAD","MY SERVICE STARTED");
        return super.onStartCommand(intent, flags, startId);
    }
}
