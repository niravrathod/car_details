package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.p */
class C0287p {
    /* renamed from: a */
    private static final C0288s f1029a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1029a = new C3091r();
        } else {
            f1029a = new C3090q();
        }
    }

    /* renamed from: a */
    static <T> ObjectAnimator m1039a(T t, Property<T, PointF> property, Path path) {
        return f1029a.mo245a(t, property, path);
    }
}
