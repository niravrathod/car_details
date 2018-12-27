package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.p055g.C1171a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public class C3516f implements C1280f<ByteBuffer, Bitmap> {
    /* renamed from: a */
    private final C1285k f14549a;

    public C3516f(C1285k c1285k) {
        this.f14549a = c1285k;
    }

    /* renamed from: a */
    public boolean m17812a(ByteBuffer byteBuffer, C3452e c3452e) {
        return this.f14549a.m5202a(byteBuffer);
    }

    /* renamed from: a */
    public C1277s<Bitmap> m17810a(ByteBuffer byteBuffer, int i, int i2, C3452e c3452e) {
        return this.f14549a.m5199a(C1171a.m4857b(byteBuffer), i, i2, c3452e);
    }
}
