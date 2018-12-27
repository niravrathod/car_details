package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzaer
public final class zzqn extends Image {
    /* renamed from: a */
    private final zzqk f17321a;
    /* renamed from: b */
    private final Drawable f17322b;
    /* renamed from: c */
    private final Uri f17323c;
    /* renamed from: d */
    private final double f17324d;

    public zzqn(zzqk zzqk) {
        Drawable drawable;
        double d;
        this.f17321a = zzqk;
        zzqk = null;
        try {
            IObjectWrapper a = this.f17321a.mo2615a();
            if (a != null) {
                drawable = (Drawable) ObjectWrapper.m26020a(a);
                this.f17322b = drawable;
                zzqk = this.f17321a.mo2616b();
                this.f17323c = zzqk;
                d = 1.0d;
                d = this.f17321a.mo2617c();
                this.f17324d = d;
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        drawable = null;
        this.f17322b = drawable;
        try {
            zzqk = this.f17321a.mo2616b();
        } catch (Throwable e2) {
            zzaok.m10002b("", e2);
        }
        this.f17323c = zzqk;
        d = 1.0d;
        try {
            d = this.f17321a.mo2617c();
        } catch (zzqk zzqk2) {
            zzaok.m10002b("", zzqk2);
        }
        this.f17324d = d;
    }

    public final Drawable getDrawable() {
        return this.f17322b;
    }

    public final Uri getUri() {
        return this.f17323c;
    }

    public final double getScale() {
        return this.f17324d;
    }
}
