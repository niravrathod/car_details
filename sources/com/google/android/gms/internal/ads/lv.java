package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Map.Entry;

final class lv implements lu {
    lv() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo2102a(Object obj) {
        return (zzbef) obj;
    }

    /* renamed from: f */
    public final lt<?, ?> mo2107f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo2103b(Object obj) {
        return (zzbef) obj;
    }

    /* renamed from: c */
    public final boolean mo2104c(Object obj) {
        return ((zzbef) obj).m10367d() == null ? true : null;
    }

    /* renamed from: d */
    public final Object mo2105d(Object obj) {
        ((zzbef) obj).m10366c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo2106e(Object obj) {
        return zzbef.m10362a().m10365b();
    }

    /* renamed from: a */
    public final Object mo2101a(Object obj, Object obj2) {
        obj = (zzbef) obj;
        zzbef zzbef = (zzbef) obj2;
        if (!zzbef.isEmpty()) {
            if (!obj.m10367d()) {
                obj = obj.m10365b();
            }
            obj.m10364a(zzbef);
        }
        return obj;
    }

    /* renamed from: a */
    public final int mo2100a(int i, Object obj, Object obj2) {
        zzbef zzbef = (zzbef) obj;
        if (zzbef.isEmpty() != 0) {
            return 0;
        }
        i = zzbef.entrySet().iterator();
        if (i.hasNext() == null) {
            return 0;
        }
        Entry entry = (Entry) i.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
