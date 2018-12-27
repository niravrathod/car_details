package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.engine.p060a.C3457f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
final class C1286l {
    /* renamed from: a */
    private static final C1232e f4064a = new C45211();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$1 */
    class C45211 extends C3457f {
        /* renamed from: a */
        public void mo1005a(Bitmap bitmap) {
        }

        C45211() {
        }
    }

    /* renamed from: a */
    static C1277s<Bitmap> m5203a(C1232e c1232e, Drawable drawable, int i, int i2) {
        drawable = drawable.getCurrent();
        Object obj = null;
        if (drawable instanceof BitmapDrawable) {
            drawable = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable instanceof Animatable) {
            drawable = null;
        } else {
            drawable = C1286l.m5204b(c1232e, drawable, i, i2);
            obj = 1;
        }
        if (obj == null) {
            c1232e = f4064a;
        }
        return C3515d.m17802a(drawable, c1232e);
    }

    /* renamed from: b */
    private static Bitmap m5204b(C1232e c1232e, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5) != null) {
                i = new StringBuilder();
                i.append("Unable to draw ");
                i.append(drawable);
                i.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w("DrawableToBitmap", i.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C1289u.m5213a();
            a.lock();
            c1232e = c1232e.mo1002a(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c1232e);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return c1232e;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5) != null) {
                i = new StringBuilder();
                i.append("Unable to draw ");
                i.append(drawable);
                i.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", i.toString());
            }
            return null;
        }
    }
}
