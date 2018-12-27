package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final /* synthetic */ class ae implements Runnable {
    /* renamed from: a */
    private final zzadm f7900a;
    /* renamed from: b */
    private final boolean f7901b;
    /* renamed from: c */
    private final JSONObject f7902c;
    /* renamed from: d */
    private final zzaps f7903d;

    ae(zzadm zzadm, boolean z, JSONObject jSONObject, zzaps zzaps) {
        this.f7900a = zzadm;
        this.f7901b = z;
        this.f7902c = jSONObject;
        this.f7903d = zzaps;
    }

    public final void run() {
        this.f7900a.m9493a(this.f7901b, this.f7902c, this.f7903d);
    }
}
