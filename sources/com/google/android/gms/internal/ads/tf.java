package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class tf implements zzpk {
    /* renamed from: a */
    private final /* synthetic */ View f16677a;
    /* renamed from: b */
    private final /* synthetic */ zzqc f16678b;

    tf(zzqc zzqc, View view) {
        this.f16678b = zzqc;
        this.f16677a = view;
    }

    /* renamed from: a */
    public final void mo2173a() {
        if (this.f16678b.m26829a(zzqc.f20359a)) {
            this.f16678b.onClick(this.f16677a);
        }
    }

    /* renamed from: a */
    public final void mo2174a(MotionEvent motionEvent) {
        this.f16678b.onTouch(null, motionEvent);
    }
}
