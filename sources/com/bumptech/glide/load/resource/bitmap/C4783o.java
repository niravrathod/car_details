package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public class C4783o extends C4520e {
    /* renamed from: b */
    private static final byte[] f20904b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    /* renamed from: a */
    protected Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        return C1289u.m5220b(c1232e, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C4783o;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(f20904b);
    }
}
