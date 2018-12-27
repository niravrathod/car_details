package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.C0120b;
import android.support.customtabs.C0124d;
import java.lang.ref.WeakReference;

public final class zzbhw extends C0124d {
    /* renamed from: a */
    private WeakReference<zzbhx> f17112a;

    public zzbhw(zzbhx zzbhx) {
        this.f17112a = new WeakReference(zzbhx);
    }

    /* renamed from: a */
    public final void mo2432a(ComponentName componentName, C0120b c0120b) {
        zzbhx zzbhx = (zzbhx) this.f17112a.get();
        if (zzbhx != null) {
            zzbhx.mo2582a(c0120b);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbhx zzbhx = (zzbhx) this.f17112a.get();
        if (zzbhx != null) {
            zzbhx.mo2581a();
        }
    }
}
