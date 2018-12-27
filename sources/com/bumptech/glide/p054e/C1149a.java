package com.bumptech.glide.p054e;

import com.bumptech.glide.load.C1194a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.a */
public class C1149a {
    /* renamed from: a */
    private final List<C1148a<?>> f3768a = new ArrayList();

    /* renamed from: com.bumptech.glide.e.a$a */
    private static final class C1148a<T> {
        /* renamed from: a */
        final C1194a<T> f3766a;
        /* renamed from: b */
        private final Class<T> f3767b;

        C1148a(Class<T> cls, C1194a<T> c1194a) {
            this.f3767b = cls;
            this.f3766a = c1194a;
        }

        /* renamed from: a */
        boolean m4795a(Class<?> cls) {
            return this.f3767b.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> C1194a<T> m4796a(Class<T> cls) {
        for (C1148a c1148a : this.f3768a) {
            if (c1148a.m4795a(cls)) {
                return c1148a.f3766a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void m4797a(Class<T> cls, C1194a<T> c1194a) {
        this.f3768a.add(new C1148a(cls, c1194a));
    }
}
