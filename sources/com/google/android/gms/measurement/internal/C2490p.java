package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.p */
final class C2490p implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzbt f10649a;
    /* renamed from: b */
    private final /* synthetic */ long f10650b;
    /* renamed from: c */
    private final /* synthetic */ Bundle f10651c;
    /* renamed from: d */
    private final /* synthetic */ Context f10652d;
    /* renamed from: e */
    private final /* synthetic */ zzap f10653e;
    /* renamed from: f */
    private final /* synthetic */ PendingResult f10654f;

    C2490p(zzbj zzbj, zzbt zzbt, long j, Bundle bundle, Context context, zzap zzap, PendingResult pendingResult) {
        this.f10649a = zzbt;
        this.f10650b = j;
        this.f10651c = bundle;
        this.f10652d = context;
        this.f10653e = zzap;
        this.f10654f = pendingResult;
    }

    public final void run() {
        long a = this.f10649a.m22722c().f21388h.m12360a();
        long j = this.f10650b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f10651c.putLong("click_timestamp", j);
        }
        this.f10651c.putString("_cis", "referrer broadcast");
        AppMeasurement.getInstance(this.f10652d).logEventInternal("auto", "_cmp", this.f10651c);
        this.f10653e.m28555x().m12354a("Install campaign recorded");
        if (this.f10654f != null) {
            this.f10654f.finish();
        }
    }
}
