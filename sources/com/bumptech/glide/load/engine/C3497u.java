package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.p055g.C1175f;
import com.bumptech.glide.p055g.C1180j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.u */
final class C3497u implements C1216c {
    /* renamed from: b */
    private static final C1175f<Class<?>, byte[]> f14524b = new C1175f(50);
    /* renamed from: c */
    private final C1230b f14525c;
    /* renamed from: d */
    private final C1216c f14526d;
    /* renamed from: e */
    private final C1216c f14527e;
    /* renamed from: f */
    private final int f14528f;
    /* renamed from: g */
    private final int f14529g;
    /* renamed from: h */
    private final Class<?> f14530h;
    /* renamed from: i */
    private final C3452e f14531i;
    /* renamed from: j */
    private final C3500h<?> f14532j;

    C3497u(C1230b c1230b, C1216c c1216c, C1216c c1216c2, int i, int i2, C3500h<?> c3500h, Class<?> cls, C3452e c3452e) {
        this.f14525c = c1230b;
        this.f14526d = c1216c;
        this.f14527e = c1216c2;
        this.f14528f = i;
        this.f14529g = i2;
        this.f14532j = c3500h;
        this.f14530h = cls;
        this.f14531i = c3452e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3497u)) {
            return false;
        }
        C3497u c3497u = (C3497u) obj;
        if (this.f14529g == c3497u.f14529g && this.f14528f == c3497u.f14528f && C1180j.m4898a(this.f14532j, c3497u.f14532j) && this.f14530h.equals(c3497u.f14530h) && this.f14526d.equals(c3497u.f14526d) && this.f14527e.equals(c3497u.f14527e) && this.f14531i.equals(c3497u.f14531i) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((((this.f14526d.hashCode() * 31) + this.f14527e.hashCode()) * 31) + this.f14528f) * 31) + this.f14529g;
        if (this.f14532j != null) {
            hashCode = (hashCode * 31) + this.f14532j.hashCode();
        }
        return (((hashCode * 31) + this.f14530h.hashCode()) * 31) + this.f14531i.hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        Object obj = (byte[]) this.f14525c.mo1015b(8, byte[].class);
        ByteBuffer.wrap(obj).putInt(this.f14528f).putInt(this.f14529g).array();
        this.f14527e.mo950a(messageDigest);
        this.f14526d.mo950a(messageDigest);
        messageDigest.update(obj);
        if (this.f14532j != null) {
            this.f14532j.mo950a(messageDigest);
        }
        this.f14531i.mo950a(messageDigest);
        messageDigest.update(m17747a());
        this.f14525c.mo1014a(obj);
    }

    /* renamed from: a */
    private byte[] m17747a() {
        byte[] bArr = (byte[]) f14524b.m4873b(this.f14530h);
        if (bArr != null) {
            return bArr;
        }
        Object bytes = this.f14530h.getName().getBytes(a);
        f14524b.m4874b(this.f14530h, bytes);
        return bytes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourceCacheKey{sourceKey=");
        stringBuilder.append(this.f14526d);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14527e);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f14528f);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f14529g);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(this.f14530h);
        stringBuilder.append(", transformation='");
        stringBuilder.append(this.f14532j);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(this.f14531i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
