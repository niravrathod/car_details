package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p124a.C3947f;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.h */
public abstract class C4695h extends C3947f implements C2348d {
    /* renamed from: c */
    private C2348d f19476c;
    /* renamed from: d */
    private long f19477d;

    /* renamed from: e */
    public abstract void mo4688e();

    /* renamed from: a */
    public void m25907a(long j, C2348d c2348d, long j2) {
        this.a = j;
        this.f19476c = c2348d;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.a;
        }
        this.f19477d = j2;
    }

    /* renamed from: b */
    public int mo1680b() {
        return this.f19476c.mo1680b();
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        return this.f19476c.mo1679a(i) + this.f19477d;
    }

    /* renamed from: a */
    public int mo1678a(long j) {
        return this.f19476c.mo1678a(j - this.f19477d);
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        return this.f19476c.mo1681b(j - this.f19477d);
    }

    /* renamed from: a */
    public void mo1520a() {
        super.mo1520a();
        this.f19476c = null;
    }
}
