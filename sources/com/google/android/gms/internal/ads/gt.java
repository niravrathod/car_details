package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final /* synthetic */ class gt implements Callable {
    /* renamed from: a */
    private final Context f8117a;
    /* renamed from: b */
    private final zzatt f8118b;
    /* renamed from: c */
    private final String f8119c;
    /* renamed from: d */
    private final boolean f8120d;
    /* renamed from: e */
    private final boolean f8121e;
    /* renamed from: f */
    private final zzck f8122f;
    /* renamed from: g */
    private final zzaop f8123g;
    /* renamed from: h */
    private final zzoj f8124h;
    /* renamed from: i */
    private final zzbo f8125i;
    /* renamed from: j */
    private final zzv f8126j;
    /* renamed from: k */
    private final zzhv f8127k;

    gt(Context context, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv, zzhv zzhv) {
        this.f8117a = context;
        this.f8118b = zzatt;
        this.f8119c = str;
        this.f8120d = z;
        this.f8121e = z2;
        this.f8122f = zzck;
        this.f8123g = zzaop;
        this.f8124h = zzoj;
        this.f8125i = zzbo;
        this.f8126j = zzv;
        this.f8127k = zzhv;
    }

    public final Object call() {
        Context context = this.f8117a;
        zzatt zzatt = this.f8118b;
        String str = this.f8119c;
        boolean z = this.f8120d;
        boolean z2 = this.f8121e;
        zzck zzck = this.f8122f;
        zzaop zzaop = this.f8123g;
        zzoj zzoj = this.f8124h;
        zzbo zzbo = this.f8125i;
        zzv zzv = this.f8126j;
        zzhv zzhv = this.f8127k;
        zzasg zzasr = new zzasr(gw.m28104a(context, zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv, zzhv));
        zzasr.setWebViewClient(zzbv.zzem().mo4176a(zzasr, zzhv, z2));
        zzasr.setWebChromeClient(new zzary(zzasr));
        return zzasr;
    }
}
