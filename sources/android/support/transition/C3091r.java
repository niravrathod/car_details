package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.r */
class C3091r implements C0288s {
    C3091r() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo245a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, null, path);
    }
}
