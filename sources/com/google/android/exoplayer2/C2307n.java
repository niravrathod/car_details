package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.n */
public final class C2307n {
    /* renamed from: a */
    public static final C2307n f7264a = new C2307n(0);
    /* renamed from: b */
    public final int f7265b;

    public C2307n(int i) {
        this.f7265b = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                if (this.f7265b != ((C2307n) obj).f7265b) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7265b;
    }
}
