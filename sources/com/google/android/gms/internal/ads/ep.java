package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class ep implements Runnable {
    /* renamed from: a */
    private final zzaou f8026a;
    /* renamed from: b */
    private final zzapi f8027b;

    ep(zzaou zzaou, zzapi zzapi) {
        this.f8026a = zzaou;
        this.f8027b = zzapi;
    }

    public final void run() {
        Throwable cause;
        zzaou zzaou = this.f8026a;
        try {
            zzaou.mo1936a(this.f8027b.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            zzaou.mo1937a(cause);
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            zzaou.mo1937a(cause);
        } catch (Exception e3) {
            cause = e3;
            zzaou.mo1937a(cause);
        }
    }
}
