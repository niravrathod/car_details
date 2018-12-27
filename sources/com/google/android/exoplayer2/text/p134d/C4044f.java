package com.google.android.exoplayer2.text.p134d;

import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.d.f */
final class C4044f implements C2348d {
    /* renamed from: a */
    private final C2344b f16270a;
    /* renamed from: b */
    private final long[] f16271b;
    /* renamed from: c */
    private final Map<String, C2347e> f16272c;
    /* renamed from: d */
    private final Map<String, C2345c> f16273d;

    public C4044f(C2344b c2344b, Map<String, C2347e> map, Map<String, C2345c> map2) {
        this.f16270a = c2344b;
        this.f16273d = map2;
        this.f16272c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f16271b = c2344b.m8559b();
    }

    /* renamed from: a */
    public int mo1678a(long j) {
        j = C2186s.m8056b(this.f16271b, j, false, false);
        return j < this.f16271b.length ? j : -1;
    }

    /* renamed from: b */
    public int mo1680b() {
        return this.f16271b.length;
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        return this.f16271b[i];
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        return this.f16270a.m8556a(j, this.f16272c, this.f16273d);
    }
}
