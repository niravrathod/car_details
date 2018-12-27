package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.b */
public class C0982b {
    /* renamed from: a */
    public final String f3258a;
    /* renamed from: b */
    public final String f3259b;
    /* renamed from: c */
    public final double f3260c;
    /* renamed from: d */
    final int f3261d;
    /* renamed from: e */
    public final int f3262e;
    /* renamed from: f */
    final double f3263f;
    /* renamed from: g */
    public final double f3264g;
    /* renamed from: h */
    public final int f3265h;
    /* renamed from: i */
    public final int f3266i;
    /* renamed from: j */
    public final int f3267j;
    /* renamed from: k */
    public final boolean f3268k;

    public C0982b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.f3258a = str;
        this.f3259b = str2;
        this.f3260c = d;
        this.f3261d = i;
        this.f3262e = i2;
        this.f3263f = d2;
        this.f3264g = d3;
        this.f3265h = i3;
        this.f3266i = i4;
        this.f3267j = i5;
        this.f3268k = z;
    }

    public int hashCode() {
        double hashCode = (double) (((this.f3258a.hashCode() * 31) + this.f3259b.hashCode()) * 31);
        double d = this.f3260c;
        Double.isNaN(hashCode);
        int i = (((((int) (hashCode + d)) * 31) + this.f3261d) * 31) + this.f3262e;
        long doubleToLongBits = Double.doubleToLongBits(this.f3263f);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f3265h;
    }
}
