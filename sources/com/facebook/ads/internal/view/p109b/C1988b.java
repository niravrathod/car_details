package com.facebook.ads.internal.view.p109b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.internal.p101q.p102a.C1920j;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.b.b */
public class C1988b extends FrameLayout {
    /* renamed from: a */
    private final ImageView f6123a;
    /* renamed from: b */
    private int f6124b;
    /* renamed from: c */
    private int f6125c;

    public C1988b(Context context) {
        super(context);
        this.f6123a = new ImageView(context);
        m7484a();
    }

    public C1988b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6123a = new ImageView(context, attributeSet);
        m7484a();
    }

    public C1988b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6123a = new ImageView(context, attributeSet, i);
        m7484a();
    }

    /* renamed from: a */
    private void m7484a() {
        this.f6123a.setScaleType(ScaleType.FIT_XY);
        addView(this.f6123a, new LayoutParams(-2, -2));
        C1920j.m7291a(this.f6123a, C1920j.INTERNAL_AD_MEDIA);
    }

    /* renamed from: a */
    public void m7485a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            C1936w.m7329a((View) this, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            C1936w.m7328a((View) this, 0);
        }
        if (bitmap != null) {
            this.f6124b = bitmap.getWidth();
            this.f6125c = bitmap.getHeight();
            this.f6123a.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.f6123a.setImageDrawable(null);
    }

    public ImageView getBodyImageView() {
        return this.f6123a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f6124b > 0) {
            if (this.f6125c > 0) {
                float min = Math.min(((float) i5) / ((float) this.f6124b), ((float) i6) / ((float) this.f6125c));
                i3 = (int) (((float) this.f6124b) * min);
                i += i5 / 2;
                i2 += i6 / 2;
                i3 /= 2;
                int i7 = ((int) (min * ((float) this.f6125c))) / 2;
                this.f6123a.layout(i - i3, i2 - i7, i + i3, i2 + i7);
                return;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
