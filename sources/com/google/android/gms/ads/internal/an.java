package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class an implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ zzw f7657a;
    /* renamed from: b */
    private final /* synthetic */ al f7658b;

    an(al alVar, zzw zzw) {
        this.f7658b = alVar;
        this.f7657a = zzw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7657a.recordClick();
        if (this.f7658b.f7653b != null) {
            this.f7658b.f7653b.mo2325c();
        }
        return null;
    }
}
