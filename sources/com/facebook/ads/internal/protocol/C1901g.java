package com.facebook.ads.internal.protocol;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p101q.p102a.C1918h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.protocol.g */
public class C1901g {
    /* renamed from: a */
    private static final Map<C1899e, C1900f> f5831a = new HashMap();

    static {
        f5831a.put(C1899e.RECTANGLE_HEIGHT_250, C1900f.WEBVIEW_BANNER_250);
        f5831a.put(C1899e.BANNER_HEIGHT_90, C1900f.WEBVIEW_BANNER_90);
        f5831a.put(C1899e.BANNER_HEIGHT_50, C1900f.WEBVIEW_BANNER_50);
    }

    /* renamed from: a */
    public static C1900f m7241a(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return C1918h.m7284a(i, i2) ? C1900f.WEBVIEW_INTERSTITIAL_TABLET : i2 > i ? C1900f.WEBVIEW_INTERSTITIAL_VERTICAL : C1900f.WEBVIEW_INTERSTITIAL_HORIZONTAL;
    }

    /* renamed from: a */
    public static C1900f m7242a(C1899e c1899e) {
        C1900f c1900f = (C1900f) f5831a.get(c1899e);
        return c1900f == null ? C1900f.WEBVIEW_BANNER_LEGACY : c1900f;
    }

    /* renamed from: a */
    public static void m7243a(DisplayMetrics displayMetrics, View view, C1899e c1899e) {
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= c1899e.m7238a() ? displayMetrics.widthPixels : (int) Math.ceil((double) (((float) c1899e.m7238a()) * displayMetrics.density)), (int) Math.ceil((double) (((float) c1899e.m7239b()) * displayMetrics.density)));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
