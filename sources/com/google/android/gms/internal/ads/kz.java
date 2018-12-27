package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzc;
import java.util.Map.Entry;

final class kz extends ky<Object> {
    kz() {
    }

    /* renamed from: a */
    final boolean mo2091a(zzbel zzbel) {
        return zzbel instanceof zzc;
    }

    /* renamed from: a */
    final lb<Object> mo2084a(Object obj) {
        return ((zzc) obj).zzdxy;
    }

    /* renamed from: a */
    final void mo2090a(Object obj, lb<Object> lbVar) {
        ((zzc) obj).zzdxy = lbVar;
    }

    /* renamed from: b */
    final lb<Object> mo2092b(Object obj) {
        lb<Object> a = mo2084a(obj);
        if (!a.m9010d()) {
            return a;
        }
        lb lbVar = (lb) a.clone();
        mo2090a(obj, lbVar);
        return lbVar;
    }

    /* renamed from: c */
    final void mo2093c(Object obj) {
        mo2084a(obj).m9009c();
    }

    /* renamed from: a */
    final <UT, UB> UB mo2085a(mk mkVar, Object obj, zzbcq zzbcq, lb<Object> lbVar, UB ub, nc<UT, UB> ncVar) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final int mo2083a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void mo2088a(no noVar, Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final Object mo2086a(zzbcq zzbcq, zzbel zzbel, int i) {
        return zzbcq.m10315a(zzbel, i);
    }

    /* renamed from: a */
    final void mo2087a(mk mkVar, Object obj, zzbcq zzbcq, lb<Object> lbVar) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void mo2089a(zzbbu zzbbu, Object obj, zzbcq zzbcq, lb<Object> lbVar) {
        throw new NoSuchMethodError();
    }
}
