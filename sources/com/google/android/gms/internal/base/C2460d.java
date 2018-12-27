package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: com.google.android.gms.internal.base.d */
final class C2460d extends ConstantState {
    /* renamed from: a */
    int f9891a;
    /* renamed from: b */
    int f9892b;

    C2460d(C2460d c2460d) {
        if (c2460d != null) {
            this.f9891a = c2460d.f9891a;
            this.f9892b = c2460d.f9892b;
        }
    }

    public final Drawable newDrawable() {
        return new zae(this);
    }

    public final int getChangingConfigurations() {
        return this.f9891a;
    }
}
