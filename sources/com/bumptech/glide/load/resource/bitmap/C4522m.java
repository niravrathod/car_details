package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.C1277s;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public class C4522m implements C3500h<Drawable> {
    /* renamed from: b */
    private final C3500h<Bitmap> f18834b;
    /* renamed from: c */
    private final boolean f18835c;

    /* renamed from: a */
    public C3500h<BitmapDrawable> m24977a() {
        return this;
    }

    public C4522m(C3500h<Bitmap> c3500h, boolean z) {
        this.f18834b = c3500h;
        this.f18835c = z;
    }

    /* renamed from: a */
    public C1277s<Drawable> mo3903a(Context context, C1277s<Drawable> c1277s, int i, int i2) {
        Drawable drawable = (Drawable) c1277s.mo1046d();
        C1277s a = C1286l.m5203a(C1143c.m4768a(context).m4776a(), drawable, i, i2);
        if (a != null) {
            i = this.f18834b.mo3903a(context, a, i, i2);
            if (i.equals(a) == 0) {
                return m24975a(context, i);
            }
            i.mo1048f();
            return c1277s;
        } else if (this.f18835c == null) {
            return c1277s;
        } else {
            c1277s = new StringBuilder();
            c1277s.append("Unable to convert ");
            c1277s.append(drawable);
            c1277s.append(" to a Bitmap");
            throw new IllegalArgumentException(c1277s.toString());
        }
    }

    /* renamed from: a */
    private C1277s<Drawable> m24975a(Context context, C1277s<Bitmap> c1277s) {
        return C3522q.m17839a(context.getResources(), c1277s);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4522m)) {
            return null;
        }
        return this.f18834b.equals(((C4522m) obj).f18834b);
    }

    public int hashCode() {
        return this.f18834b.hashCode();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        this.f18834b.mo950a(messageDigest);
    }
}
