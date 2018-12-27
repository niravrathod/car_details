package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public class C4782i extends C4520e {
    /* renamed from: b */
    private static final byte[] f20903b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    /* renamed from: a */
    protected Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        return C1289u.m5223d(c1232e, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C4782i;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(f20903b);
    }
}
