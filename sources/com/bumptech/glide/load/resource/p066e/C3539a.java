package com.bumptech.glide.load.resource.p066e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.resource.p165a.C3503b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.e.a */
public class C3539a implements C1300e<Bitmap, byte[]> {
    /* renamed from: a */
    private final CompressFormat f14594a;
    /* renamed from: b */
    private final int f14595b;

    public C3539a() {
        this(CompressFormat.JPEG, 100);
    }

    public C3539a(CompressFormat compressFormat, int i) {
        this.f14594a = compressFormat;
        this.f14595b = i;
    }

    /* renamed from: a */
    public C1277s<byte[]> mo1072a(C1277s<Bitmap> c1277s, C3452e c3452e) {
        c3452e = new ByteArrayOutputStream();
        ((Bitmap) c1277s.mo1046d()).compress(this.f14594a, this.f14595b, c3452e);
        c1277s.mo1048f();
        return new C3503b(c3452e.toByteArray());
    }
}
