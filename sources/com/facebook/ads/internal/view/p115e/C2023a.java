package com.facebook.ads.internal.view.p115e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.component.C2013a;
import com.facebook.ads.internal.view.component.C2017e;
import com.facebook.ads.internal.view.component.C2020h;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.e.a */
public class C2023a extends LinearLayout {
    /* renamed from: a */
    private static final int f6259a = ((int) (C1936w.f5934b * 12.0f));
    /* renamed from: b */
    private static final int f6260b = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: c */
    private final C2020h f6261c;
    /* renamed from: d */
    private final ImageView f6262d;
    /* renamed from: e */
    private final RelativeLayout f6263e;
    /* renamed from: f */
    private final C2013a f6264f;
    /* renamed from: g */
    private final int f6265g;

    public C2023a(Context context, int i, C1727d c1727d, C1827c c1827c, C1965a c1965a, boolean z, boolean z2, C1958a c1958a, C1933t c1933t) {
        Context context2 = context;
        int i2 = i;
        super(context);
        this.f6265g = i2;
        this.f6262d = new C2017e(context2);
        C1936w.m7328a(this.f6262d, 0);
        C1936w.m7327a(this.f6262d);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, f6259a, 0);
        if (z2) {
            r0.f6262d.setVisibility(8);
        }
        r0.f6261c = new C2020h(context, c1727d, true, z, true);
        r0.f6261c.setAlignment(8388611);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, r0.f6262d.getId());
        layoutParams2.addRule(15);
        C2013a c2013a = r1;
        C2013a c2013a2 = new C2013a(context, true, false, C2041z.REWARDED_VIDEO_AD_CLICK.m7604a(), c1727d, c1827c, c1965a, c1958a, c1933t);
        r0.f6264f = c2013a;
        r0.f6264f.setVisibility(8);
        r0.f6263e = new RelativeLayout(context2);
        C1936w.m7327a(r0.f6263e);
        r0.f6263e.addView(r0.f6262d, layoutParams);
        r0.f6263e.addView(r0.f6261c, layoutParams2);
        addView(r0.f6263e, new LinearLayout.LayoutParams(-2, -2));
        Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C1936w.m7329a(r0, gradientDrawable);
    }

    /* renamed from: a */
    public void m7583a() {
        this.f6264f.setVisibility(0);
    }

    /* renamed from: a */
    public void m7584a(int i) {
        C1936w.m7332b(this.f6264f);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        setOrientation(i2);
        int i3 = -1;
        LayoutParams layoutParams = new LinearLayout.LayoutParams(i2 != 0 ? -1 : 0, -2);
        layoutParams.weight = 1.0f;
        if (i2 == 0) {
            i3 = -2;
        }
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, -2);
        layoutParams2.setMargins(i2 != 0 ? 0 : f6260b, i2 != 0 ? f6260b : 0, 0, 0);
        layoutParams2.gravity = 80;
        this.f6263e.setLayoutParams(layoutParams);
        addView(this.f6264f, layoutParams2);
    }

    public void setInfo(C1736k c1736k) {
        this.f6261c.m7580a(c1736k.m6577b().m6520a(), c1736k.m6577b().m6521b(), false, false);
        this.f6264f.m7577a(c1736k.m6579c(), c1736k.m6583g(), new HashMap());
        new C1991d(this.f6262d).m7500a(this.f6265g, this.f6265g).m7503a(c1736k.m6574a().m6564b());
    }
}
