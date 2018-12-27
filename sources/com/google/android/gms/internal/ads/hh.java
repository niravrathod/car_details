package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final /* synthetic */ class hh implements Callable {
    /* renamed from: a */
    private final Context f8147a;
    /* renamed from: b */
    private final zzatt f8148b;
    /* renamed from: c */
    private final String f8149c;
    /* renamed from: d */
    private final boolean f8150d;
    /* renamed from: e */
    private final boolean f8151e;
    /* renamed from: f */
    private final zzck f8152f;
    /* renamed from: g */
    private final zzaop f8153g;
    /* renamed from: h */
    private final zzoj f8154h;
    /* renamed from: i */
    private final zzbo f8155i;
    /* renamed from: j */
    private final zzv f8156j;

    hh(Context context, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv) {
        this.f8147a = context;
        this.f8148b = zzatt;
        this.f8149c = str;
        this.f8150d = z;
        this.f8151e = z2;
        this.f8152f = zzck;
        this.f8153g = zzaop;
        this.f8154h = zzoj;
        this.f8155i = zzbo;
        this.f8156j = zzv;
    }

    public final Object call() {
        Context context = this.f8147a;
        zzatt zzatt = this.f8148b;
        String str = this.f8149c;
        boolean z = this.f8150d;
        boolean z2 = this.f8151e;
        zzck zzck = this.f8152f;
        zzaop zzaop = this.f8153g;
        zzoj zzoj = this.f8154h;
        zzbo zzbo = this.f8155i;
        zzv zzv = this.f8156j;
        zzatu zzatu = new zzatu();
        hi hiVar = new hi(new zzats(context), zzatu, zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv);
        zzasg zzasr = new zzasr(hiVar);
        hiVar.setWebChromeClient(new zzary(zzasr));
        zzatu.m21425a(zzasr, z2);
        return zzasr;
    }
}
