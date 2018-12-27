package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzbj;
import com.google.android.gms.measurement.internal.zzbm;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements zzbm {
    /* renamed from: a */
    private zzbj f17554a;

    /* renamed from: a */
    public final void mo3165a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f17554a == null) {
            this.f17554a = new zzbj(this);
        }
        this.f17554a.m12373a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo3164a() {
        return goAsync();
    }
}
