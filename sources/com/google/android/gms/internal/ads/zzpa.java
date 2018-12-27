package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzaer
public final class zzpa extends zzql {
    /* renamed from: a */
    private final Drawable f20272a;
    /* renamed from: b */
    private final Uri f20273b;
    /* renamed from: c */
    private final double f20274c;

    public zzpa(Drawable drawable, Uri uri, double d) {
        this.f20272a = drawable;
        this.f20273b = uri;
        this.f20274c = d;
    }

    /* renamed from: a */
    public final IObjectWrapper mo2615a() {
        return ObjectWrapper.m26019a(this.f20272a);
    }

    /* renamed from: b */
    public final Uri mo2616b() {
        return this.f20273b;
    }

    /* renamed from: c */
    public final double mo2617c() {
        return this.f20274c;
    }
}
