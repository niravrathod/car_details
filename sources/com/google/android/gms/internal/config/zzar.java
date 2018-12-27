package com.google.android.gms.internal.config;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

public final class zzar {
    /* renamed from: a */
    private int f9933a;
    /* renamed from: b */
    private long f9934b;
    /* renamed from: c */
    private Map<String, zzal> f9935c;
    /* renamed from: d */
    private boolean f9936d;

    public zzar() {
        this(-1);
    }

    private zzar(int i, long j, Map<String, zzal> map, boolean z) {
        this.f9933a = 0;
        this.f9934b = -1;
        this.f9935c = new HashMap();
        this.f9936d = false;
    }

    @VisibleForTesting
    private zzar(long j) {
        this(0, -1, null, false);
    }

    /* renamed from: a */
    public final int m11353a() {
        return this.f9933a;
    }

    /* renamed from: a */
    public final void m11354a(int i) {
        this.f9933a = i;
    }

    /* renamed from: a */
    public final void m11355a(long j) {
        this.f9934b = j;
    }

    /* renamed from: a */
    public final void m11356a(String str) {
        if (this.f9935c.get(str) != null) {
            this.f9935c.remove(str);
        }
    }

    /* renamed from: a */
    public final void m11357a(String str, zzal zzal) {
        this.f9935c.put(str, zzal);
    }

    /* renamed from: a */
    public final void m11358a(Map<String, zzal> map) {
        this.f9935c = map;
    }

    /* renamed from: a */
    public final void m11359a(boolean z) {
        this.f9936d = z;
    }

    /* renamed from: b */
    public final boolean m11360b() {
        return this.f9936d;
    }

    /* renamed from: c */
    public final Map<String, zzal> m11361c() {
        return this.f9935c;
    }

    /* renamed from: d */
    public final long m11362d() {
        return this.f9934b;
    }
}
