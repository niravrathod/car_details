package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C4780g extends C4520e {
    /* renamed from: b */
    private static final byte[] f20901b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    /* renamed from: a */
    protected Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        return C1289u.m5212a(c1232e, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C4780g;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(f20901b);
    }
}
