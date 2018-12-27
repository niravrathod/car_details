package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class al implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ WeakReference f7909a;
    /* renamed from: b */
    private final /* synthetic */ zzadm f7910b;

    al(zzadm zzadm, WeakReference weakReference) {
        this.f7910b = zzadm;
        this.f7909a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f7910b.m9489a(this.f7909a, false);
    }
}
