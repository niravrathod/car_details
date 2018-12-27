package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@zzaer
final class fh extends fi implements OnScrollChangedListener {
    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f16484a;

    public fh(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f16484a = new WeakReference(onScrollChangedListener);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f16484a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m8927b();
        }
    }

    /* renamed from: a */
    protected final void mo1948a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* renamed from: b */
    protected final void mo1949b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
