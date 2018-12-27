package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.component.e */
public class C2017e extends ImageView {
    /* renamed from: a */
    private static final int f6237a = ((int) (C1936w.f5934b * 8.0f));
    /* renamed from: b */
    private final Path f6238b = new Path();
    /* renamed from: c */
    private final RectF f6239c = new RectF();
    /* renamed from: d */
    private int f6240d = f6237a;
    /* renamed from: e */
    private boolean f6241e = false;

    public C2017e(Context context) {
        super(context);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    protected void onDraw(Canvas canvas) {
        this.f6239c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6238b.reset();
        float min = (float) (this.f6241e ? Math.min(getWidth(), getHeight()) / 2 : this.f6240d);
        this.f6238b.addRoundRect(this.f6239c, min, min, Direction.CW);
        canvas.clipPath(this.f6238b);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.f6241e = z;
    }

    public void setRadius(int i) {
        this.f6240d = (int) (((float) i) * C1936w.f5934b);
    }
}
