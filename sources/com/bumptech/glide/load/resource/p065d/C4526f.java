package com.bumptech.glide.load.resource.p065d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.resource.bitmap.C3515d;
import com.bumptech.glide.p055g.C1178i;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.d.f */
public class C4526f implements C3500h<C3536c> {
    /* renamed from: b */
    private final C3500h<Bitmap> f18836b;

    public C4526f(C3500h<Bitmap> c3500h) {
        this.f18836b = (C3500h) C1178i.m4880a((Object) c3500h);
    }

    /* renamed from: a */
    public C1277s<C3536c> mo3903a(Context context, C1277s<C3536c> c1277s, int i, int i2) {
        C3536c c3536c = (C3536c) c1277s.mo1046d();
        C1277s c3515d = new C3515d(c3536c.m17904b(), C1143c.m4768a(context).m4776a());
        context = this.f18836b.mo3903a(context, c3515d, i, i2);
        if (c3515d.equals(context) == 0) {
            c3515d.mo1048f();
        }
        c3536c.m17903a(this.f18836b, (Bitmap) context.mo1046d());
        return c1277s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4526f)) {
            return null;
        }
        return this.f18836b.equals(((C4526f) obj).f18836b);
    }

    public int hashCode() {
        return this.f18836b.hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        this.f18836b.mo950a(messageDigest);
    }
}
