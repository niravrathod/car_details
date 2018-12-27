package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Map.Entry;

final class cf implements ce {
    cf() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo3057a(Object obj) {
        return (zzwn) obj;
    }

    /* renamed from: f */
    public final cd<?, ?> mo3062f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo3058b(Object obj) {
        return (zzwn) obj;
    }

    /* renamed from: c */
    public final boolean mo3059c(Object obj) {
        return ((zzwn) obj).m12107d() == null ? true : null;
    }

    /* renamed from: d */
    public final Object mo3060d(Object obj) {
        ((zzwn) obj).m12106c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo3061e(Object obj) {
        return zzwn.m12102a().m12105b();
    }

    /* renamed from: a */
    public final Object mo3056a(Object obj, Object obj2) {
        obj = (zzwn) obj;
        zzwn zzwn = (zzwn) obj2;
        if (!zzwn.isEmpty()) {
            if (!obj.m12107d()) {
                obj = obj.m12105b();
            }
            obj.m12104a(zzwn);
        }
        return obj;
    }

    /* renamed from: a */
    public final int mo3055a(int i, Object obj, Object obj2) {
        zzwn zzwn = (zzwn) obj;
        if (zzwn.isEmpty() != 0) {
            return 0;
        }
        i = zzwn.entrySet().iterator();
        if (i.hasNext() == null) {
            return 0;
        }
        Entry entry = (Entry) i.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
