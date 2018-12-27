package com.google.android.exoplayer2.p125b;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.b.g */
public final class C2158g {
    /* renamed from: a */
    public final int f6683a;
    /* renamed from: b */
    private final C2157f[] f6684b;
    /* renamed from: c */
    private int f6685c;

    public C2158g(C2157f... c2157fArr) {
        this.f6684b = c2157fArr;
        this.f6683a = c2157fArr.length;
    }

    /* renamed from: a */
    public C2157f m7904a(int i) {
        return this.f6684b[i];
    }

    /* renamed from: a */
    public C2157f[] m7905a() {
        return (C2157f[]) this.f6684b.clone();
    }

    public int hashCode() {
        if (this.f6685c == 0) {
            this.f6685c = 527 + Arrays.hashCode(this.f6684b);
        }
        return this.f6685c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f6684b, ((C2158g) obj).f6684b);
            }
        }
        return null;
    }
}
