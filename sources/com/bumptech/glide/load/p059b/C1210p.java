package com.bumptech.glide.load.p059b;

import android.support.v4.p017f.C0431k.C0430a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.p */
public class C1210p {
    /* renamed from: a */
    private final C1213r f3887a;
    /* renamed from: b */
    private final C1209a f3888b;

    /* renamed from: com.bumptech.glide.load.b.p$a */
    private static class C1209a {
        /* renamed from: a */
        private final Map<Class<?>, C1208a<?>> f3886a = new HashMap();

        /* renamed from: com.bumptech.glide.load.b.p$a$a */
        private static class C1208a<Model> {
            /* renamed from: a */
            final List<C1206n<Model, ?>> f3885a;

            public C1208a(List<C1206n<Model, ?>> list) {
                this.f3885a = list;
            }
        }

        C1209a() {
        }

        /* renamed from: a */
        public void m4964a() {
            this.f3886a.clear();
        }

        /* renamed from: a */
        public <Model> void m4965a(Class<Model> cls, List<C1206n<Model, ?>> list) {
            if (((C1208a) this.f3886a.put(cls, new C1208a(list))) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Already cached loaders for model: ");
                stringBuilder.append(cls);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public <Model> List<C1206n<Model, ?>> m4963a(Class<Model> cls) {
            C1208a c1208a = (C1208a) this.f3886a.get(cls);
            if (c1208a == null) {
                return null;
            }
            return c1208a.f3885a;
        }
    }

    public C1210p(C0430a<List<Throwable>> c0430a) {
        this(new C1213r(c0430a));
    }

    private C1210p(C1213r c1213r) {
        this.f3888b = new C1209a();
        this.f3887a = c1213r;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m4970a(Class<Model> cls, Class<Data> cls2, C1207o<? extends Model, ? extends Data> c1207o) {
        this.f3887a.m4979a(cls, cls2, c1207o);
        this.f3888b.m4964a();
    }

    /* renamed from: a */
    public <A> List<C1206n<A, ?>> m4969a(A a) {
        List b = m4967b(C1210p.m4966b((Object) a));
        int size = b.size();
        List<C1206n<A, ?>> emptyList = Collections.emptyList();
        Object obj = 1;
        for (int i = 0; i < size; i++) {
            C1206n c1206n = (C1206n) b.get(i);
            if (c1206n.mo972a(a)) {
                if (obj != null) {
                    emptyList = new ArrayList(size - i);
                    obj = null;
                }
                emptyList.add(c1206n);
            }
        }
        return emptyList;
    }

    /* renamed from: a */
    public synchronized List<Class<?>> m4968a(Class<?> cls) {
        return this.f3887a.m4980b(cls);
    }

    /* renamed from: b */
    private synchronized <A> List<C1206n<A, ?>> m4967b(Class<A> cls) {
        List<C1206n<A, ?>> a;
        a = this.f3888b.m4963a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f3887a.m4978a((Class) cls));
            this.f3888b.m4965a(cls, a);
        }
        return a;
    }

    /* renamed from: b */
    private static <A> Class<A> m4966b(A a) {
        return a.getClass();
    }
}
