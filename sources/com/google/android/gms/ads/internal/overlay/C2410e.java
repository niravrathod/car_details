package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.e */
final class C2410e implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Drawable f7704a;
    /* renamed from: b */
    private final /* synthetic */ C4699d f7705b;

    C2410e(C4699d c4699d, Drawable drawable) {
        this.f7705b = c4699d;
        this.f7704a = drawable;
    }

    public final void run() {
        this.f7705b.f19502a.f19506a.getWindow().setBackgroundDrawable(this.f7704a);
    }
}
