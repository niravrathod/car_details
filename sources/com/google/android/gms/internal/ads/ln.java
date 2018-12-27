package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ln extends ll {
    /* renamed from: a */
    private static final Class<?> f16537a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ln() {
        super();
    }

    /* renamed from: a */
    final <L> List<L> mo2096a(Object obj, long j) {
        return m20739a(obj, j, 10);
    }

    /* renamed from: b */
    final void mo2098b(Object obj, long j) {
        Object e;
        List list = (List) ng.m9252f(obj, j);
        if (list instanceof zzbdu) {
            e = ((zzbdu) list).mo2427e();
        } else if (!f16537a.isAssignableFrom(list.getClass())) {
            if ((list instanceof mg) && (list instanceof zzbdk)) {
                zzbdk zzbdk = (zzbdk) list;
                if (zzbdk.mo1969a() != null) {
                    zzbdk.mo1970b();
                }
                return;
            }
            e = Collections.unmodifiableList(list);
        } else {
            return;
        }
        ng.m9230a(obj, j, e);
    }

    /* renamed from: a */
    private static <L> List<L> m20739a(Object obj, long j, int i) {
        List<L> c = m20740c(obj, j);
        Object zzbdt;
        if (c.isEmpty()) {
            if (c instanceof zzbdu) {
                zzbdt = new zzbdt(i);
            } else if ((c instanceof mg) && (c instanceof zzbdk)) {
                zzbdt = ((zzbdk) c).mo4159a(i);
            } else {
                zzbdt = new ArrayList(i);
            }
            ng.m9230a(obj, j, zzbdt);
            return zzbdt;
        }
        ArrayList arrayList;
        if (f16537a.isAssignableFrom(c.getClass())) {
            arrayList = new ArrayList(c.size() + i);
            arrayList.addAll(c);
            ng.m9230a(obj, j, (Object) arrayList);
        } else if (c instanceof zzbfx) {
            Object zzbdt2 = new zzbdt(c.size() + i);
            zzbdt2.addAll((zzbfx) c);
            ng.m9230a(obj, j, zzbdt2);
        } else if (!(c instanceof mg) || !(c instanceof zzbdk)) {
            return c;
        } else {
            zzbdk zzbdk = (zzbdk) c;
            if (zzbdk.mo1969a()) {
                return c;
            }
            zzbdt = zzbdk.mo4159a(c.size() + i);
            ng.m9230a(obj, j, zzbdt);
            return zzbdt;
        }
        return arrayList;
    }

    /* renamed from: a */
    final <E> void mo2097a(Object obj, Object obj2, long j) {
        obj2 = m20740c(obj2, j);
        List a = m20739a(obj, j, obj2.size());
        int size = a.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(obj2);
        }
        if (size > 0) {
            obj2 = a;
        }
        ng.m9230a(obj, j, obj2);
    }

    /* renamed from: c */
    private static <E> List<E> m20740c(Object obj, long j) {
        return (List) ng.m9252f(obj, j);
    }
}
