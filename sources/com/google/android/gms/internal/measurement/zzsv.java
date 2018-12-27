package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class zzsv {
    /* renamed from: a */
    private final String f10186a;
    /* renamed from: b */
    private final Uri f10187b;
    /* renamed from: c */
    private final String f10188c;
    /* renamed from: d */
    private final String f10189d;
    /* renamed from: e */
    private final boolean f10190e;
    /* renamed from: f */
    private final boolean f10191f;
    /* renamed from: g */
    private final boolean f10192g;

    public zzsv(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    private zzsv(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f10186a = null;
        this.f10187b = uri;
        this.f10188c = str2;
        this.f10189d = str3;
        this.f10190e = false;
        this.f10191f = false;
        this.f10192g = false;
    }

    /* renamed from: a */
    public final zzsl<Long> m11999a(String str, long j) {
        return zzsl.m11982b(this, str, j);
    }

    /* renamed from: a */
    public final zzsl<Boolean> m12001a(String str, boolean z) {
        return zzsl.m11984b(this, str, z);
    }

    /* renamed from: a */
    public final zzsl<Integer> m11998a(String str, int i) {
        return zzsl.m11981b(this, str, i);
    }

    /* renamed from: a */
    public final zzsl<Double> m11997a(String str, double d) {
        return zzsl.m11980b(this, str, d);
    }

    /* renamed from: a */
    public final zzsl<String> m12000a(String str, String str2) {
        return zzsl.m11983b(this, str, str2);
    }
}
