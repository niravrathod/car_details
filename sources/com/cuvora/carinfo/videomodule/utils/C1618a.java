package com.cuvora.carinfo.videomodule.utils;

import com.feedbox.C2109c;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.utils.a */
public final class C1618a {
    /* renamed from: a */
    public static final C1617a f4866a = new C1617a();

    /* renamed from: com.cuvora.carinfo.videomodule.utils.a$a */
    public static final class C1617a {
        private C1617a() {
        }

        /* renamed from: a */
        public final void m6192a(AdView adView) {
            C2885g.m13910b(adView, "adView");
            if (C2109c.f6446a.m7674a().m7656c()) {
                adView.loadAd(new Builder().build());
            }
        }
    }
}
