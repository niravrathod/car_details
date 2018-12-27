package com.google.android.gms.internal.ads;

import android.os.Bundle;

@zzaer
public final class zzuz {
    /* renamed from: a */
    private static zzuz f9797a = new zzuz();
    /* renamed from: b */
    private int f9798b;
    /* renamed from: c */
    private int f9799c;
    /* renamed from: d */
    private int f9800d;
    /* renamed from: e */
    private int f9801e;
    /* renamed from: f */
    private int f9802f;

    /* renamed from: a */
    public static zzuz m11133a() {
        return f9797a;
    }

    /* renamed from: a */
    final void m11134a(int i) {
        this.f9798b += i;
    }

    /* renamed from: b */
    final void m11135b() {
        this.f9799c++;
    }

    /* renamed from: c */
    final void m11136c() {
        this.f9800d++;
    }

    /* renamed from: d */
    final void m11137d() {
        this.f9801e++;
    }

    /* renamed from: e */
    final void m11138e() {
        this.f9802f++;
    }

    /* renamed from: f */
    public final int m11139f() {
        return this.f9799c;
    }

    /* renamed from: g */
    public final int m11140g() {
        return this.f9800d;
    }

    /* renamed from: h */
    public final int m11141h() {
        return this.f9801e;
    }

    /* renamed from: i */
    public final int m11142i() {
        return this.f9802f;
    }

    /* renamed from: j */
    public final Bundle m11143j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f9798b);
        bundle.putInt("ipds", this.f9799c);
        bundle.putInt("ipde", this.f9800d);
        bundle.putInt("iph", this.f9801e);
        bundle.putInt("ipm", this.f9802f);
        return bundle;
    }
}
