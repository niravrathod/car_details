package com.google.android.youtube.player.internal;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: com.google.android.youtube.player.internal.n */
public final class C2543n extends FrameLayout {
    /* renamed from: a */
    private final ProgressBar f10882a;
    /* renamed from: b */
    private final TextView f10883b;

    public C2543n(Context context) {
        super(context, null, ab.m12471c(context));
        C2547r c2547r = new C2547r(context);
        setBackgroundColor(-16777216);
        this.f10882a = new ProgressBar(context);
        this.f10882a.setVisibility(8);
        addView(this.f10882a, new LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        this.f10883b = new TextView(context);
        this.f10883b.setTextAppearance(context, 16973894);
        this.f10883b.setTextColor(-1);
        this.f10883b.setVisibility(8);
        this.f10883b.setPadding(i, i, i, i);
        this.f10883b.setGravity(17);
        this.f10883b.setText(c2547r.f10884a);
        addView(this.f10883b, new LayoutParams(-2, -2, 17));
    }

    /* renamed from: a */
    public final void m12543a() {
        this.f10882a.setVisibility(8);
        this.f10883b.setVisibility(8);
    }

    /* renamed from: b */
    public final void m12544b() {
        this.f10882a.setVisibility(0);
        this.f10883b.setVisibility(8);
    }

    /* renamed from: c */
    public final void m12545c() {
        this.f10882a.setVisibility(8);
        this.f10883b.setVisibility(0);
    }

    protected final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode != 1073741824) {
                if (mode != Integer.MIN_VALUE || mode2 != 0) {
                    float f;
                    if (mode2 != 1073741824) {
                        if (mode2 != Integer.MIN_VALUE || mode != 0) {
                            if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                                f = (float) size2;
                                float f2 = ((float) size) / 1.777f;
                                if (f < f2) {
                                    size = (int) (f * 1.777f);
                                } else {
                                    size2 = (int) f2;
                                }
                            } else {
                                size = 0;
                                size2 = 0;
                            }
                        }
                    }
                    f = (float) size2;
                    size = (int) (f * 1.777f);
                }
            }
            size2 = (int) (((float) size) / 1.777f);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(C2543n.resolveSize(size, i), 1073741824), MeasureSpec.makeMeasureSpec(C2543n.resolveSize(size2, i2), 1073741824));
    }
}
