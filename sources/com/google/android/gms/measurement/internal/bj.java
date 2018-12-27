package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class bj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzh f10501a;
    /* renamed from: b */
    private final /* synthetic */ zzdr f10502b;

    bj(zzdr zzdr, zzh zzh) {
        this.f10502b = zzdr;
        this.f10501a = zzh;
    }

    public final void run() {
        zzag d = this.f10502b.f21656b;
        if (d == null) {
            this.f10502b.mo3172r().v_().m12354a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo3190b(this.f10501a);
            this.f10502b.m29657I();
        } catch (RemoteException e) {
            this.f10502b.mo3172r().v_().m12355a("Failed to send measurementEnabled to the service", e);
        }
    }
}
