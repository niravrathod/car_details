package com.bumptech.glide.load.resource.p064b;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.C1277s;

/* renamed from: com.bumptech.glide.load.resource.b.c */
final class C4516c extends C3505b<Drawable> {
    /* renamed from: f */
    public void mo1048f() {
    }

    /* renamed from: a */
    static C1277s<Drawable> m24958a(Drawable drawable) {
        return drawable != null ? new C4516c(drawable) : null;
    }

    private C4516c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public Class<Drawable> mo1045c() {
        return this.a.getClass();
    }

    /* renamed from: e */
    public int mo1047e() {
        return Math.max(1, (this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight()) * 4);
    }
}
