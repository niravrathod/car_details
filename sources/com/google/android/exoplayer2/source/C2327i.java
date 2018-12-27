package com.google.android.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.i */
public final class C2327i {
    /* renamed from: a */
    public static final C2327i f7298a = new C2327i(new C2326h[0]);
    /* renamed from: b */
    public final int f7299b;
    /* renamed from: c */
    private final C2326h[] f7300c;
    /* renamed from: d */
    private int f7301d;

    public C2327i(C2326h... c2326hArr) {
        this.f7300c = c2326hArr;
        this.f7299b = c2326hArr.length;
    }

    /* renamed from: a */
    public C2326h m8491a(int i) {
        return this.f7300c[i];
    }

    /* renamed from: a */
    public int m8490a(C2326h c2326h) {
        for (int i = 0; i < this.f7299b; i++) {
            if (this.f7300c[i] == c2326h) {
                return i;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f7301d == 0) {
            this.f7301d = Arrays.hashCode(this.f7300c);
        }
        return this.f7301d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2327i c2327i = (C2327i) obj;
                if (this.f7299b != c2327i.f7299b || Arrays.equals(this.f7300c, c2327i.f7300c) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }
}
