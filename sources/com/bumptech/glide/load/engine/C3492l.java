package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.p055g.C1178i;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.l */
class C3492l implements C1216c {
    /* renamed from: b */
    private final Object f14493b;
    /* renamed from: c */
    private final int f14494c;
    /* renamed from: d */
    private final int f14495d;
    /* renamed from: e */
    private final Class<?> f14496e;
    /* renamed from: f */
    private final Class<?> f14497f;
    /* renamed from: g */
    private final C1216c f14498g;
    /* renamed from: h */
    private final Map<Class<?>, C3500h<?>> f14499h;
    /* renamed from: i */
    private final C3452e f14500i;
    /* renamed from: j */
    private int f14501j;

    C3492l(Object obj, C1216c c1216c, int i, int i2, Map<Class<?>, C3500h<?>> map, Class<?> cls, Class<?> cls2, C3452e c3452e) {
        this.f14493b = C1178i.m4880a(obj);
        this.f14498g = (C1216c) C1178i.m4881a((Object) c1216c, "Signature must not be null");
        this.f14494c = i;
        this.f14495d = i2;
        this.f14499h = (Map) C1178i.m4880a((Object) map);
        this.f14496e = (Class) C1178i.m4881a((Object) cls, "Resource class must not be null");
        this.f14497f = (Class) C1178i.m4881a((Object) cls2, "Transcode class must not be null");
        this.f14500i = (C3452e) C1178i.m4880a((Object) c3452e);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3492l)) {
            return false;
        }
        C3492l c3492l = (C3492l) obj;
        if (this.f14493b.equals(c3492l.f14493b) && this.f14498g.equals(c3492l.f14498g) && this.f14495d == c3492l.f14495d && this.f14494c == c3492l.f14494c && this.f14499h.equals(c3492l.f14499h) && this.f14496e.equals(c3492l.f14496e) && this.f14497f.equals(c3492l.f14497f) && this.f14500i.equals(c3492l.f14500i) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        if (this.f14501j == 0) {
            this.f14501j = this.f14493b.hashCode();
            this.f14501j = (this.f14501j * 31) + this.f14498g.hashCode();
            this.f14501j = (this.f14501j * 31) + this.f14494c;
            this.f14501j = (this.f14501j * 31) + this.f14495d;
            this.f14501j = (this.f14501j * 31) + this.f14499h.hashCode();
            this.f14501j = (this.f14501j * 31) + this.f14496e.hashCode();
            this.f14501j = (this.f14501j * 31) + this.f14497f.hashCode();
            this.f14501j = (this.f14501j * 31) + this.f14500i.hashCode();
        }
        return this.f14501j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EngineKey{model=");
        stringBuilder.append(this.f14493b);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f14494c);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f14495d);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(this.f14496e);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(this.f14497f);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14498g);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.f14501j);
        stringBuilder.append(", transformations=");
        stringBuilder.append(this.f14499h);
        stringBuilder.append(", options=");
        stringBuilder.append(this.f14500i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
