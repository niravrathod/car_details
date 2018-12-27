package com.facebook.ads.internal.view.p108a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.b */
public class C1971b extends ProgressBar {
    /* renamed from: a */
    private static final int f6079a = Color.argb(26, 0, 0, 0);
    /* renamed from: b */
    private static final int f6080b = Color.rgb(88, 144, 255);
    /* renamed from: c */
    private Rect f6081c;
    /* renamed from: d */
    private Paint f6082d;

    public C1971b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7450a();
    }

    /* renamed from: a */
    private void m7450a() {
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(m7451b());
        this.f6081c = new Rect();
        this.f6082d = new Paint();
        this.f6082d.setStyle(Style.FILL);
        this.f6082d.setColor(f6079a);
    }

    /* renamed from: b */
    private Drawable m7451b() {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(f6080b), 3, 1);
        return new LayerDrawable(new Drawable[]{colorDrawable, clipDrawable});
    }

    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.f6081c, this.f6082d);
        super.onDraw(canvas);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6081c.set(0, 0, getMeasuredWidth(), 2);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : Math.max(i, 5));
    }
}
