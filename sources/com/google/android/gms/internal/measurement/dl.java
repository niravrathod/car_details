package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

abstract class dl<T, B> {
    dl() {
    }

    /* renamed from: a */
    abstract B mo3080a();

    /* renamed from: a */
    abstract T mo3081a(B b);

    /* renamed from: a */
    abstract void mo3082a(B b, int i, int i2);

    /* renamed from: a */
    abstract void mo3083a(B b, int i, long j);

    /* renamed from: a */
    abstract void mo3084a(B b, int i, zzud zzud);

    /* renamed from: a */
    abstract void mo3085a(B b, int i, T t);

    /* renamed from: a */
    abstract void mo3086a(T t, dx dxVar);

    /* renamed from: a */
    abstract void mo3087a(Object obj, T t);

    /* renamed from: a */
    abstract boolean mo3088a(ct ctVar);

    /* renamed from: b */
    abstract T mo3089b(Object obj);

    /* renamed from: b */
    abstract void mo3090b(B b, int i, long j);

    /* renamed from: b */
    abstract void mo3091b(T t, dx dxVar);

    /* renamed from: b */
    abstract void mo3092b(Object obj, B b);

    /* renamed from: c */
    abstract B mo3093c(Object obj);

    /* renamed from: c */
    abstract T mo3094c(T t, T t2);

    /* renamed from: d */
    abstract void mo3095d(Object obj);

    /* renamed from: e */
    abstract int mo3096e(T t);

    /* renamed from: f */
    abstract int mo3097f(T t);

    /* renamed from: a */
    final boolean m11716a(B b, ct ctVar) {
        int b2 = ctVar.mo2959b();
        int i = b2 >>> 3;
        switch (b2 & 7) {
            case 0:
                mo3083a((Object) b, i, ctVar.mo2971g());
                return true;
            case 1:
                mo3090b(b, i, ctVar.mo2975i());
                return true;
            case 2:
                mo3084a((Object) b, i, ctVar.mo2985n());
                return true;
            case 3:
                Object a = mo3080a();
                int i2 = (i << 3) | 4;
                while (ctVar.mo2954a() != BaseClientBuilder.API_PRIORITY_OTHER) {
                    if (!m11716a(a, ctVar)) {
                        if (i2 != ctVar.mo2959b()) {
                            mo3085a((Object) b, i, mo3081a(a));
                            return true;
                        }
                        throw zzvt.m12084d();
                    }
                }
                if (i2 != ctVar.mo2959b()) {
                    throw zzvt.m12084d();
                }
                mo3085a((Object) b, i, mo3081a(a));
                return true;
            case 4:
                return null;
            case 5:
                mo3082a((Object) b, i, ctVar.mo2977j());
                return true;
            default:
                throw zzvt.m12085e();
        }
    }
}
