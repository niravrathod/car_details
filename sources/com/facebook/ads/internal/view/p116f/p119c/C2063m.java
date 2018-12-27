package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.Button;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.f.c.m */
public class C2063m extends Button {
    /* renamed from: a */
    private final Path f6367a;
    /* renamed from: b */
    private final Path f6368b;
    /* renamed from: c */
    private final Paint f6369c;
    /* renamed from: d */
    private final Path f6370d;
    /* renamed from: e */
    private boolean f6371e;

    public C2063m(Context context) {
        this(context, false);
    }

    public C2063m(Context context, final boolean z) {
        super(context);
        this.f6371e = false;
        this.f6367a = new Path();
        this.f6368b = new Path();
        this.f6370d = new Path();
        this.f6369c = new Paint(this) {
            /* renamed from: b */
            final /* synthetic */ C2063m f6366b;
        };
        setClickable(true);
        C1936w.m7328a((View) this, 0);
    }

    protected void onDraw(Canvas canvas) {
        Path path;
        if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = ((float) Math.max(canvas.getWidth(), canvas.getHeight())) / 100.0f;
        float f;
        float f2;
        if (this.f6371e) {
            this.f6370d.rewind();
            f = 26.5f * max;
            f2 = 15.5f * max;
            this.f6370d.moveTo(f, f2);
            this.f6370d.lineTo(f, 84.5f * max);
            this.f6370d.lineTo(90.0f * max, max * 50.0f);
            this.f6370d.lineTo(f, f2);
            this.f6370d.close();
            path = this.f6370d;
        } else {
            this.f6367a.rewind();
            f = 29.0f * max;
            f2 = 21.0f * max;
            this.f6367a.moveTo(f, f2);
            float f3 = 79.0f * max;
            this.f6367a.lineTo(f, f3);
            float f4 = 45.0f * max;
            this.f6367a.lineTo(f4, f3);
            this.f6367a.lineTo(f4, f2);
            this.f6367a.lineTo(f, f2);
            this.f6367a.close();
            this.f6368b.rewind();
            f = 55.0f * max;
            this.f6368b.moveTo(f, f2);
            this.f6368b.lineTo(f, f3);
            max *= 71.0f;
            this.f6368b.lineTo(max, f3);
            this.f6368b.lineTo(max, f2);
            this.f6368b.lineTo(f, f2);
            this.f6368b.close();
            canvas.drawPath(this.f6367a, this.f6369c);
            path = this.f6368b;
        }
        canvas.drawPath(path, this.f6369c);
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.f6371e = z;
        refreshDrawableState();
        invalidate();
    }
}
