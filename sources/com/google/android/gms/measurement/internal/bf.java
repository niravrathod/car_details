package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class bf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10494a;
    /* renamed from: b */
    private final /* synthetic */ zzh f10495b;
    /* renamed from: c */
    private final /* synthetic */ zzdr f10496c;

    bf(zzdr zzdr, AtomicReference atomicReference, zzh zzh) {
        this.f10496c = zzdr;
        this.f10494a = atomicReference;
        this.f10495b = zzh;
    }

    public final void run() {
        synchronized (this.f10494a) {
            try {
                zzag d = this.f10496c.f21656b;
                if (d == null) {
                    this.f10496c.mo3172r().v_().m12354a("Failed to get app instance id");
                    this.f10494a.notify();
                    return;
                }
                this.f10494a.set(d.mo3191c(this.f10495b));
                String str = (String) this.f10494a.get();
                if (str != null) {
                    this.f10496c.mo4842f().m29581a(str);
                    this.f10496c.mo4399s().f21390j.m12367a(str);
                }
                this.f10496c.m29657I();
                this.f10494a.notify();
            } catch (RemoteException e) {
                try {
                    this.f10496c.mo3172r().v_().m12355a("Failed to get app instance id", e);
                    this.f10494a.notify();
                } catch (Throwable th) {
                    this.f10494a.notify();
                }
            }
        }
    }
}
