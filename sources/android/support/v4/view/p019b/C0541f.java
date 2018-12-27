package android.support.v4.view.p019b;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.b.f */
public final class C0541f {
    /* renamed from: a */
    public static Interpolator m2025a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C0540e(f, f2, f3, f4);
    }
}
