package com.bumptech.glide.load;

import com.bumptech.glide.p055g.C1178i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.d */
public final class C1218d<T> {
    /* renamed from: a */
    private static final C1217a<Object> f3899a = new C34511();
    /* renamed from: b */
    private final T f3900b;
    /* renamed from: c */
    private final C1217a<T> f3901c;
    /* renamed from: d */
    private final String f3902d;
    /* renamed from: e */
    private volatile byte[] f3903e;

    /* renamed from: com.bumptech.glide.load.d$a */
    public interface C1217a<T> {
        /* renamed from: a */
        void mo988a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    /* renamed from: com.bumptech.glide.load.d$1 */
    class C34511 implements C1217a<Object> {
        /* renamed from: a */
        public void mo988a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }

        C34511() {
        }
    }

    /* renamed from: a */
    public static <T> C1218d<T> m4987a(String str) {
        return new C1218d(str, null, C1218d.m4991c());
    }

    /* renamed from: a */
    public static <T> C1218d<T> m4988a(String str, T t) {
        return new C1218d(str, t, C1218d.m4991c());
    }

    /* renamed from: a */
    public static <T> C1218d<T> m4989a(String str, T t, C1217a<T> c1217a) {
        return new C1218d(str, t, c1217a);
    }

    private C1218d(String str, T t, C1217a<T> c1217a) {
        this.f3902d = C1178i.m4882a(str);
        this.f3900b = t;
        this.f3901c = (C1217a) C1178i.m4880a((Object) c1217a);
    }

    /* renamed from: a */
    public T m4992a() {
        return this.f3900b;
    }

    /* renamed from: a */
    public void m4993a(T t, MessageDigest messageDigest) {
        this.f3901c.mo988a(m4990b(), t, messageDigest);
    }

    /* renamed from: b */
    private byte[] m4990b() {
        if (this.f3903e == null) {
            this.f3903e = this.f3902d.getBytes(C1216c.f3898a);
        }
        return this.f3903e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1218d)) {
            return null;
        }
        return this.f3902d.equals(((C1218d) obj).f3902d);
    }

    public int hashCode() {
        return this.f3902d.hashCode();
    }

    /* renamed from: c */
    private static <T> C1217a<T> m4991c() {
        return f3899a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Option{key='");
        stringBuilder.append(this.f3902d);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
