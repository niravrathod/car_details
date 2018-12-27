package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class wn implements Callable<zzye> {
    /* renamed from: a */
    private final /* synthetic */ zzyb f8470a;
    /* renamed from: b */
    private final /* synthetic */ zzyh f8471b;

    wn(zzyh zzyh, zzyb zzyb) {
        this.f8471b = zzyh;
        this.f8470a = zzyb;
    }

    /* renamed from: a */
    private final zzye m9405a() {
        synchronized (this.f8471b.f17365i) {
            if (this.f8471b.f17366j) {
                return null;
            }
            return this.f8470a.m21998a(this.f8471b.f17362f, this.f8471b.f17363g);
        }
    }

    public final /* synthetic */ Object call() {
        return m9405a();
    }
}
