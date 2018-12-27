package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C3514a<DataType> implements C1280f<DataType, BitmapDrawable> {
    /* renamed from: a */
    private final C1280f<DataType, Bitmap> f14545a;
    /* renamed from: b */
    private final Resources f14546b;

    public C3514a(Resources resources, C1280f<DataType, Bitmap> c1280f) {
        this.f14546b = (Resources) C1178i.m4880a((Object) resources);
        this.f14545a = (C1280f) C1178i.m4880a((Object) c1280f);
    }

    /* renamed from: a */
    public boolean mo1051a(DataType dataType, C3452e c3452e) {
        return this.f14545a.mo1051a(dataType, c3452e);
    }

    /* renamed from: a */
    public C1277s<BitmapDrawable> mo1050a(DataType dataType, int i, int i2, C3452e c3452e) {
        return C3522q.m17839a(this.f14546b, this.f14545a.mo1050a(dataType, i, i2, c3452e));
    }
}
