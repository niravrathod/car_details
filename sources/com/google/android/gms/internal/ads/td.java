package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class td implements zzpk {
    /* renamed from: a */
    private final /* synthetic */ View f16675a;
    /* renamed from: b */
    private final /* synthetic */ zzqa f16676b;

    td(zzqa zzqa, View view) {
        this.f16676b = zzqa;
        this.f16675a = view;
    }

    /* renamed from: a */
    public final void mo2173a() {
        this.f16676b.onClick(this.f16675a);
    }

    /* renamed from: a */
    public final void mo2174a(MotionEvent motionEvent) {
        this.f16676b.onTouch(null, motionEvent);
    }
}
