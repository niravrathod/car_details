package com.google.android.gms.internal.measurement;

public abstract class zzzg {
    /* renamed from: K */
    protected volatile int f10364K = -1;

    /* renamed from: a */
    public abstract zzzg mo4347a(zzyx zzyx);

    /* renamed from: a */
    public void mo3160a(zzyy zzyy) {
    }

    /* renamed from: b */
    protected int mo3161b() {
        return 0;
    }

    /* renamed from: d */
    public final int m12202d() {
        if (this.f10364K < 0) {
            m12203e();
        }
        return this.f10364K;
    }

    /* renamed from: e */
    public final int m12203e() {
        int b = mo3161b();
        this.f10364K = b;
        return b;
    }

    public String toString() {
        return zzzh.m12204a(this);
    }

    /* renamed from: c */
    public zzzg mo3162c() {
        return (zzzg) super.clone();
    }

    public /* synthetic */ Object clone() {
        return mo3162c();
    }
}
