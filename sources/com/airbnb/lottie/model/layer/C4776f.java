package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p037e.C0961c;

/* renamed from: com.airbnb.lottie.model.layer.f */
public class C4776f extends C4500a {
    /* renamed from: e */
    private final RectF f20877e = new RectF();
    /* renamed from: f */
    private final Paint f20878f = new Paint();
    /* renamed from: g */
    private final float[] f20879g = new float[8];
    /* renamed from: h */
    private final Path f20880h = new Path();
    /* renamed from: i */
    private final Layer f20881i;
    /* renamed from: j */
    private C0922a<ColorFilter, ColorFilter> f20882j;

    C4776f(C0966f c0966f, Layer layer) {
        super(c0966f, layer);
        this.f20881i = layer;
        this.f20878f.setAlpha(0);
        this.f20878f.setStyle(Style.FILL);
        this.f20878f.setColor(layer.m4298p());
    }

    /* renamed from: b */
    public void mo4619b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f20881i.m4298p());
        if (alpha != 0) {
            i = (int) (((((float) i) / 1132396544) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.d.m3999a().mo871e()).intValue())) / 100.0f)) * 1132396544);
            this.f20878f.setAlpha(i);
            if (this.f20882j != null) {
                this.f20878f.setColorFilter((ColorFilter) this.f20882j.mo871e());
            }
            if (i > 0) {
                this.f20879g[0] = null;
                this.f20879g[1] = null;
                this.f20879g[2] = (float) this.f20881i.m4300r();
                this.f20879g[3] = null;
                this.f20879g[4] = (float) this.f20881i.m4300r();
                this.f20879g[5] = (float) this.f20881i.m4299q();
                this.f20879g[6] = null;
                this.f20879g[7] = (float) this.f20881i.m4299q();
                matrix.mapPoints(this.f20879g);
                this.f20880h.reset();
                this.f20880h.moveTo(this.f20879g[0], this.f20879g[1]);
                this.f20880h.lineTo(this.f20879g[2], this.f20879g[3]);
                this.f20880h.lineTo(this.f20879g[4], this.f20879g[5]);
                this.f20880h.lineTo(this.f20879g[6], this.f20879g[7]);
                this.f20880h.lineTo(this.f20879g[0], this.f20879g[1]);
                this.f20880h.close();
                canvas.drawPath(this.f20880h, this.f20878f);
            }
        }
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        super.mo3884a(rectF, matrix);
        this.f20877e.set(0.0f, 0.0f, (float) this.f20881i.m4300r(), (float) this.f20881i.m4299q());
        this.a.mapRect(this.f20877e);
        rectF.set(this.f20877e);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        super.mo3886a((Object) t, (C0961c) c0961c);
        if (t != C0969i.f3234x) {
            return;
        }
        if (c0961c == null) {
            this.f20882j = null;
        } else {
            this.f20882j = new C3296p(c0961c);
        }
    }
}
