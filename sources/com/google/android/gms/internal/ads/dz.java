package com.google.android.gms.internal.ads;

import java.util.Map;

final class dz extends zzaw {
    /* renamed from: a */
    private final /* synthetic */ byte[] f19632a;
    /* renamed from: b */
    private final /* synthetic */ Map f19633b;
    /* renamed from: c */
    private final /* synthetic */ zzaoe f19634c;

    dz(zzamz zzamz, int i, String str, zzz zzz, zzy zzy, byte[] bArr, Map map, zzaoe zzaoe) {
        this.f19632a = bArr;
        this.f19633b = map;
        this.f19634c = zzaoe;
        super(i, str, zzz, zzy);
    }

    /* renamed from: a */
    public final byte[] mo4154a() {
        return this.f19632a == null ? super.mo4154a() : this.f19632a;
    }

    /* renamed from: b */
    public final Map<String, String> mo4155b() {
        return this.f19633b == null ? super.mo4155b() : this.f19633b;
    }

    /* renamed from: a */
    protected final void mo4153a(String str) {
        this.f19634c.m9992a(str);
        super.mo4153a(str);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo2370a(Object obj) {
        mo4153a((String) obj);
    }
}
