package com.google.android.exoplayer2.text.p135f;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.i */
final class C4050i implements C2348d {
    /* renamed from: a */
    private final List<C4049e> f16279a;
    /* renamed from: b */
    private final int f16280b;
    /* renamed from: c */
    private final long[] f16281c = new long[(this.f16280b * 2)];
    /* renamed from: d */
    private final long[] f16282d;

    public C4050i(List<C4049e> list) {
        this.f16279a = list;
        this.f16280b = list.size();
        for (int i = 0; i < this.f16280b; i++) {
            C4049e c4049e = (C4049e) list.get(i);
            int i2 = i * 2;
            this.f16281c[i2] = c4049e.f16277m;
            this.f16281c[i2 + 1] = c4049e.f16278n;
        }
        this.f16282d = Arrays.copyOf(this.f16281c, this.f16281c.length);
        Arrays.sort(this.f16282d);
    }

    /* renamed from: a */
    public int mo1678a(long j) {
        j = C2186s.m8056b(this.f16282d, j, false, false);
        return j < this.f16282d.length ? j : -1;
    }

    /* renamed from: b */
    public int mo1680b() {
        return this.f16282d.length;
    }

    /* renamed from: a */
    public long mo1679a(int i) {
        boolean z = false;
        C2163a.m7916a(i >= 0);
        if (i < this.f16282d.length) {
            z = true;
        }
        C2163a.m7916a(z);
        return this.f16282d[i];
    }

    /* renamed from: b */
    public List<C2333a> mo1681b(long j) {
        CharSequence charSequence = null;
        List list = null;
        C4049e c4049e = list;
        for (int i = 0; i < this.f16280b; i++) {
            int i2 = i * 2;
            if (this.f16281c[i2] <= j && j < this.f16281c[i2 + 1]) {
                if (list == null) {
                    list = new ArrayList();
                }
                C4049e c4049e2 = (C4049e) this.f16279a.get(i);
                if (!c4049e2.m20314a()) {
                    list.add(c4049e2);
                } else if (c4049e == null) {
                    c4049e = c4049e2;
                } else if (charSequence == null) {
                    charSequence = new SpannableStringBuilder();
                    charSequence.append(c4049e.a).append("\n").append(c4049e2.a);
                } else {
                    charSequence.append("\n").append(c4049e2.a);
                }
            }
        }
        if (charSequence != null) {
            list.add(new C4049e(charSequence));
        } else if (c4049e != null) {
            list.add(c4049e);
        }
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
