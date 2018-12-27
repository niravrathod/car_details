package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class bq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10532a;
    /* renamed from: b */
    private final /* synthetic */ zzh f10533b;
    /* renamed from: c */
    private final /* synthetic */ boolean f10534c;
    /* renamed from: d */
    private final /* synthetic */ zzdr f10535d;

    bq(zzdr zzdr, AtomicReference atomicReference, zzh zzh, boolean z) {
        this.f10535d = zzdr;
        this.f10532a = atomicReference;
        this.f10533b = zzh;
        this.f10534c = z;
    }

    public final void run() {
        synchronized (this.f10532a) {
            try {
                zzag d = this.f10535d.f21656b;
                if (d == null) {
                    this.f10535d.mo3172r().v_().m12354a("Failed to get user properties");
                    this.f10532a.notify();
                    return;
                }
                this.f10532a.set(d.mo3177a(this.f10533b, this.f10534c));
                this.f10535d.m29657I();
                this.f10532a.notify();
            } catch (RemoteException e) {
                try {
                    this.f10535d.mo3172r().v_().m12355a("Failed to get user properties", e);
                    this.f10532a.notify();
                } catch (Throwable th) {
                    this.f10532a.notify();
                }
            }
        }
    }
}
