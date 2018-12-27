package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzbj;
import com.google.android.gms.measurement.internal.zzbm;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzbm {
    /* renamed from: a */
    private zzbj f17556a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f17556a == null) {
            this.f17556a = new zzbj(this);
        }
        this.f17556a.m12373a(context, intent);
    }

    /* renamed from: a */
    public final void mo3165a(Context context, Intent intent) {
        WakefulBroadcastReceiver.a_(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo3164a() {
        return goAsync();
    }
}
