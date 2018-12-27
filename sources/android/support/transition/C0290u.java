package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.u */
class C0290u {
    /* renamed from: a */
    private static final C0291x f1036a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1036a = new C3093w();
        } else {
            f1036a = new C3092v();
        }
    }

    /* renamed from: a */
    static PropertyValuesHolder m1043a(Property<?, PointF> property, Path path) {
        return f1036a.mo246a(property, path);
    }
}
