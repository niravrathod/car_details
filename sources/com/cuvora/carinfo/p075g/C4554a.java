package com.cuvora.carinfo.p075g;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.views.C1688b;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

/* renamed from: com.cuvora.carinfo.g.a */
public class C4554a extends C3666b {
    /* renamed from: o */
    private AdView f18888o = C1688b.m6369a((Activity) this.n, this.n.getResources().getString(R.string.home_page_medium_banner));
    /* renamed from: p */
    private LinearLayout f18889p = ((LinearLayout) this.a.findViewById(R.id.ll_smart_ad));
    /* renamed from: q */
    private UnifiedNativeAdView f18890q;

    /* renamed from: y */
    public void mo1439y() {
    }

    public C4554a(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.view_banner_ad);
        View e = C1533a.m5797e(this.n);
        this.f18890q = (UnifiedNativeAdView) e.findViewById(R.id.unified_native_adview);
        this.f18889p.addView(C1688b.m6371b((Activity) this.n, this.f18888o, this.n.getResources().getString(R.string.home_screen_native_ad), e.findViewById(R.id.ivDistractView), e, this.f18890q));
    }
}
