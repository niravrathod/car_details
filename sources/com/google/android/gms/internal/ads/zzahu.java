package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzahu extends zzaie {
    /* renamed from: a */
    private final Context f19847a;
    /* renamed from: b */
    private final Object f19848b;
    /* renamed from: c */
    private final zzaop f19849c;
    @GuardedBy("mLock")
    /* renamed from: d */
    private final zzahv f19850d;

    public zzahu(Context context, zzv zzv, zzyn zzyn, zzaop zzaop) {
        this(context, zzaop, new zzahv(context, zzv, zzjo.m26615a(), zzyn, zzaop));
    }

    @VisibleForTesting
    private zzahu(Context context, zzaop zzaop, zzahv zzahv) {
        this.f19848b = new Object();
        this.f19847a = context;
        this.f19849c = zzaop;
        this.f19850d = zzahv;
    }

    /* renamed from: a */
    public final void mo2252a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f19847a;
        r0 = r0 instanceof com.google.android.gms.internal.ads.zzaht;
        if (r0 == 0) goto L_0x0022;
    L_0x0006:
        r0 = r1.f19847a;	 Catch:{ NameNotFoundException -> 0x000e }
        r0 = (com.google.android.gms.internal.ads.zzaht) r0;	 Catch:{ NameNotFoundException -> 0x000e }
        r0.m9575a(r2);	 Catch:{ NameNotFoundException -> 0x000e }
        return;
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 15;
        if (r2 > r0) goto L_0x0016;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r2 = new android.os.RemoteException;
        r0 = android.content.pm.PackageManager.NameNotFoundException.class;
        r0 = r0.getSimpleName();
        r2.<init>(r0);
        throw r2;
    L_0x0022:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo2250a(zzaio zzaio) {
        synchronized (this.f19848b) {
            this.f19850d.m28955a(zzaio);
        }
    }

    /* renamed from: a */
    public final void mo2246a() {
        synchronized (this.f19848b) {
            this.f19850d.m28961i();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2247a(IObjectWrapper iObjectWrapper) {
        if (this.f19847a instanceof zzaht) {
            ((zzaht) this.f19847a).m9574a((Activity) ObjectWrapper.m26020a(iObjectWrapper));
        }
        mo2246a();
    }

    /* renamed from: a */
    public final void mo2249a(zzaii zzaii) {
        synchronized (this.f19848b) {
            this.f19850d.zza(zzaii);
        }
    }

    /* renamed from: a */
    public final void mo2248a(zzaib zzaib) {
        synchronized (this.f19848b) {
            this.f19850d.zza(zzaib);
        }
    }

    /* renamed from: a */
    public final void mo2251a(zzkz zzkz) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ar)).booleanValue()) {
            synchronized (this.f19848b) {
                this.f19850d.zza(zzkz);
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo2254b() {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.ar)).booleanValue()) {
            return new Bundle();
        }
        Bundle adMetadata;
        synchronized (this.f19848b) {
            adMetadata = this.f19850d.getAdMetadata();
        }
        return adMetadata;
    }

    /* renamed from: b */
    public final void mo2256b(String str) {
        synchronized (this.f19848b) {
            this.f19850d.setUserId(str);
        }
    }

    /* renamed from: c */
    public final void mo2258c(String str) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.as)).booleanValue()) {
            synchronized (this.f19848b) {
                this.f19850d.zzr(str);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo2259c() {
        boolean k;
        synchronized (this.f19848b) {
            k = this.f19850d.m28962k();
        }
        return k;
    }

    /* renamed from: d */
    public final void mo2260d() {
        mo2255b(null);
    }

    /* renamed from: b */
    public final void mo2255b(IObjectWrapper iObjectWrapper) {
        synchronized (this.f19848b) {
            this.f19850d.pause();
        }
    }

    /* renamed from: e */
    public final void mo2262e() {
        mo2257c(null);
    }

    /* renamed from: c */
    public final void mo2257c(IObjectWrapper iObjectWrapper) {
        synchronized (this.f19848b) {
            Context context;
            if (iObjectWrapper == null) {
                context = null;
            } else {
                try {
                    context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
                } catch (IObjectWrapper iObjectWrapper2) {
                    zzaok.m10004c("Unable to extract updated context.", iObjectWrapper2);
                }
            }
            if (context != null) {
                this.f19850d.m28954a(context);
            }
            this.f19850d.resume();
        }
    }

    /* renamed from: f */
    public final void mo2263f() {
        mo2261d(null);
    }

    /* renamed from: d */
    public final void mo2261d(IObjectWrapper iObjectWrapper) {
        synchronized (this.f19848b) {
            this.f19850d.destroy();
        }
    }

    /* renamed from: g */
    public final String mo2264g() {
        String mediationAdapterClassName;
        synchronized (this.f19848b) {
            mediationAdapterClassName = this.f19850d.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }

    /* renamed from: a */
    public final void mo2253a(boolean z) {
        synchronized (this.f19848b) {
            this.f19850d.setImmersiveMode(z);
        }
    }
}
