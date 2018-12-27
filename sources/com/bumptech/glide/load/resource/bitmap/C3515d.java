package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C1274o;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public class C3515d implements C1274o, C1277s<Bitmap> {
    /* renamed from: a */
    private final Bitmap f14547a;
    /* renamed from: b */
    private final C1232e f14548b;

    /* renamed from: d */
    public /* synthetic */ Object mo1046d() {
        return m17804b();
    }

    /* renamed from: a */
    public static C3515d m17802a(Bitmap bitmap, C1232e c1232e) {
        return bitmap == null ? null : new C3515d(bitmap, c1232e);
    }

    public C3515d(Bitmap bitmap, C1232e c1232e) {
        this.f14547a = (Bitmap) C1178i.m4881a((Object) bitmap, "Bitmap must not be null");
        this.f14548b = (C1232e) C1178i.m4881a((Object) c1232e, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public Class<Bitmap> mo1045c() {
        return Bitmap.class;
    }

    /* renamed from: b */
    public Bitmap m17804b() {
        return this.f14547a;
    }

    /* renamed from: e */
    public int mo1047e() {
        return C1180j.m4889a(this.f14547a);
    }

    /* renamed from: f */
    public void mo1048f() {
        this.f14548b.mo1005a(this.f14547a);
    }

    /* renamed from: a */
    public void mo1049a() {
        this.f14547a.prepareToDraw();
    }
}
