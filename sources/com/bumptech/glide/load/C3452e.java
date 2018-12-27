package com.bumptech.glide.load;

import android.support.v4.p017f.C0433m;
import android.support.v4.p017f.C3131a;
import com.bumptech.glide.p055g.C4507b;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.e */
public final class C3452e implements C1216c {
    /* renamed from: b */
    private final C3131a<C1218d<?>, Object> f14356b = new C4507b();

    /* renamed from: a */
    public void m17524a(C3452e c3452e) {
        this.f14356b.mo3894a((C0433m) c3452e.f14356b);
    }

    /* renamed from: a */
    public <T> C3452e m17522a(C1218d<T> c1218d, T t) {
        this.f14356b.put(c1218d, t);
        return this;
    }

    /* renamed from: a */
    public <T> T m17523a(C1218d<T> c1218d) {
        return this.f14356b.containsKey(c1218d) ? this.f14356b.get(c1218d) : c1218d.m4992a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3452e)) {
            return null;
        }
        return this.f14356b.equals(((C3452e) obj).f14356b);
    }

    public int hashCode() {
        return this.f14356b.hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f14356b.size(); i++) {
            C3452e.m17521a((C1218d) this.f14356b.m1585b(i), this.f14356b.m1586c(i), messageDigest);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Options{values=");
        stringBuilder.append(this.f14356b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static <T> void m17521a(C1218d<T> c1218d, Object obj, MessageDigest messageDigest) {
        c1218d.m4993a(obj, messageDigest);
    }
}
