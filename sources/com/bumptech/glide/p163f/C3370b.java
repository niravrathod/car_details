package com.bumptech.glide.p163f;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.p055g.C1178i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.f.b */
public final class C3370b implements C1216c {
    /* renamed from: b */
    private final Object f14240b;

    public C3370b(Object obj) {
        this.f14240b = C1178i.m4880a(obj);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ObjectKey{object=");
        stringBuilder.append(this.f14240b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3370b)) {
            return null;
        }
        return this.f14240b.equals(((C3370b) obj).f14240b);
    }

    public int hashCode() {
        return this.f14240b.hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(this.f14240b.toString().getBytes(a));
    }
}
