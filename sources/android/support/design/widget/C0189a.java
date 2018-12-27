package android.support.design.widget;

import android.support.v4.view.p019b.C3162a;
import android.support.v4.view.p019b.C3163b;
import android.support.v4.view.p019b.C3164c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.widget.a */
class C0189a {
    /* renamed from: a */
    static final Interpolator f699a = new LinearInterpolator();
    /* renamed from: b */
    static final Interpolator f700b = new C3163b();
    /* renamed from: c */
    static final Interpolator f701c = new C3162a();
    /* renamed from: d */
    static final Interpolator f702d = new C3164c();
    /* renamed from: e */
    static final Interpolator f703e = new DecelerateInterpolator();

    /* renamed from: a */
    static float m669a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static int m670a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
