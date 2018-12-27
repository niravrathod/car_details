package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzco extends zzbj<Integer, Long> {
    /* renamed from: a */
    public long f17138a;
    /* renamed from: b */
    public long f17139b;

    public zzco() {
        this.f17138a = -1;
        this.f17139b = -1;
    }

    public zzco(String str) {
        this();
        mo2434a(str);
    }

    /* renamed from: a */
    protected final HashMap<Integer, Long> mo2433a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f17138a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f17139b));
        return hashMap;
    }

    /* renamed from: a */
    protected final void mo2434a(String str) {
        str = zzbj.m10464b(str);
        if (str != null) {
            this.f17138a = ((Long) str.get(Integer.valueOf(0))).longValue();
            this.f17139b = ((Long) str.get(Integer.valueOf(1))).longValue();
        }
    }
}
