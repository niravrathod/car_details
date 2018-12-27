package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzaer
public final class zzag implements zzcg, Runnable {
    /* renamed from: a */
    private final List<Object[]> f16368a;
    /* renamed from: b */
    private final AtomicReference<zzcg> f16369b;
    /* renamed from: c */
    private Context f16370c;
    /* renamed from: d */
    private zzaop f16371d;
    /* renamed from: e */
    private CountDownLatch f16372e;

    public zzag(zzbw zzbw) {
        this(zzbw.zzrx, zzbw.zzadg);
    }

    private zzag(Context context, zzaop zzaop) {
        this.f16368a = new Vector();
        this.f16369b = new AtomicReference();
        this.f16372e = new CountDownLatch(1);
        this.f16370c = context;
        this.f16371d = zzaop;
        zzkd.m10709a();
        if (zzaoa.m9965b() != null) {
            zzalm.m9772a((Runnable) this);
        } else {
            run();
        }
    }

    /* renamed from: a */
    private final boolean m20372a() {
        try {
            this.f16372e.await();
            return true;
        } catch (Throwable e) {
            zzaok.m10004c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m20373b() {
        if (!this.f16368a.isEmpty()) {
            for (Object[] objArr : this.f16368a) {
                if (objArr.length == 1) {
                    ((zzcg) this.f16369b.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((zzcg) this.f16369b.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f16368a.clear();
        }
    }

    /* renamed from: a */
    private static Context m20371a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final String zza(Context context) {
        if (m20372a()) {
            zzcg zzcg = (zzcg) this.f16369b.get();
            if (zzcg != null) {
                m20373b();
                return zzcg.zza(m20371a(context));
            }
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        if (m20372a()) {
            zzcg zzcg = (zzcg) this.f16369b.get();
            if (zzcg != null) {
                m20373b();
                return zzcg.zza(m20371a(context), str, view, activity);
            }
        }
        return "";
    }

    public final void zzb(View view) {
        zzcg zzcg = (zzcg) this.f16369b.get();
        if (zzcg != null) {
            zzcg.zzb(view);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        zzcg zzcg = (zzcg) this.f16369b.get();
        if (zzcg != null) {
            m20373b();
            zzcg.zza(motionEvent);
            return;
        }
        this.f16368a.add(new Object[]{motionEvent});
    }

    public final void zza(int i, int i2, int i3) {
        zzcg zzcg = (zzcg) this.f16369b.get();
        if (zzcg != null) {
            m20373b();
            zzcg.zza(i, i2, i3);
            return;
        }
        this.f16368a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f16371d.f19896d;
            if (!((Boolean) zzkd.m10713e().m10897a(zznw.ax)).booleanValue() && z2) {
                z = true;
            }
            this.f16369b.set(zzcj.m28363a(this.f16371d.f19893a, m20371a(this.f16370c), z));
        } finally {
            this.f16372e.countDown();
            this.f16370c = null;
            this.f16371d = null;
        }
    }
}
