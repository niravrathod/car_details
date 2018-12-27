package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C4518b implements C3499g<BitmapDrawable> {
    /* renamed from: a */
    private final C1232e f18829a;
    /* renamed from: b */
    private final C3499g<Bitmap> f18830b;

    public C4518b(C1232e c1232e, C3499g<Bitmap> c3499g) {
        this.f18829a = c1232e;
        this.f18830b = c3499g;
    }

    /* renamed from: a */
    public boolean m24966a(C1277s<BitmapDrawable> c1277s, File file, C3452e c3452e) {
        return this.f18830b.mo975a(new C3515d(((BitmapDrawable) c1277s.mo1046d()).getBitmap(), this.f18829a), file, c3452e);
    }

    /* renamed from: a */
    public EncodeStrategy mo3904a(C3452e c3452e) {
        return this.f18830b.mo3904a(c3452e);
    }
}
