package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@zzaer
abstract class fi {
    /* renamed from: a */
    private final WeakReference<View> f8053a;

    public fi(View view) {
        this.f8053a = new WeakReference(view);
    }

    /* renamed from: a */
    protected abstract void mo1948a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    protected abstract void mo1949b(ViewTreeObserver viewTreeObserver);

    /* renamed from: a */
    public final void m8925a() {
        ViewTreeObserver c = m8924c();
        if (c != null) {
            mo1948a(c);
        }
    }

    /* renamed from: b */
    public final void m8927b() {
        ViewTreeObserver c = m8924c();
        if (c != null) {
            mo1949b(c);
        }
    }

    /* renamed from: c */
    private final ViewTreeObserver m8924c() {
        View view = (View) this.f8053a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                return viewTreeObserver;
            }
        }
        return null;
    }
}
