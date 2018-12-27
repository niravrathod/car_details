package com.google.android.gms.internal.ads;

final class sv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpf f8381a;

    sv(zzpf zzpf) {
        this.f8381a = zzpf;
    }

    public final void run() {
        if (this.f8381a.f20312h != null) {
            this.f8381a.f20312h.mo2606l();
            this.f8381a.f20312h.mo2605k();
        }
        this.f8381a.f20312h = null;
    }
}
