package com.bumptech.glide.load.resource.p066e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.resource.bitmap.C3515d;
import com.bumptech.glide.load.resource.p065d.C3536c;

/* renamed from: com.bumptech.glide.load.resource.e.c */
public final class C3541c implements C1300e<Drawable, byte[]> {
    /* renamed from: a */
    private final C1232e f14597a;
    /* renamed from: b */
    private final C1300e<Bitmap, byte[]> f14598b;
    /* renamed from: c */
    private final C1300e<C3536c, byte[]> f14599c;

    /* renamed from: a */
    private static C1277s<C3536c> m17921a(C1277s<Drawable> c1277s) {
        return c1277s;
    }

    public C3541c(C1232e c1232e, C1300e<Bitmap, byte[]> c1300e, C1300e<C3536c, byte[]> c1300e2) {
        this.f14597a = c1232e;
        this.f14598b = c1300e;
        this.f14599c = c1300e2;
    }

    /* renamed from: a */
    public C1277s<byte[]> mo1072a(C1277s<Drawable> c1277s, C3452e c3452e) {
        Drawable drawable = (Drawable) c1277s.mo1046d();
        if (drawable instanceof BitmapDrawable) {
            return this.f14598b.mo1072a(C3515d.m17802a(((BitmapDrawable) drawable).getBitmap(), this.f14597a), c3452e);
        }
        return drawable instanceof C3536c ? this.f14599c.mo1072a(C3541c.m17921a(c1277s), c3452e) : null;
    }
}
