package com.facebook.ads.internal.view.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class CircularProgressView extends View {
    /* renamed from: a */
    private final float f6176a = (Resources.getSystem().getDisplayMetrics().density * 3.0f);
    /* renamed from: b */
    private final RectF f6177b = new RectF();
    /* renamed from: c */
    private final Paint f6178c = new Paint(1);
    /* renamed from: d */
    private final Paint f6179d;
    /* renamed from: e */
    private float f6180e = 0.0f;

    public CircularProgressView(Context context) {
        super(context);
        this.f6178c.setStyle(Style.STROKE);
        this.f6178c.setStrokeWidth(this.f6176a);
        this.f6179d = new Paint(1);
        this.f6179d.setStyle(Style.STROKE);
        this.f6179d.setStrokeWidth(this.f6176a);
    }

    /* renamed from: a */
    public void m7522a(int i, int i2) {
        this.f6178c.setColor(i);
        this.f6179d.setColor(i2);
    }

    @Keep
    public float getProgress() {
        return this.f6180e;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f6177b, 0.0f, 360.0f, false, this.f6178c);
        canvas.drawArc(this.f6177b, -90.0f, (this.f6180e * 360.0f) / 100.0f, false, this.f6179d);
    }

    protected void onMeasure(int i, int i2) {
        i = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(i, i);
        float f = (float) i;
        this.f6177b.set(((this.f6176a / 2.0f) + 0.0f) + ((float) getPaddingLeft()), ((this.f6176a / 2.0f) + 0.0f) + ((float) getPaddingTop()), (f - (this.f6176a / 2.0f)) - ((float) getPaddingRight()), (f - (this.f6176a / 2.0f)) - ((float) getPaddingBottom()));
    }

    @Keep
    public void setProgress(float f) {
        this.f6180e = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", new float[]{f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
