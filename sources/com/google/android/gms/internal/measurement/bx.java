package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class bx extends bv {
    /* renamed from: a */
    private static final Class<?> f17442a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bx() {
        super();
    }

    /* renamed from: a */
    final <L> List<L> mo3050a(Object obj, long j) {
        return m22319a(obj, j, 10);
    }

    /* renamed from: b */
    final void mo3052b(Object obj, long j) {
        Object e;
        List list = (List) dp.m11773f(obj, j);
        if (list instanceof zzwc) {
            e = ((zzwc) list).mo3159e();
        } else if (!f17442a.isAssignableFrom(list.getClass())) {
            if ((list instanceof cp) && (list instanceof zzvs)) {
                zzvs zzvs = (zzvs) list;
                if (zzvs.mo2923a() != null) {
                    zzvs.mo2924b();
                }
                return;
            }
            e = Collections.unmodifiableList(list);
        } else {
            return;
        }
        dp.m11751a(obj, j, e);
    }

    /* renamed from: a */
    private static <L> List<L> m22319a(Object obj, long j, int i) {
        List<L> c = m22320c(obj, j);
        Object zzwb;
        if (c.isEmpty()) {
            if (c instanceof zzwc) {
                zzwb = new zzwb(i);
            } else if ((c instanceof cp) && (c instanceof zzvs)) {
                zzwb = ((zzvs) c).mo4339a(i);
            } else {
                zzwb = new ArrayList(i);
            }
            dp.m11751a(obj, j, zzwb);
            return zzwb;
        }
        ArrayList arrayList;
        if (f17442a.isAssignableFrom(c.getClass())) {
            arrayList = new ArrayList(c.size() + i);
            arrayList.addAll(c);
            dp.m11751a(obj, j, (Object) arrayList);
        } else if (c instanceof zzye) {
            Object zzwb2 = new zzwb(c.size() + i);
            zzwb2.addAll((zzye) c);
            dp.m11751a(obj, j, zzwb2);
        } else if (!(c instanceof cp) || !(c instanceof zzvs)) {
            return c;
        } else {
            zzvs zzvs = (zzvs) c;
            if (zzvs.mo2923a()) {
                return c;
            }
            zzwb = zzvs.mo4339a(c.size() + i);
            dp.m11751a(obj, j, zzwb);
            return zzwb;
        }
        return arrayList;
    }

    /* renamed from: a */
    final <E> void mo3051a(Object obj, Object obj2, long j) {
        obj2 = m22320c(obj2, j);
        List a = m22319a(obj, j, obj2.size());
        int size = a.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(obj2);
        }
        if (size > 0) {
            obj2 = a;
        }
        dp.m11751a(obj, j, obj2);
    }

    /* renamed from: c */
    private static <E> List<E> m22320c(Object obj, long j) {
        return (List) dp.m11773f(obj, j);
    }
}
