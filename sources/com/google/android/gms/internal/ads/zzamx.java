package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzamx {
    /* renamed from: a */
    public final String f8909a;
    /* renamed from: b */
    public final double f8910b;
    /* renamed from: c */
    public final int f8911c;
    /* renamed from: d */
    private final double f8912d;
    /* renamed from: e */
    private final double f8913e;

    public zzamx(String str, double d, double d2, double d3, int i) {
        this.f8909a = str;
        this.f8913e = d;
        this.f8912d = d2;
        this.f8910b = d3;
        this.f8911c = i;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f8909a).add("minBound", Double.valueOf(this.f8913e)).add("maxBound", Double.valueOf(this.f8912d)).add("percent", Double.valueOf(this.f8910b)).add("count", Integer.valueOf(this.f8911c)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzamx)) {
            return false;
        }
        zzamx zzamx = (zzamx) obj;
        if (Objects.equal(this.f8909a, zzamx.f8909a) && this.f8912d == zzamx.f8912d && this.f8913e == zzamx.f8913e && this.f8911c == zzamx.f8911c && Double.compare(this.f8910b, zzamx.f8910b) == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f8909a, Double.valueOf(this.f8912d), Double.valueOf(this.f8913e), Double.valueOf(this.f8910b), Integer.valueOf(this.f8911c));
    }
}
