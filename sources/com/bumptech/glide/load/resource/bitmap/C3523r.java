package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.resource.p064b.C3506d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
public class C3523r implements C1280f<Uri, Bitmap> {
    /* renamed from: a */
    private final C3506d f14556a;
    /* renamed from: b */
    private final C1232e f14557b;

    public C3523r(C3506d c3506d, C1232e c1232e) {
        this.f14556a = c3506d;
        this.f14557b = c1232e;
    }

    /* renamed from: a */
    public boolean m17848a(Uri uri, C3452e c3452e) {
        return "android.resource".equals(uri.getScheme());
    }

    /* renamed from: a */
    public C1277s<Bitmap> m17846a(Uri uri, int i, int i2, C3452e c3452e) {
        uri = this.f14556a.m17780a(uri, i, i2, c3452e);
        if (uri == null) {
            return null;
        }
        return C1286l.m5203a(this.f14557b, (Drawable) uri.mo1046d(), i, i2);
    }
}
