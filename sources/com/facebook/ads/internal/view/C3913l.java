package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.internal.p095n.C1840g;
import com.facebook.ads.internal.p101q.p102a.C1920j;

/* renamed from: com.facebook.ads.internal.view.l */
public class C3913l extends C1840g {
    /* renamed from: a */
    private C2091s f15576a;

    public C3913l(Context context) {
        super(context);
        this.f15576a = new C2091s(context);
        this.f15576a.setScaleType(ScaleType.CENTER_CROP);
        C1920j.m7291a(this.f15576a, C1920j.INTERNAL_AD_MEDIA);
        addView(this.f15576a, new LayoutParams(-1, -1));
    }

    public View getAdContentsView() {
        return this.f15576a;
    }
}
