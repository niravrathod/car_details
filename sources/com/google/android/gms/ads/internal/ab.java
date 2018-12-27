package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ab implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ zzbp f7639a;

    ab(zzbp zzbp) {
        this.f7639a = zzbp;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f7639a.f19594h != null) {
            this.f7639a.f19594h.m10480a(motionEvent);
        }
        return null;
    }
}
