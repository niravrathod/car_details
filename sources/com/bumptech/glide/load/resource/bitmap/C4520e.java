package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p055g.C1180j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public abstract class C4520e implements C3500h<Bitmap> {
    /* renamed from: a */
    protected abstract Bitmap mo4621a(C1232e c1232e, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C1277s<Bitmap> mo3903a(Context context, C1277s<Bitmap> c1277s, int i, int i2) {
        if (C1180j.m4897a(i, i2)) {
            C1232e a = C1143c.m4768a(context).m4776a();
            Bitmap bitmap = (Bitmap) c1277s.mo1046d();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            i = mo4621a(a, bitmap, i, i2);
            if (bitmap.equals(i) != 0) {
                return c1277s;
            }
            return C3515d.m17802a(i, a);
        }
        c1277s = new StringBuilder();
        c1277s.append("Cannot apply transformation on width: ");
        c1277s.append(i);
        c1277s.append(" or height: ");
        c1277s.append(i2);
        c1277s.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(c1277s.toString());
    }
}
