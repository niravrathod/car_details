package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.q */
public class C2089q extends TextView {
    /* renamed from: a */
    private float f6406a;
    /* renamed from: b */
    private float f6407b = 8.0f;

    public C2089q(Context context) {
        super(context);
        super.setSingleLine();
        super.setMaxLines(1);
        this.f6406a = getTextSize() / C1936w.f5934b;
        setEllipsize(TruncateAt.END);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.f6406a; f >= this.f6407b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.f6406a) {
            this.f6407b = f;
        }
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextSize(float f) {
        this.f6406a = f;
        super.setTextSize(f);
    }
}
