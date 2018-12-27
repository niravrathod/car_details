package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzamj;

@zzaer
@VisibleForTesting
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
final class C2409c extends RelativeLayout {
    @VisibleForTesting
    /* renamed from: a */
    boolean f7702a;
    @VisibleForTesting
    /* renamed from: b */
    private zzamj f7703b;

    public C2409c(Context context, String str, String str2) {
        super(context);
        this.f7703b = new zzamj(context, str);
        this.f7703b.m9891b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f7702a) {
            this.f7703b.m9887a(motionEvent);
        }
        return null;
    }
}
