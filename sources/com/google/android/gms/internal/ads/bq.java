package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class bq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ JSONObject f7930a;
    /* renamed from: b */
    final /* synthetic */ String f7931b;
    /* renamed from: c */
    private final /* synthetic */ zzagk f7932c;

    bq(zzagk zzagk, JSONObject jSONObject, String str) {
        this.f7932c = zzagk;
        this.f7930a = jSONObject;
        this.f7931b = str;
    }

    public final void run() {
        this.f7932c.f19837l = zzagk.f19829d.m11175b(null);
        this.f7932c.f19837l.mo2373a(new br(this), new bs(this));
    }
}
