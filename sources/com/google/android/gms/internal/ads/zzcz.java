package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzcz extends zzbj<Integer, Object> {
    /* renamed from: a */
    public Long f17140a;
    /* renamed from: b */
    public Boolean f17141b;
    /* renamed from: c */
    public Boolean f17142c;

    public zzcz(String str) {
        mo2434a(str);
    }

    /* renamed from: a */
    protected final void mo2434a(String str) {
        str = zzbj.m10464b(str);
        if (str != null) {
            this.f17140a = (Long) str.get(Integer.valueOf(0));
            this.f17141b = (Boolean) str.get(Integer.valueOf(1));
            this.f17142c = (Boolean) str.get(Integer.valueOf(2));
        }
    }

    /* renamed from: a */
    protected final HashMap<Integer, Object> mo2433a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f17140a);
        hashMap.put(Integer.valueOf(1), this.f17141b);
        hashMap.put(Integer.valueOf(2), this.f17142c);
        return hashMap;
    }
}
