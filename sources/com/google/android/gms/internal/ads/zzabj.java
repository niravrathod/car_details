package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzaer
public final class zzabj {
    /* renamed from: a */
    private final zzasg f8488a;
    /* renamed from: b */
    private final boolean f8489b;
    /* renamed from: c */
    private final String f8490c;

    public zzabj(zzasg zzasg, Map<String, String> map) {
        this.f8488a = zzasg;
        this.f8490c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange") != null) {
            this.f8489b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f8489b = true;
        }
    }

    /* renamed from: a */
    public final void m9431a() {
        if (this.f8488a == null) {
            zzaok.m10007e("AdWebView is null");
            return;
        }
        int b;
        if ("portrait".equalsIgnoreCase(this.f8490c)) {
            b = zzbv.zzem().mo2365b();
        } else if ("landscape".equalsIgnoreCase(this.f8490c)) {
            b = zzbv.zzem().mo2363a();
        } else if (this.f8489b) {
            b = -1;
        } else {
            b = zzbv.zzem().mo5034c();
        }
        this.f8488a.setRequestedOrientation(b);
    }
}
