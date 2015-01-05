package me.vladymir.gpservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ufc25.bezerra on 05/01/15.
 */
public class BootLoadReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "BootLoaderReceiver",Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(context, MyGPService.class);
        context.startService(myIntent);
        Log.d("VLAD","SERVICE SUPPOSE TO START");

    }
}
