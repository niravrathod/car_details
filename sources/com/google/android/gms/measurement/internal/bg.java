package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class bg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzh f10497a;
    /* renamed from: b */
    private final /* synthetic */ zzdr f10498b;

    bg(zzdr zzdr, zzh zzh) {
        this.f10498b = zzdr;
        this.f10497a = zzh;
    }

    public final void run() {
        zzag d = this.f10498b.f21656b;
        if (d == null) {
            this.f10498b.mo3172r().v_().m12354a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo3186a(this.f10497a);
            this.f10498b.m29676a(d, null, this.f10497a);
            this.f10498b.m29657I();
        } catch (RemoteException e) {
            this.f10498b.mo3172r().v_().m12355a("Failed to send app launch to the service", e);
        }
    }
}
