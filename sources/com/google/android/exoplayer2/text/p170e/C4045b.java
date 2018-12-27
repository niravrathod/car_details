package com.google.android.exoplayer2.text.p170e;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.e.b */
final class C4045b implements C2348d {
    /* renamed from: a */
    public static final C4045b f16274a = new C4045b();
    /* renamed from: b */
    private final List<C2333a> f16275b;

    /* renamed from: a */
    public int mo1678a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public int mo1680b() {
        return 1;
    }

    public C4045b(C2333a c2333a) {
        this.f16275b = Collections.singletonList(c2333a);
    }

    private C4045b() {
        this.f16275b = Collections.emptyList();
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        C2163a.m7916a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        return j >= 0 ? this.f16275b : Collections.emptyList();
    }
}
