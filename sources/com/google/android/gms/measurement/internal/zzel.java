package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

public final class zzel<T extends Context & zzep> {
    /* renamed from: a */
    private final T f10783a;

    public zzel(T t) {
        Preconditions.checkNotNull(t);
        this.f10783a = t;
    }

    /* renamed from: a */
    public final void m12380a() {
        zzbt a = zzbt.m22702a(this.f10783a, null);
        zzap r = a.mo3172r();
        a.mo3173u();
        r.m28555x().m12354a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void m12384b() {
        zzbt a = zzbt.m22702a(this.f10783a, null);
        zzap r = a.mo3172r();
        a.mo3173u();
        r.m28555x().m12354a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: a */
    public final int m12378a(Intent intent, int i, int i2) {
        i = zzbt.m22702a(this.f10783a, null);
        zzap r = i.mo3172r();
        if (intent == null) {
            r.m28540i().m12354a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        i.mo3173u();
        r.m28555x().m12356a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action) != 0) {
            m12376a(new bw(this, i2, r, intent));
        }
        return 2;
    }

    /* renamed from: a */
    private final void m12376a(Runnable runnable) {
        zzfa a = zzfa.m22757a(this.f10783a);
        a.mo3171q().m28568a(new by(this, a, runnable));
    }

    /* renamed from: a */
    public final IBinder m12379a(Intent intent) {
        if (intent == null) {
            m12377c().v_().m12354a("onBind called with null intent");
            return null;
        }
        intent = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(intent)) {
            return new zzbv(zzfa.m22757a(this.f10783a));
        }
        m12377c().m28540i().m12355a("onBind received unknown action", intent);
        return null;
    }

    /* renamed from: b */
    public final boolean m12385b(Intent intent) {
        if (intent == null) {
            m12377c().v_().m12354a("onUnbind called with null intent");
            return true;
        }
        m12377c().m28555x().m12355a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean m12383a(JobParameters jobParameters) {
        zzbt a = zzbt.m22702a(this.f10783a, null);
        zzap r = a.mo3172r();
        String string = jobParameters.getExtras().getString("action");
        a.mo3173u();
        r.m28555x().m12355a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m12376a(new bx(this, r, jobParameters));
        }
        return true;
    }

    /* renamed from: c */
    public final void m12386c(Intent intent) {
        if (intent == null) {
            m12377c().v_().m12354a("onRebind called with null intent");
            return;
        }
        m12377c().m28555x().m12355a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    private final zzap m12377c() {
        return zzbt.m22702a(this.f10783a, null).mo3172r();
    }

    /* renamed from: a */
    final /* synthetic */ void m12382a(zzap zzap, JobParameters jobParameters) {
        zzap.m28555x().m12354a("AppMeasurementJobService processed last upload request.");
        ((zzep) this.f10783a).mo3166a(jobParameters, false);
    }

    /* renamed from: a */
    final /* synthetic */ void m12381a(int i, zzap zzap, Intent intent) {
        if (((zzep) this.f10783a).mo3168a(i)) {
            zzap.m28555x().m12355a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m12377c().m28555x().m12354a("Completed wakeful intent.");
            ((zzep) this.f10783a).mo3167a(intent);
        }
    }
}
