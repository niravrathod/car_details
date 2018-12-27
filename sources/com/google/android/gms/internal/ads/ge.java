package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class ge implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8087a;
    /* renamed from: b */
    private final /* synthetic */ String f8088b;
    /* renamed from: c */
    private final /* synthetic */ int f8089c;
    /* renamed from: d */
    private final /* synthetic */ int f8090d;
    /* renamed from: e */
    private final /* synthetic */ boolean f8091e = null;
    /* renamed from: f */
    private final /* synthetic */ zzarr f8092f;

    ge(zzarr zzarr, String str, String str2, int i, int i2, boolean z) {
        this.f8092f = zzarr;
        this.f8087a = str;
        this.f8088b = str2;
        this.f8089c = i;
        this.f8090d = i2;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f8087a);
        hashMap.put("cachedSrc", this.f8088b);
        hashMap.put("bytesLoaded", Integer.toString(this.f8089c));
        hashMap.put("totalBytes", Integer.toString(this.f8090d));
        hashMap.put("cacheReady", this.f8091e ? "1" : "0");
        this.f8092f.m21366a("onPrecacheEvent", hashMap);
    }
}
