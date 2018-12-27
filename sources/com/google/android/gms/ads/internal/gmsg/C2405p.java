package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaok;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.p */
final class C2405p implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ JSONObject f7692a;
    /* renamed from: b */
    private final /* synthetic */ C2404o f7693b;

    C2405p(C2404o c2404o, JSONObject jSONObject) {
        this.f7693b = c2404o;
        this.f7692a = jSONObject;
    }

    public final void run() {
        this.f7693b.f7689a.mo2748a("fetchHttpRequestCompleted", this.f7692a);
        zzaok.m10001b("Dispatched http response.");
    }
}
