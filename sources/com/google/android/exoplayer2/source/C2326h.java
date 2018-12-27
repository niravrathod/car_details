package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p126c.C2163a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.h */
public final class C2326h {
    /* renamed from: a */
    public final int f7295a;
    /* renamed from: b */
    private final Format[] f7296b;
    /* renamed from: c */
    private int f7297c;

    public C2326h(Format... formatArr) {
        C2163a.m7918b(formatArr.length > 0);
        this.f7296b = formatArr;
        this.f7295a = formatArr.length;
    }

    /* renamed from: a */
    public Format m8489a(int i) {
        return this.f7296b[i];
    }

    /* renamed from: a */
    public int m8488a(Format format) {
        for (int i = 0; i < this.f7296b.length; i++) {
            if (format == this.f7296b[i]) {
                return i;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f7297c == 0) {
            this.f7297c = 527 + Arrays.hashCode(this.f7296b);
        }
        return this.f7297c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2326h c2326h = (C2326h) obj;
                if (this.f7295a != c2326h.f7295a || Arrays.equals(this.f7296b, c2326h.f7296b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }
}
