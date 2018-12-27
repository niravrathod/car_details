package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class bh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzdn f10499a;
    /* renamed from: b */
    private final /* synthetic */ zzdr f10500b;

    bh(zzdr zzdr, zzdn zzdn) {
        this.f10500b = zzdr;
        this.f10499a = zzdn;
    }

    public final void run() {
        zzag d = this.f10500b.f21656b;
        if (d == null) {
            this.f10500b.mo3172r().v_().m12354a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f10499a == null) {
                d.mo3182a(0, null, null, this.f10500b.mo3170n().getPackageName());
            } else {
                d.mo3182a(this.f10499a.f10781c, this.f10499a.f10779a, this.f10499a.f10780b, this.f10500b.mo3170n().getPackageName());
            }
            this.f10500b.m29657I();
        } catch (RemoteException e) {
            this.f10500b.mo3172r().v_().m12355a("Failed to send current screen to the service", e);
        }
    }
}
