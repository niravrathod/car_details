package com.facebook.ads.internal.view.p115e;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.component.C2018f;
import com.facebook.ads.internal.view.p109b.C1991d;

/* renamed from: com.facebook.ads.internal.view.e.d */
class C3855d extends C2018f {
    /* renamed from: a */
    private final ImageView f15381a;

    public C3855d(Context context) {
        super(context);
        this.f15381a = new ImageView(context);
        this.f15381a.setAdjustViewBounds(true);
        addView(this.f15381a, new LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void m19219a(String str) {
        C1991d c1991d = new C1991d(this.f15381a);
        c1991d.m7499a();
        c1991d.m7503a(str);
    }
}
