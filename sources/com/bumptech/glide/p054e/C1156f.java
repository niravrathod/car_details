package com.bumptech.glide.p054e;

import com.bumptech.glide.load.C3499g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.f */
public class C1156f {
    /* renamed from: a */
    private final List<C1155a<?>> f3782a = new ArrayList();

    /* renamed from: com.bumptech.glide.e.f$a */
    private static final class C1155a<T> {
        /* renamed from: a */
        final C3499g<T> f3780a;
        /* renamed from: b */
        private final Class<T> f3781b;

        C1155a(Class<T> cls, C3499g<T> c3499g) {
            this.f3781b = cls;
            this.f3780a = c3499g;
        }

        /* renamed from: a */
        boolean m4812a(Class<?> cls) {
            return this.f3781b.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m4814a(Class<Z> cls, C3499g<Z> c3499g) {
        this.f3782a.add(new C1155a(cls, c3499g));
    }

    /* renamed from: a */
    public synchronized <Z> C3499g<Z> m4813a(Class<Z> cls) {
        int size = this.f3782a.size();
        for (int i = 0; i < size; i++) {
            C1155a c1155a = (C1155a) this.f3782a.get(i);
            if (c1155a.m4812a(cls)) {
                return c1155a.f3780a;
            }
        }
        return null;
    }
}
