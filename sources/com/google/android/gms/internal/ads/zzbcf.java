package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public abstract class zzbcf {
    /* renamed from: a */
    int f9097a;
    /* renamed from: b */
    int f9098b;
    /* renamed from: c */
    ks f9099c;
    /* renamed from: d */
    private int f9100d;
    /* renamed from: e */
    private boolean f9101e;

    /* renamed from: a */
    public static long m10279a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static zzbcf m10280a(byte[] bArr, int i, int i2) {
        return m10281a(bArr, i, i2, false);
    }

    /* renamed from: g */
    public static int m10282g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo1973a();

    /* renamed from: a */
    public abstract <T extends zzbel> T mo1974a(zzbew<T> zzbew, zzbcq zzbcq);

    /* renamed from: a */
    public abstract void mo1975a(int i);

    /* renamed from: b */
    public abstract double mo1976b();

    /* renamed from: b */
    public abstract boolean mo1977b(int i);

    /* renamed from: c */
    public abstract float mo1978c();

    /* renamed from: d */
    public abstract int mo1979d(int i);

    /* renamed from: d */
    public abstract long mo1980d();

    /* renamed from: e */
    public abstract long mo1981e();

    /* renamed from: e */
    public abstract void mo1982e(int i);

    /* renamed from: f */
    public abstract int mo1983f();

    /* renamed from: f */
    public abstract void mo1984f(int i);

    /* renamed from: g */
    public abstract long mo1985g();

    /* renamed from: h */
    public abstract int mo1986h();

    /* renamed from: i */
    public abstract boolean mo1987i();

    /* renamed from: j */
    public abstract String mo1988j();

    /* renamed from: k */
    public abstract String mo1989k();

    /* renamed from: l */
    public abstract zzbbu mo1990l();

    /* renamed from: m */
    public abstract int mo1991m();

    /* renamed from: n */
    public abstract int mo1992n();

    /* renamed from: o */
    public abstract int mo1993o();

    /* renamed from: p */
    public abstract long mo1994p();

    /* renamed from: q */
    public abstract int mo1995q();

    /* renamed from: r */
    public abstract long mo1996r();

    /* renamed from: s */
    abstract long mo1997s();

    /* renamed from: t */
    public abstract boolean mo1998t();

    /* renamed from: u */
    public abstract int mo1999u();

    /* renamed from: a */
    static zzbcf m10281a(byte[] bArr, int i, int i2, boolean z) {
        zzbcf krVar = new kr(bArr, i, i2, z, null);
        try {
            krVar.mo1979d(i2);
            return krVar;
        } catch (byte[] bArr2) {
            throw new IllegalArgumentException(bArr2);
        }
    }

    private zzbcf() {
        this.f9098b = 100;
        this.f9100d = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9101e = false;
    }

    /* renamed from: c */
    public final int m10289c(int i) {
        if (i >= 0) {
            int i2 = this.f9098b;
            this.f9098b = i;
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Recursion limit cannot be negative: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
