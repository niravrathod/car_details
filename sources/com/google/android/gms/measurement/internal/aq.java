package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class aq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10447a;
    /* renamed from: b */
    private final /* synthetic */ zzcs f10448b;

    public final void run() {
        synchronized (this.f10447a) {
            try {
                this.f10447a.set(Boolean.valueOf(this.f10448b.mo4400t().m27355h(this.f10448b.mo4843g().m29471x())));
                this.f10447a.notify();
            } catch (Throwable th) {
                this.f10447a.notify();
            }
        }
    }
}
