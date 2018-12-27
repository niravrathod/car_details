package com.bumptech.glide.load.resource.p066e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.resource.bitmap.C3522q;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.load.resource.e.b */
public class C3540b implements C1300e<Bitmap, BitmapDrawable> {
    /* renamed from: a */
    private final Resources f14596a;

    public C3540b(Resources resources) {
        this.f14596a = (Resources) C1178i.m4880a((Object) resources);
    }

    /* renamed from: a */
    public C1277s<BitmapDrawable> mo1072a(C1277s<Bitmap> c1277s, C3452e c3452e) {
        return C3522q.m17839a(this.f14596a, c1277s);
    }
}
