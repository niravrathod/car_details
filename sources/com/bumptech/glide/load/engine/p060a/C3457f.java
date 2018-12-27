package com.bumptech.glide.load.engine.p060a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.bumptech.glide.load.engine.a.f */
public class C3457f implements C1232e {
    /* renamed from: a */
    public void mo1003a() {
    }

    /* renamed from: a */
    public void mo1004a(int i) {
    }

    /* renamed from: a */
    public void mo1005a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: a */
    public Bitmap mo1002a(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: b */
    public Bitmap mo1006b(int i, int i2, Config config) {
        return mo1002a(i, i2, config);
    }
}
