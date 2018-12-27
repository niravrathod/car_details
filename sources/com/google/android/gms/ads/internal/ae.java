package com.google.android.gms.ads.internal;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.Map;
import java.util.TreeMap;

final class ae {
    /* renamed from: a */
    private final String f7642a;
    /* renamed from: b */
    private final Map<String, String> f7643b = new TreeMap();
    /* renamed from: c */
    private String f7644c;
    /* renamed from: d */
    private String f7645d;

    public ae(String str) {
        this.f7642a = str;
    }

    /* renamed from: a */
    public final String m8772a() {
        return this.f7645d;
    }

    /* renamed from: b */
    public final String m8774b() {
        return this.f7644c;
    }

    /* renamed from: c */
    public final String m8775c() {
        return this.f7642a;
    }

    /* renamed from: d */
    public final Map<String, String> m8776d() {
        return this.f7643b;
    }

    /* renamed from: a */
    public final void m8773a(zzjk zzjk, zzaop zzaop) {
        this.f7644c = zzjk.f20215j.f20246a;
        zzjk = zzjk.f20218m != null ? zzjk.f20218m.getBundle(AdMobAdapter.class.getName()) : null;
        if (zzjk != null) {
            String str = (String) zzkd.m10713e().m10897a(zznw.bQ);
            for (String str2 : zzjk.keySet()) {
                if (str.equals(str2)) {
                    this.f7645d = zzjk.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f7643b.put(str2.substring(4), zzjk.getString(str2));
                }
            }
            this.f7643b.put("SDKVersion", zzaop.f19893a);
        }
    }
}
