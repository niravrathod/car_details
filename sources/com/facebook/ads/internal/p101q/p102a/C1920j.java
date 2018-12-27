package com.facebook.ads.internal.p101q.p102a;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.facebook.ads.internal.q.a.j */
public enum C1920j {
    INTERNAL_NO_TAG(0),
    INTERNAL_NO_CLICK(1),
    INTERNAL_API_TOO_LOW(2),
    INTERNAL_WRONG_TAG_CLASS(3),
    INTERNAL_NULL_VIEW(4),
    INTERNAL_AD_ICON(5),
    INTERNAL_AD_TITLE(6),
    INTERNAL_AD_COVER_IMAGE(7),
    INTERNAL_AD_SUBTITLE(8),
    INTERNAL_AD_BODY(9),
    INTERNAL_AD_CALL_TO_ACTION(10),
    INTERNAL_AD_SOCIAL_CONTEXT(11),
    INTERNAL_AD_CHOICES_ICON(12),
    INTERNAL_AD_MEDIA(13);
    
    /* renamed from: o */
    public static int f5893o;
    /* renamed from: p */
    private final int f5895p;

    static {
        f5893o = -1593835521;
    }

    private C1920j(int i) {
        this.f5895p = i;
    }

    /* renamed from: a */
    public static void m7291a(View view, C1920j c1920j) {
        if (view != null && c1920j != null && VERSION.SDK_INT > 4) {
            view.setTag(f5893o, c1920j);
        }
    }

    /* renamed from: a */
    public int m7292a() {
        return this.f5895p;
    }
}
