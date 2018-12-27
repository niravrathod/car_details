package com.facebook.ads.internal.p095n;

/* renamed from: com.facebook.ads.internal.n.l */
public enum C1843l {
    HEIGHT_100(-1, 100),
    HEIGHT_120(-1, 120),
    HEIGHT_300(-1, 300),
    HEIGHT_400(-1, 400);
    
    /* renamed from: e */
    private final int f5633e;
    /* renamed from: f */
    private final int f5634f;

    private C1843l(int i, int i2) {
        this.f5633e = i;
        this.f5634f = i2;
    }

    /* renamed from: a */
    public int m7032a() {
        int i = this.f5634f;
        return i != 100 ? i != 120 ? i != 300 ? i != 400 ? -1 : 4 : 3 : 2 : 1;
    }
}
