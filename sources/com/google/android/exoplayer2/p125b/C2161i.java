package com.google.android.exoplayer2.p125b;

import com.google.android.exoplayer2.C2307n;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2327i;

/* renamed from: com.google.android.exoplayer2.b.i */
public final class C2161i {
    /* renamed from: a */
    public final C2327i f6687a;
    /* renamed from: b */
    public final C2158g f6688b;
    /* renamed from: c */
    public final Object f6689c;
    /* renamed from: d */
    public final C2307n[] f6690d;

    public C2161i(C2327i c2327i, C2158g c2158g, Object obj, C2307n[] c2307nArr) {
        this.f6687a = c2327i;
        this.f6688b = c2158g;
        this.f6689c = obj;
        this.f6690d = c2307nArr;
    }

    /* renamed from: a */
    public boolean m7909a(C2161i c2161i) {
        if (c2161i == null) {
            return false;
        }
        for (int i = 0; i < this.f6688b.f6683a; i++) {
            if (!m7910a(c2161i, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m7910a(C2161i c2161i, int i) {
        boolean z = false;
        if (c2161i == null) {
            return false;
        }
        if (C2186s.m8052a(this.f6688b.m7904a(i), c2161i.f6688b.m7904a(i)) && C2186s.m8052a(this.f6690d[i], c2161i.f6690d[i]) != null) {
            z = true;
        }
        return z;
    }
}
