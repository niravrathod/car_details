package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
public final class C4784s extends C4520e {
    /* renamed from: b */
    private static final byte[] f20905b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    /* renamed from: c */
    private final int f20906c;

    public C4784s(int i) {
        C1178i.m4884a(i > 0, "roundingRadius must be greater than 0.");
        this.f20906c = i;
    }

    /* renamed from: a */
    protected Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        return C1289u.m5219b(c1232e, bitmap, this.f20906c);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C4784s)) {
            return false;
        }
        if (this.f20906c == ((C4784s) obj).f20906c) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C1180j.m4900b("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), C1180j.m4899b(this.f20906c));
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(f20905b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f20906c).array());
    }
}
