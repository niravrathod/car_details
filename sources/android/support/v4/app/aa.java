package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class aa implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    private final View f1129a;
    /* renamed from: b */
    private ViewTreeObserver f1130b;
    /* renamed from: c */
    private final Runnable f1131c;

    private aa(View view, Runnable runnable) {
        this.f1129a = view;
        this.f1130b = view.getViewTreeObserver();
        this.f1131c = runnable;
    }

    /* renamed from: a */
    public static aa m1142a(View view, Runnable runnable) {
        aa aaVar = new aa(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(aaVar);
        view.addOnAttachStateChangeListener(aaVar);
        return aaVar;
    }

    public boolean onPreDraw() {
        m1143a();
        this.f1131c.run();
        return true;
    }

    /* renamed from: a */
    public void m1143a() {
        if (this.f1130b.isAlive()) {
            this.f1130b.removeOnPreDrawListener(this);
        } else {
            this.f1129a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1129a.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        this.f1130b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        m1143a();
    }
}
