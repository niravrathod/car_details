package com.google.android.gms.internal.measurement;

import java.util.List;

final class by extends bv {
    private by() {
        super();
    }

    /* renamed from: a */
    final <L> List<L> mo3050a(Object obj, long j) {
        List<L> c = m22324c(obj, j);
        if (c.mo2923a()) {
            return c;
        }
        int size = c.size();
        Object a = c.mo4339a(size == 0 ? 10 : size << 1);
        dp.m11751a(obj, j, a);
        return a;
    }

    /* renamed from: b */
    final void mo3052b(Object obj, long j) {
        m22324c(obj, j).mo2924b();
    }

    /* renamed from: a */
    final <E> void mo3051a(Object obj, Object obj2, long j) {
        zzvs c = m22324c(obj, j);
        obj2 = m22324c(obj2, j);
        int size = c.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo2923a()) {
                c = c.mo4339a(size2 + size);
            }
            c.addAll(obj2);
        }
        if (size > 0) {
            obj2 = c;
        }
        dp.m11751a(obj, j, obj2);
    }

    /* renamed from: c */
    private static <E> zzvs<E> m22324c(Object obj, long j) {
        return (zzvs) dp.m11773f(obj, j);
    }
}
