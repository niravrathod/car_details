package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzbl extends zzbj<Integer, Object> {
    /* renamed from: a */
    public String f17113a;
    /* renamed from: b */
    public long f17114b;
    /* renamed from: c */
    public String f17115c;
    /* renamed from: d */
    public String f17116d;
    /* renamed from: e */
    public String f17117e;

    public zzbl(String str) {
        this();
        mo2434a(str);
    }

    public zzbl() {
        this.f17113a = "E";
        this.f17114b = -1;
        this.f17115c = "E";
        this.f17116d = "E";
        this.f17117e = "E";
    }

    /* renamed from: a */
    protected final void mo2434a(String str) {
        str = zzbj.m10464b(str);
        if (str != null) {
            String str2;
            long j;
            if (str.get(Integer.valueOf(0)) == null) {
                str2 = "E";
            } else {
                str2 = (String) str.get(Integer.valueOf(0));
            }
            this.f17113a = str2;
            if (str.get(Integer.valueOf(1)) == null) {
                j = -1;
            } else {
                j = ((Long) str.get(Integer.valueOf(1))).longValue();
            }
            this.f17114b = j;
            if (str.get(Integer.valueOf(2)) == null) {
                str2 = "E";
            } else {
                str2 = (String) str.get(Integer.valueOf(2));
            }
            this.f17115c = str2;
            if (str.get(Integer.valueOf(3)) == null) {
                str2 = "E";
            } else {
                str2 = (String) str.get(Integer.valueOf(3));
            }
            this.f17116d = str2;
            if (str.get(Integer.valueOf(4)) == null) {
                str = "E";
            } else {
                str = (String) str.get(Integer.valueOf(4));
            }
            this.f17117e = str;
        }
    }

    /* renamed from: a */
    protected final HashMap<Integer, Object> mo2433a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f17113a);
        hashMap.put(Integer.valueOf(4), this.f17117e);
        hashMap.put(Integer.valueOf(3), this.f17116d);
        hashMap.put(Integer.valueOf(2), this.f17115c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f17114b));
        return hashMap;
    }
}
