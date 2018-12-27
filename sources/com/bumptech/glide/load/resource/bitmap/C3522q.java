package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.C1274o;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
public final class C3522q implements C1274o, C1277s<BitmapDrawable> {
    /* renamed from: a */
    private final Resources f14554a;
    /* renamed from: b */
    private final C1277s<Bitmap> f14555b;

    /* renamed from: d */
    public /* synthetic */ Object mo1046d() {
        return m17841b();
    }

    /* renamed from: a */
    public static C1277s<BitmapDrawable> m17839a(Resources resources, C1277s<Bitmap> c1277s) {
        return c1277s == null ? null : new C3522q(resources, c1277s);
    }

    private C3522q(Resources resources, C1277s<Bitmap> c1277s) {
        this.f14554a = (Resources) C1178i.m4880a((Object) resources);
        this.f14555b = (C1277s) C1178i.m4880a((Object) c1277s);
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo1045c() {
        return BitmapDrawable.class;
    }

    /* renamed from: b */
    public BitmapDrawable m17841b() {
        return new BitmapDrawable(this.f14554a, (Bitmap) this.f14555b.mo1046d());
    }

    /* renamed from: e */
    public int mo1047e() {
        return this.f14555b.mo1047e();
    }

    /* renamed from: f */
    public void mo1048f() {
        this.f14555b.mo1048f();
    }

    /* renamed from: a */
    public void mo1049a() {
        if (this.f14555b instanceof C1274o) {
            ((C1274o) this.f14555b).mo1049a();
        }
    }
}
