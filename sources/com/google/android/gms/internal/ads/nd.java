package com.google.android.gms.internal.ads;

final class nd extends nc<zzbfv, zzbfv> {
    nd() {
    }

    /* renamed from: a */
    final boolean mo2134a(mk mkVar) {
        return false;
    }

    /* renamed from: a */
    private static void m20840a(Object obj, zzbfv zzbfv) {
        ((zzbdd) obj).zzdxs = zzbfv;
    }

    /* renamed from: d */
    final void mo2141d(Object obj) {
        ((zzbdd) obj).zzdxs.m10380c();
    }

    /* renamed from: f */
    final /* synthetic */ int mo2143f(Object obj) {
        return ((zzbfv) obj).m10382e();
    }

    /* renamed from: e */
    final /* synthetic */ int mo2142e(Object obj) {
        return ((zzbfv) obj).m10381d();
    }

    /* renamed from: c */
    final /* synthetic */ Object mo2140c(Object obj, Object obj2) {
        zzbfv zzbfv = (zzbfv) obj;
        zzbfv zzbfv2 = (zzbfv) obj2;
        if (zzbfv2.equals(zzbfv.m10372a())) {
            return zzbfv;
        }
        return zzbfv.m10373a(zzbfv, zzbfv2);
    }

    /* renamed from: b */
    final /* synthetic */ void mo2137b(Object obj, no noVar) {
        ((zzbfv) obj).m10377a(noVar);
    }

    /* renamed from: a */
    final /* synthetic */ void mo2132a(Object obj, no noVar) {
        ((zzbfv) obj).m10379b(noVar);
    }

    /* renamed from: b */
    final /* synthetic */ void mo2138b(Object obj, Object obj2) {
        m20840a(obj, (zzbfv) obj2);
    }

    /* renamed from: c */
    final /* synthetic */ Object mo2139c(Object obj) {
        zzbfv zzbfv = ((zzbdd) obj).zzdxs;
        if (zzbfv != zzbfv.m10372a()) {
            return zzbfv;
        }
        zzbfv = zzbfv.m10375b();
        m20840a(obj, zzbfv);
        return zzbfv;
    }

    /* renamed from: b */
    final /* synthetic */ Object mo2135b(Object obj) {
        return ((zzbdd) obj).zzdxs;
    }

    /* renamed from: a */
    final /* synthetic */ void mo2133a(Object obj, Object obj2) {
        m20840a(obj, (zzbfv) obj2);
    }

    /* renamed from: a */
    final /* synthetic */ Object mo2127a(Object obj) {
        zzbfv zzbfv = (zzbfv) obj;
        zzbfv.m10380c();
        return zzbfv;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo2126a() {
        return zzbfv.m10375b();
    }

    /* renamed from: a */
    final /* synthetic */ void mo2131a(Object obj, int i, Object obj2) {
        ((zzbfv) obj).m10376a((i << 3) | 3, (zzbfv) obj2);
    }

    /* renamed from: a */
    final /* synthetic */ void mo2130a(Object obj, int i, zzbbu zzbbu) {
        ((zzbfv) obj).m10376a((i << 3) | 2, (Object) zzbbu);
    }

    /* renamed from: b */
    final /* synthetic */ void mo2136b(Object obj, int i, long j) {
        ((zzbfv) obj).m10376a((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: a */
    final /* synthetic */ void mo2128a(Object obj, int i, int i2) {
        ((zzbfv) obj).m10376a((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: a */
    final /* synthetic */ void mo2129a(Object obj, int i, long j) {
        ((zzbfv) obj).m10376a(i << 3, Long.valueOf(j));
    }
}
