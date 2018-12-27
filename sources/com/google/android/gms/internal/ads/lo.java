package com.google.android.gms.internal.ads;

import java.util.List;

final class lo extends ll {
    private lo() {
        super();
    }

    /* renamed from: a */
    final <L> List<L> mo2096a(Object obj, long j) {
        List<L> c = m20744c(obj, j);
        if (c.mo1969a()) {
            return c;
        }
        int size = c.size();
        Object a = c.mo4159a(size == 0 ? 10 : size << 1);
        ng.m9230a(obj, j, a);
        return a;
    }

    /* renamed from: b */
    final void mo2098b(Object obj, long j) {
        m20744c(obj, j).mo1970b();
    }

    /* renamed from: a */
    final <E> void mo2097a(Object obj, Object obj2, long j) {
        zzbdk c = m20744c(obj, j);
        obj2 = m20744c(obj2, j);
        int size = c.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo1969a()) {
                c = c.mo4159a(size2 + size);
            }
            c.addAll(obj2);
        }
        if (size > 0) {
            obj2 = c;
        }
        ng.m9230a(obj, j, obj2);
    }

    /* renamed from: c */
    private static <E> zzbdk<E> m20744c(Object obj, long j) {
        return (zzbdk) ng.m9252f(obj, j);
    }
}
