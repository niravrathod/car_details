package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzasg;
import java.util.ArrayList;
import java.util.List;

public final class zzbx extends ViewSwitcher {
    /* renamed from: a */
    private final zzamj f7818a;
    /* renamed from: b */
    private final zzanz f7819b;
    /* renamed from: c */
    private boolean f7820c = true;

    public zzbx(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f7818a = new zzamj(context);
        this.f7818a.m9888a(str);
        this.f7818a.m9891b(str2);
        if ((context instanceof Activity) != null) {
            this.f7819b = new zzanz((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f7819b = new zzanz(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f7819b.m9947a();
    }

    public final zzamj zzfq() {
        return this.f7818a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7820c) {
            this.f7818a.m9887a(motionEvent);
        }
        return null;
    }

    public final void removeAllViews() {
        int i;
        List arrayList = new ArrayList();
        int i2 = 0;
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzasg)) {
                arrayList.add((zzasg) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = (ArrayList) arrayList;
        i = arrayList2.size();
        while (i2 < i) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((zzasg) obj).destroy();
        }
    }

    public final void zzfr() {
        zzalg.m21225a("Disable position monitoring on adFrame.");
        if (this.f7819b != null) {
            this.f7819b.m9949b();
        }
    }

    public final void zzfs() {
        zzalg.m21225a("Enable debug gesture detector on adFrame.");
        this.f7820c = true;
    }

    public final void zzft() {
        zzalg.m21225a("Disable debug gesture detector on adFrame.");
        this.f7820c = false;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7819b != null) {
            this.f7819b.m9950c();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7819b != null) {
            this.f7819b.m9951d();
        }
    }
}
