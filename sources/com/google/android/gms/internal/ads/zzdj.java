package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdj extends zzbj<Integer, Long> {
    /* renamed from: a */
    public Long f17156a;
    /* renamed from: b */
    public Long f17157b;
    /* renamed from: c */
    public Long f17158c;

    public zzdj(String str) {
        mo2434a(str);
    }

    /* renamed from: a */
    protected final void mo2434a(String str) {
        str = zzbj.m10464b(str);
        if (str != null) {
            this.f17156a = (Long) str.get(Integer.valueOf(0));
            this.f17157b = (Long) str.get(Integer.valueOf(1));
            this.f17158c = (Long) str.get(Integer.valueOf(2));
        }
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo2433a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f17156a);
        hashMap.put(Integer.valueOf(1), this.f17157b);
        hashMap.put(Integer.valueOf(2), this.f17158c);
        return hashMap;
    }
}
