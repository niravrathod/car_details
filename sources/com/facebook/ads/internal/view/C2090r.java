package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.internal.view.r */
public class C2090r extends RelativeLayout {
    /* renamed from: a */
    private int f6408a = 0;
    /* renamed from: b */
    private int f6409b = 0;

    public C2090r(Context context) {
        super(context);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6409b > 0 && getMeasuredWidth() > this.f6409b) {
            i = this.f6409b;
        } else if (getMeasuredWidth() < this.f6408a) {
            i = this.f6408a;
        } else {
            return;
        }
        setMeasuredDimension(i, getMeasuredHeight());
    }

    public void setMaxWidth(int i) {
        this.f6409b = i;
    }

    public void setMinWidth(int i) {
        this.f6408a = i;
    }
}
