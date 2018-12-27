package com.google.android.exoplayer2.text.p169c;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.c.b */
final class C4043b implements C2348d {
    /* renamed from: a */
    private final C2333a[] f16268a;
    /* renamed from: b */
    private final long[] f16269b;

    public C4043b(C2333a[] c2333aArr, long[] jArr) {
        this.f16268a = c2333aArr;
        this.f16269b = jArr;
    }

    /* renamed from: a */
    public int mo1678a(long j) {
        j = C2186s.m8056b(this.f16269b, j, false, false);
        return j < this.f16269b.length ? j : -1;
    }

    /* renamed from: b */
    public int mo1680b() {
        return this.f16269b.length;
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        boolean z = false;
        C2163a.m7916a(i >= 0);
        if (i < this.f16269b.length) {
            z = true;
        }
        C2163a.m7916a(z);
        return this.f16269b[i];
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        j = C2186s.m8043a(this.f16269b, j, true, false);
        if (j != -1) {
            if (this.f16268a[j] != null) {
                return Collections.singletonList(this.f16268a[j]);
            }
        }
        return Collections.emptyList();
    }
}
