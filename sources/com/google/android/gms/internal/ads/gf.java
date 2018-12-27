package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class gf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8093a;
    /* renamed from: b */
    private final /* synthetic */ String f8094b;
    /* renamed from: c */
    private final /* synthetic */ int f8095c;
    /* renamed from: d */
    private final /* synthetic */ zzarr f8096d;

    gf(zzarr zzarr, String str, String str2, int i) {
        this.f8096d = zzarr;
        this.f8093a = str;
        this.f8094b = str2;
        this.f8095c = i;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f8093a);
        hashMap.put("cachedSrc", this.f8094b);
        hashMap.put("totalBytes", Integer.toString(this.f8095c));
        this.f8096d.m21366a("onPrecacheEvent", hashMap);
    }
}
