package com.facebook.ads.internal.view;

import android.view.View.MeasureSpec;
import android.widget.TextView;

/* renamed from: com.facebook.ads.internal.view.p */
public class C2088p extends TextView {
    /* renamed from: a */
    private int f6403a;
    /* renamed from: b */
    private float f6404b;
    /* renamed from: c */
    private float f6405c;

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.setMaxLines(this.f6403a + 1);
        super.setTextSize(this.f6404b);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), MeasureSpec.makeMeasureSpec(i6, 0));
        if (getMeasuredHeight() > i6) {
            float f = this.f6404b;
            while (f > this.f6405c) {
                f -= 0.5f;
                super.setTextSize(f);
                measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                if (getMeasuredHeight() <= i6 && getLineCount() <= this.f6403a) {
                    break;
                }
            }
        }
        super.setMaxLines(this.f6403a);
        setMeasuredDimension(i5, i6);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
        this.f6403a = i;
        super.setMaxLines(i);
    }

    public void setMinTextSize(float f) {
        this.f6405c = f;
    }

    public void setTextSize(float f) {
        this.f6404b = f;
        super.setTextSize(f);
    }
}
