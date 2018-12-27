package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class gg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8097a;
    /* renamed from: b */
    private final /* synthetic */ String f8098b;
    /* renamed from: c */
    private final /* synthetic */ String f8099c;
    /* renamed from: d */
    private final /* synthetic */ String f8100d;
    /* renamed from: e */
    private final /* synthetic */ zzarr f8101e;

    gg(zzarr zzarr, String str, String str2, String str3, String str4) {
        this.f8101e = zzarr;
        this.f8097a = str;
        this.f8098b = str2;
        this.f8099c = str3;
        this.f8100d = str4;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f8097a);
        if (!TextUtils.isEmpty(this.f8098b)) {
            hashMap.put("cachedSrc", this.f8098b);
        }
        hashMap.put("type", zzarr.m21367b(this.f8099c));
        hashMap.put("reason", this.f8099c);
        if (!TextUtils.isEmpty(this.f8100d)) {
            hashMap.put("message", this.f8100d);
        }
        this.f8101e.m21366a("onPrecacheEvent", hashMap);
    }
}
