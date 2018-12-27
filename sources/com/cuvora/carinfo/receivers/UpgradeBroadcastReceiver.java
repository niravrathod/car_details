package com.cuvora.carinfo.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1570t;

public class UpgradeBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.d("UpgradeBroadcast", "onReceive called");
        C1540d.m5818b(C1570t.m6004c(context), C1570t.m5994b(context).intValue());
    }
}
