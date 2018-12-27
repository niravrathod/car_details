package com.cuvora.carinfo.videomodule.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;

public class ExpandableTextView extends AppCompatTextView {
    /* renamed from: b */
    private C1588a f18951b;
    /* renamed from: c */
    private TimeInterpolator f18952c;
    /* renamed from: d */
    private TimeInterpolator f18953d;
    /* renamed from: e */
    private final int f18954e;
    /* renamed from: f */
    private long f18955f;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.ExpandableTextView$a */
    public interface C1588a {
    }

    public ExpandableTextView(Context context) {
        this(context, null);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18955f = 300;
        this.f18954e = getMaxLines();
        this.f18952c = new AccelerateDecelerateInterpolator();
        this.f18953d = new AccelerateDecelerateInterpolator();
    }

    public int getMaxLines() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = -1;
        r1 = android.widget.TextView.class;	 Catch:{ Exception -> 0x0030 }
        r2 = "mMaxMode";	 Catch:{ Exception -> 0x0030 }
        r1 = r1.getField(r2);	 Catch:{ Exception -> 0x0030 }
        r2 = 1;	 Catch:{ Exception -> 0x0030 }
        r1.setAccessible(r2);	 Catch:{ Exception -> 0x0030 }
        r3 = android.widget.TextView.class;	 Catch:{ Exception -> 0x0030 }
        r4 = "mMaximum";	 Catch:{ Exception -> 0x0030 }
        r3 = r3.getField(r4);	 Catch:{ Exception -> 0x0030 }
        r3.setAccessible(r2);	 Catch:{ Exception -> 0x0030 }
        r1 = r1.get(r5);	 Catch:{ Exception -> 0x0030 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0030 }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x0030 }
        r3 = r3.get(r5);	 Catch:{ Exception -> 0x0030 }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x0030 }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x0030 }
        if (r1 != r2) goto L_0x002f;
    L_0x002e:
        r0 = r3;
    L_0x002f:
        return r0;
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.videomodule.ui.ExpandableTextView.getMaxLines():int");
    }

    public void setAnimationDuration(long j) {
        this.f18955f = j;
    }

    public void setOnExpandListener(C1588a c1588a) {
        this.f18951b = c1588a;
    }

    public C1588a getOnExpandListener() {
        return this.f18951b;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f18952c = timeInterpolator;
        this.f18953d = timeInterpolator;
    }

    public void setExpandInterpolator(TimeInterpolator timeInterpolator) {
        this.f18952c = timeInterpolator;
    }

    public TimeInterpolator getExpandInterpolator() {
        return this.f18952c;
    }

    public void setCollapseInterpolator(TimeInterpolator timeInterpolator) {
        this.f18953d = timeInterpolator;
    }

    public TimeInterpolator getCollapseInterpolator() {
        return this.f18953d;
    }
}
