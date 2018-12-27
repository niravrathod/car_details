package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzv {
    /* renamed from: a */
    private final AtomicInteger f9803a;
    /* renamed from: b */
    private final Set<zzr<?>> f9804b;
    /* renamed from: c */
    private final PriorityBlockingQueue<zzr<?>> f9805c;
    /* renamed from: d */
    private final PriorityBlockingQueue<zzr<?>> f9806d;
    /* renamed from: e */
    private final zzb f9807e;
    /* renamed from: f */
    private final zzm f9808f;
    /* renamed from: g */
    private final zzaa f9809g;
    /* renamed from: h */
    private final zzn[] f9810h;
    /* renamed from: i */
    private zzd f9811i;
    /* renamed from: j */
    private final List<zzw> f9812j;

    private zzv(zzb zzb, zzm zzm, int i, zzaa zzaa) {
        this.f9803a = new AtomicInteger();
        this.f9804b = new HashSet();
        this.f9805c = new PriorityBlockingQueue();
        this.f9806d = new PriorityBlockingQueue();
        this.f9812j = new ArrayList();
        this.f9807e = zzb;
        this.f9808f = zzm;
        this.f9810h = new zzn[4];
        this.f9809g = zzaa;
    }

    private zzv(zzb zzb, zzm zzm, int i) {
        this(zzb, zzm, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    public zzv(zzb zzb, zzm zzm) {
        this(zzb, zzm, 4);
    }

    /* renamed from: a */
    public final void m11145a() {
        if (this.f9811i != null) {
            this.f9811i.m10491a();
        }
        for (zzn zzn : this.f9810h) {
            if (zzn != null) {
                zzn.m10869a();
            }
        }
        this.f9811i = new zzd(this.f9805c, this.f9806d, this.f9807e, this.f9809g);
        this.f9811i.start();
        for (int i = 0; i < this.f9810h.length; i++) {
            zzn zzn2 = new zzn(this.f9806d, this.f9808f, this.f9807e, this.f9809g);
            this.f9810h[i] = zzn2;
            zzn2.start();
        }
    }

    /* renamed from: a */
    public final <T> zzr<T> m11144a(zzr<T> zzr) {
        zzr.m11022a(this);
        synchronized (this.f9804b) {
            this.f9804b.add(zzr);
        }
        zzr.m11020a(this.f9803a.incrementAndGet());
        zzr.m11030b("add-to-queue");
        if (zzr.m11038i()) {
            this.f9805c.add(zzr);
            return zzr;
        }
        this.f9806d.add(zzr);
        return zzr;
    }

    /* renamed from: b */
    final <T> void m11146b(zzr<T> zzr) {
        synchronized (this.f9804b) {
            this.f9804b.remove(zzr);
        }
        synchronized (this.f9812j) {
            for (zzw a : this.f9812j) {
                a.m11163a(zzr);
            }
        }
    }
}
