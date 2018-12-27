package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

final class ao implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ zzw f7659a;
    /* renamed from: b */
    private final /* synthetic */ al f7660b;

    ao(al alVar, zzw zzw) {
        this.f7660b = alVar;
        this.f7659a = zzw;
    }

    public final void onClick(View view) {
        this.f7659a.recordClick();
        if (this.f7660b.f7653b != null) {
            this.f7660b.f7653b.mo2325c();
        }
    }
}
