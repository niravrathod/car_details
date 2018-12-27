package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.k */
public final class C2276k {
    /* renamed from: a */
    public static final C2276k f7224a = new C2276k(1.0f, 1.0f);
    /* renamed from: b */
    public final float f7225b;
    /* renamed from: c */
    public final float f7226c;
    /* renamed from: d */
    private final int f7227d;

    public C2276k(float f, float f2) {
        this.f7225b = f;
        this.f7226c = f2;
        this.f7227d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long m8360a(long j) {
        return j * ((long) this.f7227d);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2276k c2276k = (C2276k) obj;
                if (this.f7225b != c2276k.f7225b || this.f7226c != c2276k.f7226c) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f7225b)) * 31) + Float.floatToRawIntBits(this.f7226c);
    }
}
