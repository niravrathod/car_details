package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class ad implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f7896a;
    /* renamed from: b */
    private final /* synthetic */ int f7897b;
    /* renamed from: c */
    private final /* synthetic */ zzaps f7898c;
    /* renamed from: d */
    private final /* synthetic */ List f7899d;

    ad(AtomicInteger atomicInteger, int i, zzaps zzaps, List list) {
        this.f7896a = atomicInteger;
        this.f7897b = i;
        this.f7898c = zzaps;
        this.f7899d = list;
    }

    public final void run() {
        if (this.f7896a.incrementAndGet() >= this.f7897b) {
            try {
                this.f7898c.m21290b(zzadd.m9473b(this.f7899d));
            } catch (Throwable e) {
                zzaok.m10004c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
