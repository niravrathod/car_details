package com.bumptech.glide.load.p057a;

import com.bumptech.glide.load.p057a.C1190e.C1189a;
import com.bumptech.glide.p055g.C1178i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.f */
public class C1191f {
    /* renamed from: b */
    private static final C1189a<?> f3863b = new C33821();
    /* renamed from: a */
    private final Map<Class<?>, C1189a<?>> f3864a = new HashMap();

    /* renamed from: com.bumptech.glide.load.a.f$1 */
    class C33821 implements C1189a<Object> {
        C33821() {
        }

        /* renamed from: a */
        public C1190e<Object> mo964a(Object obj) {
            return new C3383a(obj);
        }

        /* renamed from: a */
        public Class<Object> mo965a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.a.f$a */
    private static final class C3383a implements C1190e<Object> {
        /* renamed from: a */
        private final Object f14269a;

        /* renamed from: b */
        public void mo967b() {
        }

        C3383a(Object obj) {
            this.f14269a = obj;
        }

        /* renamed from: a */
        public Object mo966a() {
            return this.f14269a;
        }
    }

    /* renamed from: a */
    public synchronized void m4938a(C1189a<?> c1189a) {
        this.f3864a.put(c1189a.mo965a(), c1189a);
    }

    /* renamed from: a */
    public synchronized <T> C1190e<T> m4937a(T t) {
        C1189a c1189a;
        C1178i.m4880a((Object) t);
        c1189a = (C1189a) this.f3864a.get(t.getClass());
        if (c1189a == null) {
            for (C1189a c1189a2 : this.f3864a.values()) {
                if (c1189a2.mo965a().isAssignableFrom(t.getClass())) {
                    c1189a = c1189a2;
                    break;
                }
            }
        }
        if (c1189a == null) {
            c1189a = f3863b;
        }
        return c1189a.mo964a(t);
    }
}
