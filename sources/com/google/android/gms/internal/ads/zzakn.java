package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@zzaer
public final class zzakn {
    /* renamed from: a */
    public final zzafp f8806a;
    /* renamed from: b */
    public final zzaft f8807b;
    /* renamed from: c */
    public final zzxy f8808c;
    /* renamed from: d */
    public final zzjo f8809d;
    /* renamed from: e */
    public final int f8810e;
    /* renamed from: f */
    public final long f8811f;
    /* renamed from: g */
    public final long f8812g;
    /* renamed from: h */
    public final JSONObject f8813h;
    /* renamed from: i */
    public final zzhv f8814i;
    /* renamed from: j */
    public final boolean f8815j;

    public zzakn(zzafp zzafp, zzaft zzaft, zzxy zzxy, zzjo zzjo, int i, long j, long j2, JSONObject jSONObject, zzia zzia) {
        this.f8806a = zzafp;
        this.f8807b = zzaft;
        this.f8808c = null;
        this.f8809d = null;
        this.f8810e = i;
        this.f8811f = j;
        this.f8812g = j2;
        this.f8813h = null;
        this.f8814i = new zzhv(zzia);
        this.f8815j = null;
    }

    public zzakn(zzafp zzafp, zzaft zzaft, zzxy zzxy, zzjo zzjo, int i, long j, long j2, JSONObject jSONObject, zzhv zzhv, Boolean bool) {
        this.f8806a = zzafp;
        this.f8807b = zzaft;
        this.f8808c = zzxy;
        this.f8809d = zzjo;
        this.f8810e = i;
        this.f8811f = j;
        this.f8812g = j2;
        this.f8813h = jSONObject;
        this.f8814i = zzhv;
        if (bool != null) {
            this.f8815j = bool.booleanValue();
        } else {
            this.f8815j = zzans.m9935a(zzafp.f19735c.f20218m);
        }
    }
}
