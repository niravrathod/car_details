package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;

/* renamed from: com.airbnb.lottie.model.layer.c */
public class C4773c extends C4500a {
    /* renamed from: e */
    private final Paint f20872e = new Paint(3);
    /* renamed from: f */
    private final Rect f20873f = new Rect();
    /* renamed from: g */
    private final Rect f20874g = new Rect();
    /* renamed from: h */
    private C0922a<ColorFilter, ColorFilter> f20875h;

    C4773c(C0966f c0966f, Layer layer) {
        super(c0966f, layer);
    }

    /* renamed from: b */
    public void mo4619b(Canvas canvas, Matrix matrix, int i) {
        Bitmap f = m27698f();
        if (f != null) {
            if (!f.isRecycled()) {
                float a = C0954f.m4101a();
                this.f20872e.setAlpha(i);
                if (this.f20875h != 0) {
                    this.f20872e.setColorFilter((ColorFilter) this.f20875h.mo871e());
                }
                canvas.save();
                canvas.concat(matrix);
                this.f20873f.set(0, 0, f.getWidth(), f.getHeight());
                this.f20874g.set(0, 0, (int) (((float) f.getWidth()) * a), (int) (((float) f.getHeight()) * a));
                canvas.drawBitmap(f, this.f20873f, this.f20874g, this.f20872e);
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        super.mo3884a(rectF, matrix);
        matrix = m27698f();
        if (matrix != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) matrix.getWidth()), Math.min(rectF.bottom, (float) matrix.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    /* renamed from: f */
    private Bitmap m27698f() {
        return this.b.m4176b(this.c.m4289g());
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        super.mo3886a((Object) t, (C0961c) c0961c);
        if (t != C0969i.f3234x) {
            return;
        }
        if (c0961c == null) {
            this.f20875h = null;
        } else {
            this.f20875h = new C3296p(c0961c);
        }
    }
}
