package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public class C4781h extends C4520e {
    /* renamed from: b */
    private static final byte[] f20902b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    /* renamed from: a */
    protected Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        return C1289u.m5222c(c1232e, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C4781h;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(f20902b);
    }
}
