package com.google.android.exoplayer2.extractor.p131f;

/* renamed from: com.google.android.exoplayer2.extractor.f.b */
final class C2256b {
    /* renamed from: a */
    private final int f7162a;
    /* renamed from: b */
    private final int f7163b;
    /* renamed from: c */
    private final int f7164c;
    /* renamed from: d */
    private final int f7165d;
    /* renamed from: e */
    private final int f7166e;
    /* renamed from: f */
    private final int f7167f;
    /* renamed from: g */
    private long f7168g;
    /* renamed from: h */
    private long f7169h;

    public C2256b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f7162a = i;
        this.f7163b = i2;
        this.f7164c = i3;
        this.f7165d = i4;
        this.f7166e = i5;
        this.f7167f = i6;
    }

    /* renamed from: a */
    public long m8289a() {
        return ((this.f7169h / ((long) this.f7165d)) * 1000000) / ((long) this.f7163b);
    }

    /* renamed from: b */
    public int m8292b() {
        return this.f7165d;
    }

    /* renamed from: c */
    public int m8294c() {
        return (this.f7163b * this.f7166e) * this.f7162a;
    }

    /* renamed from: d */
    public int m8295d() {
        return this.f7163b;
    }

    /* renamed from: e */
    public int m8296e() {
        return this.f7162a;
    }

    /* renamed from: a */
    public long m8290a(long j) {
        return Math.min((((j * ((long) this.f7164c)) / 1000000) / ((long) this.f7165d)) * ((long) this.f7165d), this.f7169h - ((long) this.f7165d)) + this.f7168g;
    }

    /* renamed from: b */
    public long m8293b(long j) {
        return (j * 1000000) / ((long) this.f7164c);
    }

    /* renamed from: f */
    public boolean m8297f() {
        return (this.f7168g == 0 || this.f7169h == 0) ? false : true;
    }

    /* renamed from: a */
    public void m8291a(long j, long j2) {
        this.f7168g = j;
        this.f7169h = j2;
    }

    /* renamed from: g */
    public int m8298g() {
        return this.f7167f;
    }
}
