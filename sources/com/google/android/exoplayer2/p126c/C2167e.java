package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.e */
public final class C2167e {
    /* renamed from: a */
    public final int f6704a;
    /* renamed from: b */
    public final int f6705b;
    /* renamed from: c */
    public final int f6706c;
    /* renamed from: d */
    public final int f6707d;
    /* renamed from: e */
    public final int f6708e;
    /* renamed from: f */
    public final int f6709f;
    /* renamed from: g */
    public final int f6710g;
    /* renamed from: h */
    public final long f6711h;

    public C2167e(byte[] bArr, int i) {
        C2174j c2174j = new C2174j(bArr);
        c2174j.m7960a(i * 8);
        this.f6704a = c2174j.m7966c(16);
        this.f6705b = c2174j.m7966c(16);
        this.f6706c = c2174j.m7966c(24);
        this.f6707d = c2174j.m7966c(24);
        this.f6708e = c2174j.m7966c(20);
        this.f6709f = c2174j.m7966c(3) + 1;
        this.f6710g = c2174j.m7966c(5) + 1;
        this.f6711h = (long) c2174j.m7966c(36);
    }

    /* renamed from: a */
    public int m7933a() {
        return this.f6710g * this.f6708e;
    }

    /* renamed from: b */
    public long m7934b() {
        return (this.f6711h * 1000000) / ((long) this.f6708e);
    }
}
