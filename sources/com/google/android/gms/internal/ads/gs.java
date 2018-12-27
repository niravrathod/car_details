package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;

final /* synthetic */ class gs implements zzaos {
    /* renamed from: a */
    private final Context f16489a;
    /* renamed from: b */
    private final zzck f16490b;
    /* renamed from: c */
    private final zzaop f16491c;
    /* renamed from: d */
    private final zzv f16492d;
    /* renamed from: e */
    private final String f16493e;

    gs(Context context, zzck zzck, zzaop zzaop, zzv zzv, String str) {
        this.f16489a = context;
        this.f16490b = zzck;
        this.f16491c = zzaop;
        this.f16492d = zzv;
        this.f16493e = str;
    }

    /* renamed from: a */
    public final zzapi mo1714a(Object obj) {
        Context context = this.f16489a;
        zzck zzck = this.f16490b;
        zzaop zzaop = this.f16491c;
        zzv zzv = this.f16492d;
        obj = this.f16493e;
        zzbv.zzel();
        zzasg a = zzasm.m10092a(context, zzatt.m10128a(), "", false, false, zzck, zzaop, null, null, zzv, zzhv.m10677a());
        zzapi a2 = zzapr.m26281a(a);
        a.mo4782u().mo2393a(new gu(a2));
        a.loadUrl(obj);
        return a2;
    }
}
