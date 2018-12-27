package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

@zzaer
public final class zzanm {
    /* renamed from: a */
    private HandlerThread f8921a = null;
    /* renamed from: b */
    private Handler f8922b = null;
    /* renamed from: c */
    private int f8923c = 0;
    /* renamed from: d */
    private final Object f8924d = new Object();

    /* renamed from: a */
    public final Looper m9925a() {
        Looper looper;
        synchronized (this.f8924d) {
            if (this.f8923c != 0) {
                Preconditions.checkNotNull(this.f8921a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f8921a == null) {
                zzalg.m21225a("Starting the looper thread.");
                this.f8921a = new HandlerThread("LooperProvider");
                this.f8921a.start();
                this.f8922b = new Handler(this.f8921a.getLooper());
                zzalg.m21225a("Looper thread started.");
            } else {
                zzalg.m21225a("Resuming the looper thread");
                this.f8924d.notifyAll();
            }
            this.f8923c++;
            looper = this.f8921a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public final Handler m9926b() {
        return this.f8922b;
    }
}
