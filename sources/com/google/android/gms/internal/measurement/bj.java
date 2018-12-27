package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zzc;
import java.util.Map.Entry;

final class bj extends bi<Object> {
    bj() {
    }

    /* renamed from: a */
    final boolean mo3045a(zzwt zzwt) {
        return zzwt instanceof zzc;
    }

    /* renamed from: a */
    final bl<Object> mo3038a(Object obj) {
        return ((zzc) obj).zzbys;
    }

    /* renamed from: a */
    final void mo3044a(Object obj, bl<Object> blVar) {
        ((zzc) obj).zzbys = blVar;
    }

    /* renamed from: b */
    final bl<Object> mo3046b(Object obj) {
        bl<Object> a = mo3038a(obj);
        if (!a.m11532d()) {
            return a;
        }
        bl blVar = (bl) a.clone();
        mo3044a(obj, blVar);
        return blVar;
    }

    /* renamed from: c */
    final void mo3047c(Object obj) {
        mo3038a(obj).m11531c();
    }

    /* renamed from: a */
    final <UT, UB> UB mo3039a(ct ctVar, Object obj, zzuz zzuz, bl<Object> blVar, UB ub, dl<UT, UB> dlVar) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final int mo3037a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void mo3042a(dx dxVar, Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final Object mo3040a(zzuz zzuz, zzwt zzwt, int i) {
        return zzuz.m12056a(zzwt, i);
    }

    /* renamed from: a */
    final void mo3041a(ct ctVar, Object obj, zzuz zzuz, bl<Object> blVar) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void mo3043a(zzud zzud, Object obj, zzuz zzuz, bl<Object> blVar) {
        throw new NoSuchMethodError();
    }
}
