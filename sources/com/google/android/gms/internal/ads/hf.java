package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class hf implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ zzajy f8145a;
    /* renamed from: b */
    private final /* synthetic */ zzatu f8146b;

    hf(zzatu zzatu, zzajy zzajy) {
        this.f8146b = zzatu;
        this.f8145a = zzajy;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f8146b.m21414a(view, this.f8145a, 10);
    }
}
