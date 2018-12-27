package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

abstract class nc<T, B> {
    nc() {
    }

    /* renamed from: a */
    abstract B mo2126a();

    /* renamed from: a */
    abstract T mo2127a(B b);

    /* renamed from: a */
    abstract void mo2128a(B b, int i, int i2);

    /* renamed from: a */
    abstract void mo2129a(B b, int i, long j);

    /* renamed from: a */
    abstract void mo2130a(B b, int i, zzbbu zzbbu);

    /* renamed from: a */
    abstract void mo2131a(B b, int i, T t);

    /* renamed from: a */
    abstract void mo2132a(T t, no noVar);

    /* renamed from: a */
    abstract void mo2133a(Object obj, T t);

    /* renamed from: a */
    abstract boolean mo2134a(mk mkVar);

    /* renamed from: b */
    abstract T mo2135b(Object obj);

    /* renamed from: b */
    abstract void mo2136b(B b, int i, long j);

    /* renamed from: b */
    abstract void mo2137b(T t, no noVar);

    /* renamed from: b */
    abstract void mo2138b(Object obj, B b);

    /* renamed from: c */
    abstract B mo2139c(Object obj);

    /* renamed from: c */
    abstract T mo2140c(T t, T t2);

    /* renamed from: d */
    abstract void mo2141d(Object obj);

    /* renamed from: e */
    abstract int mo2142e(T t);

    /* renamed from: f */
    abstract int mo2143f(T t);

    /* renamed from: a */
    final boolean m9195a(B b, mk mkVar) {
        int b2 = mkVar.mo2005b();
        int i = b2 >>> 3;
        switch (b2 & 7) {
            case 0:
                mo2129a((Object) b, i, mkVar.mo2017g());
                return true;
            case 1:
                mo2136b(b, i, mkVar.mo2021i());
                return true;
            case 2:
                mo2130a((Object) b, i, mkVar.mo2031n());
                return true;
            case 3:
                Object a = mo2126a();
                int i2 = (i << 3) | 4;
                while (mkVar.mo2000a() != BaseClientBuilder.API_PRIORITY_OTHER) {
                    if (!m9195a(a, mkVar)) {
                        if (i2 != mkVar.mo2005b()) {
                            mo2131a((Object) b, i, mo2127a(a));
                            return true;
                        }
                        throw zzbdl.m10344e();
                    }
                }
                if (i2 != mkVar.mo2005b()) {
                    throw zzbdl.m10344e();
                }
                mo2131a((Object) b, i, mo2127a(a));
                return true;
            case 4:
                return null;
            case 5:
                mo2128a((Object) b, i, mkVar.mo2023j());
                return true;
            default:
                throw zzbdl.m10345f();
        }
    }
}
