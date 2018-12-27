package com.google.android.exoplayer2.text.p135f;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.c */
final class C4048c implements C2348d {
    /* renamed from: a */
    private final List<C2333a> f16276a;

    /* renamed from: a */
    public int mo1678a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public int mo1680b() {
        return 1;
    }

    public C4048c(List<C2333a> list) {
        this.f16276a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        C2163a.m7916a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        return j >= 0 ? this.f16276a : Collections.emptyList();
    }
}
