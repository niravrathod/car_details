package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzda extends zzbj<Integer, Long> {
    /* renamed from: a */
    public Long f17143a;
    /* renamed from: b */
    public Long f17144b;

    public zzda(String str) {
        mo2434a(str);
    }

    /* renamed from: a */
    protected final void mo2434a(String str) {
        str = zzbj.m10464b(str);
        if (str != null) {
            this.f17143a = (Long) str.get(Integer.valueOf(0));
            this.f17144b = (Long) str.get(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo2433a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f17143a);
        hashMap.put(Integer.valueOf(1), this.f17144b);
        return hashMap;
    }
}
