package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.p055g.C1180j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
public final class C3527v implements C1280f<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$a */
    private static final class C3526a implements C1277s<Bitmap> {
        /* renamed from: a */
        private final Bitmap f14562a;

        /* renamed from: f */
        public void mo1048f() {
        }

        /* renamed from: d */
        public /* synthetic */ Object mo1046d() {
            return m17856a();
        }

        C3526a(Bitmap bitmap) {
            this.f14562a = bitmap;
        }

        /* renamed from: c */
        public Class<Bitmap> mo1045c() {
            return Bitmap.class;
        }

        /* renamed from: a */
        public Bitmap m17856a() {
            return this.f14562a;
        }

        /* renamed from: e */
        public int mo1047e() {
            return C1180j.m4889a(this.f14562a);
        }
    }

    /* renamed from: a */
    public boolean m17863a(Bitmap bitmap, C3452e c3452e) {
        return true;
    }

    /* renamed from: a */
    public C1277s<Bitmap> m17861a(Bitmap bitmap, int i, int i2, C3452e c3452e) {
        return new C3526a(bitmap);
    }
}
