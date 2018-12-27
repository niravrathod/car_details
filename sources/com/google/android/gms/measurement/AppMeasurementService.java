package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzel;
import com.google.android.gms.measurement.internal.zzep;

public final class AppMeasurementService extends Service implements zzep {
    /* renamed from: a */
    private zzel<AppMeasurementService> f17557a;

    /* renamed from: a */
    private final zzel<AppMeasurementService> m22658a() {
        if (this.f17557a == null) {
            this.f17557a = new zzel(this);
        }
        return this.f17557a;
    }

    public final void onCreate() {
        super.onCreate();
        m22658a().m12380a();
    }

    public final void onDestroy() {
        m22658a().m12384b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m22658a().m12378a(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        return m22658a().m12379a(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return m22658a().m12385b(intent);
    }

    public final void onRebind(Intent intent) {
        m22658a().m12386c(intent);
    }

    /* renamed from: a */
    public final boolean mo3168a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo3166a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo3167a(Intent intent) {
        WakefulBroadcastReceiver.m1400a(intent);
    }
}
