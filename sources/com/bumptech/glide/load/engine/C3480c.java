package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.c */
final class C3480c implements C1216c {
    /* renamed from: b */
    private final C1216c f14450b;
    /* renamed from: c */
    private final C1216c f14451c;

    C3480c(C1216c c1216c, C1216c c1216c2) {
        this.f14450b = c1216c;
        this.f14451c = c1216c2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3480c)) {
            return false;
        }
        C3480c c3480c = (C3480c) obj;
        if (this.f14450b.equals(c3480c.f14450b) && this.f14451c.equals(c3480c.f14451c) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (this.f14450b.hashCode() * 31) + this.f14451c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataCacheKey{sourceKey=");
        stringBuilder.append(this.f14450b);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14451c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        this.f14450b.mo950a(messageDigest);
        this.f14451c.mo950a(messageDigest);
    }
}
