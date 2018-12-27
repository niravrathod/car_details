package com.google.android.gms.internal.measurement;

final class dm extends dl<zzyc, zzyc> {
    dm() {
    }

    /* renamed from: a */
    final boolean mo3088a(ct ctVar) {
        return false;
    }

    /* renamed from: a */
    private static void m22408a(Object obj, zzyc zzyc) {
        ((zzvm) obj).zzbym = zzyc;
    }

    /* renamed from: d */
    final void mo3095d(Object obj) {
        ((zzvm) obj).zzbym.m12119c();
    }

    /* renamed from: f */
    final /* synthetic */ int mo3097f(Object obj) {
        return ((zzyc) obj).m12121e();
    }

    /* renamed from: e */
    final /* synthetic */ int mo3096e(Object obj) {
        return ((zzyc) obj).m12120d();
    }

    /* renamed from: c */
    final /* synthetic */ Object mo3094c(Object obj, Object obj2) {
        zzyc zzyc = (zzyc) obj;
        zzyc zzyc2 = (zzyc) obj2;
        if (zzyc2.equals(zzyc.m12111a())) {
            return zzyc;
        }
        return zzyc.m12112a(zzyc, zzyc2);
    }

    /* renamed from: b */
    final /* synthetic */ void mo3091b(Object obj, dx dxVar) {
        ((zzyc) obj).m12116a(dxVar);
    }

    /* renamed from: a */
    final /* synthetic */ void mo3086a(Object obj, dx dxVar) {
        ((zzyc) obj).m12118b(dxVar);
    }

    /* renamed from: b */
    final /* synthetic */ void mo3092b(Object obj, Object obj2) {
        m22408a(obj, (zzyc) obj2);
    }

    /* renamed from: c */
    final /* synthetic */ Object mo3093c(Object obj) {
        zzyc zzyc = ((zzvm) obj).zzbym;
        if (zzyc != zzyc.m12111a()) {
            return zzyc;
        }
        zzyc = zzyc.m12114b();
        m22408a(obj, zzyc);
        return zzyc;
    }

    /* renamed from: b */
    final /* synthetic */ Object mo3089b(Object obj) {
        return ((zzvm) obj).zzbym;
    }

    /* renamed from: a */
    final /* synthetic */ void mo3087a(Object obj, Object obj2) {
        m22408a(obj, (zzyc) obj2);
    }

    /* renamed from: a */
    final /* synthetic */ Object mo3081a(Object obj) {
        zzyc zzyc = (zzyc) obj;
        zzyc.m12119c();
        return zzyc;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo3080a() {
        return zzyc.m12114b();
    }

    /* renamed from: a */
    final /* synthetic */ void mo3085a(Object obj, int i, Object obj2) {
        ((zzyc) obj).m12115a((i << 3) | 3, (zzyc) obj2);
    }

    /* renamed from: a */
    final /* synthetic */ void mo3084a(Object obj, int i, zzud zzud) {
        ((zzyc) obj).m12115a((i << 3) | 2, (Object) zzud);
    }

    /* renamed from: b */
    final /* synthetic */ void mo3090b(Object obj, int i, long j) {
        ((zzyc) obj).m12115a((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: a */
    final /* synthetic */ void mo3082a(Object obj, int i, int i2) {
        ((zzyc) obj).m12115a((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: a */
    final /* synthetic */ void mo3083a(Object obj, int i, long j) {
        ((zzyc) obj).m12115a(i << 3, Long.valueOf(j));
    }
}
