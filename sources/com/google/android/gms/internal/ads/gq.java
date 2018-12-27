package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class gq implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ zzajy f8115a;
    /* renamed from: b */
    private final /* synthetic */ zzash f8116b;

    gq(zzash zzash, zzajy zzajy) {
        this.f8116b = zzash;
        this.f8115a = zzajy;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f8116b.m21375a(view, this.f8115a, 10);
    }
}
