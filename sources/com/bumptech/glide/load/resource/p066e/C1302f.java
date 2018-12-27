package com.bumptech.glide.load.resource.p066e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.e.f */
public class C1302f {
    /* renamed from: a */
    private final List<C1301a<?, ?>> f4098a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.e.f$a */
    private static final class C1301a<Z, R> {
        /* renamed from: a */
        final C1300e<Z, R> f4095a;
        /* renamed from: b */
        private final Class<Z> f4096b;
        /* renamed from: c */
        private final Class<R> f4097c;

        C1301a(Class<Z> cls, Class<R> cls2, C1300e<Z, R> c1300e) {
            this.f4096b = cls;
            this.f4097c = cls2;
            this.f4095a = c1300e;
        }

        /* renamed from: a */
        public boolean m5252a(Class<?> cls, Class<?> cls2) {
            return (this.f4096b.isAssignableFrom(cls) == null || cls2.isAssignableFrom(this.f4097c) == null) ? null : true;
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> void m5254a(Class<Z> cls, Class<R> cls2, C1300e<Z, R> c1300e) {
        this.f4098a.add(new C1301a(cls, cls2, c1300e));
    }

    /* renamed from: a */
    public synchronized <Z, R> C1300e<Z, R> m5253a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C3543g.m17924a();
        }
        for (C1301a c1301a : this.f4098a) {
            if (c1301a.m5252a(cls, cls2)) {
                return c1301a.f4095a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No transcoder registered to transcode from ");
        stringBuilder.append(cls);
        stringBuilder.append(" to ");
        stringBuilder.append(cls2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m5255b(Class<Z> cls, Class<R> cls2) {
        List<Class<R>> arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1301a a : this.f4098a) {
            if (a.m5252a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
