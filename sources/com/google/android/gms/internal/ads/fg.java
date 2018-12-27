package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;

@zzaer
final class fg extends fi implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f16483a;

    public fg(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f16483a = new WeakReference(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f16483a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m8927b();
        }
    }

    /* renamed from: a */
    protected final void mo1948a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* renamed from: b */
    protected final void mo1949b(ViewTreeObserver viewTreeObserver) {
        zzbv.zzem().mo4958a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }
}
