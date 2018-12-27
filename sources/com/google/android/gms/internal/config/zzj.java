package com.google.android.gms.internal.config;

import java.util.HashMap;
import java.util.Map;

public final class zzj {
    /* renamed from: a */
    private long f9983a = 43200;
    /* renamed from: b */
    private Map<String, String> f9984b;
    /* renamed from: c */
    private int f9985c;
    /* renamed from: d */
    private int f9986d = -1;
    /* renamed from: e */
    private int f9987e = -1;
    /* renamed from: f */
    private String f9988f;

    /* renamed from: a */
    public final zzi m11441a() {
        return new zzi();
    }

    /* renamed from: a */
    public final zzj m11442a(int i) {
        this.f9985c = 10300;
        return this;
    }

    /* renamed from: a */
    public final zzj m11443a(long j) {
        this.f9983a = j;
        return this;
    }

    /* renamed from: a */
    public final zzj m11444a(String str) {
        this.f9988f = str;
        return this;
    }

    /* renamed from: a */
    public final zzj m11445a(String str, String str2) {
        if (this.f9984b == null) {
            this.f9984b = new HashMap();
        }
        this.f9984b.put(str, str2);
        return this;
    }

    /* renamed from: b */
    public final zzj m11446b(int i) {
        this.f9986d = i;
        return this;
    }

    /* renamed from: c */
    public final zzj m11447c(int i) {
        this.f9987e = i;
        return this;
    }
}
