package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzel;
import com.google.android.gms.measurement.internal.zzep;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzep {
    /* renamed from: a */
    private zzel<AppMeasurementJobService> f17555a;

    /* renamed from: a */
    private final zzel<AppMeasurementJobService> m22652a() {
        if (this.f17555a == null) {
            this.f17555a = new zzel(this);
        }
        return this.f17555a;
    }

    /* renamed from: a */
    public final void mo3167a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m22652a().m12380a();
    }

    public final void onDestroy() {
        m22652a().m12384b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m22652a().m12383a(jobParameters);
    }

    public final boolean onUnbind(Intent intent) {
        return m22652a().m12385b(intent);
    }

    public final void onRebind(Intent intent) {
        m22652a().m12386c(intent);
    }

    /* renamed from: a */
    public final boolean mo3168a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo3166a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
