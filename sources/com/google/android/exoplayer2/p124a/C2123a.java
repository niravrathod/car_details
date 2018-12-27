package com.google.android.exoplayer2.p124a;

/* renamed from: com.google.android.exoplayer2.a.a */
public abstract class C2123a {
    /* renamed from: a */
    private int f6510a;

    /* renamed from: a */
    public void mo1520a() {
        this.f6510a = 0;
    }

    public final boolean l_() {
        return m7764d(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean m7762c() {
        return m7764d(4);
    }

    /* renamed from: d */
    public final boolean m7763d() {
        return m7764d(1);
    }

    public final void a_(int i) {
        this.f6510a = i;
    }

    /* renamed from: b */
    public final void m7760b(int i) {
        this.f6510a = i | this.f6510a;
    }

    /* renamed from: c */
    public final void m7761c(int i) {
        this.f6510a = (i ^ -1) & this.f6510a;
    }

    /* renamed from: d */
    protected final boolean m7764d(int i) {
        return (this.f6510a & i) == i;
    }
}
