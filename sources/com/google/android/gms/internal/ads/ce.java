package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.ObjectWrapper;

final class ce implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzyq f7950a;
    /* renamed from: b */
    private final /* synthetic */ zzjk f7951b;
    /* renamed from: c */
    private final /* synthetic */ zzaiz f7952c;
    /* renamed from: d */
    private final /* synthetic */ zzair f7953d;

    ce(zzair zzair, zzyq zzyq, zzjk zzjk, zzaiz zzaiz) {
        this.f7953d = zzair;
        this.f7950a = zzyq;
        this.f7951b = zzjk;
        this.f7952c = zzaiz;
    }

    public final void run() {
        try {
            this.f7950a.mo2762a(ObjectWrapper.m26019a(this.f7953d.f19856c), this.f7951b, null, this.f7952c, this.f7953d.f19860g);
        } catch (Throwable e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f7953d.f19854a);
            zzaok.m10004c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f7953d.mo4174a(this.f7953d.f19854a, 0);
        }
    }
}
