package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class am implements OnScrollChangedListener {
    /* renamed from: a */
    private final /* synthetic */ WeakReference f7911a;
    /* renamed from: b */
    private final /* synthetic */ zzadm f7912b;

    am(zzadm zzadm, WeakReference weakReference) {
        this.f7912b = zzadm;
        this.f7911a = weakReference;
    }

    public final void onScrollChanged() {
        this.f7912b.m9489a(this.f7911a, true);
    }
}
