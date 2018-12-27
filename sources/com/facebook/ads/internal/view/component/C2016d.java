package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.p009a.C0299a;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.component.d */
public class C2016d extends LinearLayout {
    /* renamed from: a */
    private final int f6232a;
    /* renamed from: b */
    private final int f6233b;
    /* renamed from: c */
    private final int f6234c;
    /* renamed from: d */
    private int f6235d = -1;
    /* renamed from: e */
    private List<GradientDrawable> f6236e;

    public C2016d(Context context, C1727d c1727d, int i) {
        super(context);
        setOrientation(0);
        setGravity(17);
        float f = C1936w.f5934b;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.f6234c = (int) (f * 1.0f);
        this.f6232a = c1727d.m6524a(false);
        this.f6233b = C0299a.m1070b(this.f6232a, 128);
        this.f6236e = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.f6234c, 0);
            View imageView = new ImageView(context);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.f6236e.add(gradientDrawable);
            addView(imageView);
        }
        m7579a(0);
    }

    /* renamed from: a */
    public void m7579a(int i) {
        if (this.f6235d != i) {
            this.f6235d = i;
            for (int i2 = 0; i2 < this.f6236e.size(); i2++) {
                int i3;
                int i4;
                if (i2 == i) {
                    i3 = this.f6232a;
                    i4 = this.f6232a;
                } else {
                    i3 = this.f6233b;
                    i4 = 0;
                }
                ((GradientDrawable) this.f6236e.get(i2)).setStroke(this.f6234c, i4);
                ((GradientDrawable) this.f6236e.get(i2)).setColor(i3);
                ((GradientDrawable) this.f6236e.get(i2)).invalidateSelf();
            }
        }
    }
}
